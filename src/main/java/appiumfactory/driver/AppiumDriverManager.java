package appiumfactory.driver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppiumDriverManager {

    private static AppiumDriverLocalService appiumService = null;

    public static void startAppium() {
        killAppiumPort();
        appiumService = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/bin/appium"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();

        appiumService.start();
        appiumService.clearOutPutStreams();
    }

    public static void stopAppium() {
        if (appiumExists()) {
            System.out.println("Stopping Appium service");
            appiumService.stop();
        }
    }

    private static boolean appiumExists() {
        return appiumService != null;
    }

    private static void killAppiumPort() {
        try {
            Process process = Runtime.getRuntime().exec("lsof -i :4723");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains("appium")) {
                    String[] parts = line.split("\\s+");
                    String pid = parts[1];
                    Runtime.getRuntime().exec("kill -9 " + pid);
                    System.out.println("Killed Appium process with PID: " + pid);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
