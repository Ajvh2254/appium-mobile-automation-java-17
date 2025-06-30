package com.apps.driver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class IosDriverManager {

    private static final ThreadLocal<IOSDriver> IOS_DRIVER = new ThreadLocal<>();
    private static XCUITestOptions xcuiTestOptions;

    public static void createIosDriver() {
    }

    public static IOSDriver getIosDriver() {
        return IosDriverManager.IOS_DRIVER.get();
    }

    private static void setIosDriver(final IOSDriver iosDriver) {
    }

    private static XCUITestOptions uikitCapabilities() {
        return xcuiTestOptions;
    }

    public static void quitIosDriver() {
        IOS_DRIVER.get().quit();
    }

}
