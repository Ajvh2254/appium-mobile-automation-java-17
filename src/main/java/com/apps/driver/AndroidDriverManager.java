package com.apps.driver;

import com.apps.config.Config;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

public class AndroidDriverManager {

    private static final ThreadLocal<AndroidDriver> DRIVER = new ThreadLocal<>();
    private static UiAutomator2Options uiAutomator2Options;

    public static void createAndroidDriver() {
        try {
            if (Config.AUTO_EMULATOR_START) {
                resetADB();
                autoEmulatorStart();
            }
            setDriver(new AndroidDriver(new URL("http://localhost:4723"), APIDemosCapabilities()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void autoEmulatorStart() {
        int retries = 1;
        while (retries >= 0) {
            Process start = executeTerminalCommand("emulator", "-avd", "Pixel_8_Pro");
            try {
                String startOutput = Executors.newSingleThreadExecutor()
                        .submit(() -> getConsoleOutput(start, "INFO    | boot", 2))
                        .get(180, TimeUnit.SECONDS);
                System.out.println(startOutput);
                verifyADBConnection();
            } catch (TimeoutException e) {
                retries--;
                System.out.println("Emulator did not start " + 180 + " seconds. Tried to start it again");
            } catch (ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }

    public static void clean() {
        executeTerminalCommand("adb", "kill-server");
        executeTerminalCommand("killall", "qemu-system-aarch64");
    }

    public static Process executeTerminalCommand(String... args) {
        String command = String.join(" ", args);
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return process;
    }

    public static String getConsoleOutput(Process process, String query, Integer limiter) {
        String output = "";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
            output = reader.lines()
                    .peek(System.out::println)
                    .filter(s -> s.contains(query)).limit((limiter > 0) ? limiter : Integer.MAX_VALUE)
                    .collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static void verifyADBConnection() {
        try {
            Process process = Runtime.getRuntime().exec("adb devices");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String output = reader.lines().collect(Collectors.joining("\n"));
            if (!output.contains("emulator")) {
                throw new RuntimeException("ADB is not connected to the emulator");
            }
            System.out.println("ADB connection verified.");
        } catch (IOException e) {
            throw new RuntimeException("Failed to verify ADB connection: " + e.getMessage(), e);
        }
    }

    public static void resetADB() {
        try {
            executeTerminalCommand("adb", "kill-server");
            System.out.println("ADB server killed");

            executeTerminalCommand("killall", "adb");
            System.out.println("All ADB processes terminated");

            executeTerminalCommand("adb", "startserver");
            System.out.println("ADB server restarted successfully");
        } catch (Exception e) {
            System.err.println("Error resetting ADB: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static AndroidDriver getAndroidDriver() {
        return AndroidDriverManager.DRIVER.get();
    }

    private static void setDriver(AndroidDriver driver) {
        AndroidDriverManager.DRIVER.set(driver);
    }

    private static void setDriverTimeouts() {
//        getAndroidDriver().manage()
//                .timeouts()
//                .implicitlyWait(Duration.ofSeconds(10));
    }

    private static UiAutomator2Options APIDemosCapabilities() {
        return uiAutomator2Options = new UiAutomator2Options()
                .setAvd("Pixel_8_Pro")
                .setApp("apps/ApiDemos-debug.apk")
                .setAppActivity("io.appium.android.apis.ApiDemos")
                .setAppPackage("io.appium.android.apis")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setAutoGrantPermissions(true)
                .setAvdLaunchTimeout(Duration.ofSeconds(20))
                .setAvdReadyTimeout(Duration.ofSeconds(20))
                .setNoReset(false);
    }

    private UiAutomator2Options GeneralStoreCapabilities() {
        return uiAutomator2Options = new UiAutomator2Options()
                .setAvd("Pixel_8_Pro")
                .setApp("apps/General-Store.apk")
//                .setAppActivity("io.appium.android.apis.ApiDemos")
                .setAppPackage("io.appium.android.apis")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setAutoGrantPermissions(true)
                .setAvdLaunchTimeout(Duration.ofSeconds(20))
                .setAvdReadyTimeout(Duration.ofSeconds(20))
                .setNoReset(false);
    }

    public static void quitAndroidDriver() {
//        DRIVER.get().quit();
    }

}
