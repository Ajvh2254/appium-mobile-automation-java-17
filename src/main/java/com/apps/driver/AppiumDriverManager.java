package com.apps.driver;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AppiumDriverManager {

    private static AppiumDriverLocalService appiumService = null;

    public static void startAppium() {
    }

    public static boolean appiumExists() {
        return appiumService != null;
    }

    private static void killAppiumPort() {
    }

    public static void stopAppium() {
    }

}
