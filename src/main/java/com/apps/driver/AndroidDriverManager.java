package com.apps.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.IOException;

public class AndroidDriverManager {

    private static final ThreadLocal<AndroidDriver> DRIVER = new ThreadLocal<>();
    private UiAutomator2Options uiAutomator2Options;

    public void createAndroidDriver() {
    }

    public static void autoEmulatorStart() {
    }

    public static void clean() {
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

    public static String getConsoleOutput() {
        return "";
    }

    public static void verifyADBConnection() {
    }

    public static void resetADB() {
    }

    public static AndroidDriver getAndroidDriver() {
        return AndroidDriverManager.DRIVER.get();
    }

    private static void setDriver(AndroidDriver driver) {
    }

    private static void setDriverTimeouts() {
    }

    private UiAutomator2Options APIDemosCapabilities() {
        return uiAutomator2Options = new UiAutomator2Options();
    }

    private UiAutomator2Options GeneralStoreCapabilities() {
        return uiAutomator2Options = new UiAutomator2Options();
    }

    public static void quitAndroidDriver() {
        DRIVER.get().quit();
    }

}
