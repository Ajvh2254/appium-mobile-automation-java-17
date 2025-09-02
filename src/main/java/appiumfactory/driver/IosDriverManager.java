package appiumfactory.driver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosDriverManager {

    private static IOSDriver iosdriver;
    private static XCUITestOptions xcuiTestOptions;

    public static void createIosDriver() {
        try {
            setIosDriver(new IOSDriver(new URL("http://localhost:4723"), uiKitCapabilities()));
            System.out.println("Initiating ios driver, add capabilities and install app");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quitIosDriver() {
        iosdriver.quit();
    }

    public static IOSDriver getIosDriver() {
        if (iosdriver == null) {
            throw new RuntimeException("Driver is null");
        }
        return iosdriver;
    }

    private static void setIosDriver(final IOSDriver iosDriver) {
        IosDriverManager.iosdriver = iosDriver;
    }

    private static XCUITestOptions uiKitCapabilities() {
        return xcuiTestOptions = new XCUITestOptions()
                .setDeviceName("iPhone 16 Plus")
                .setPlatformVersion("18.6")
                .setApp("/Users/cuzi/IOS_Apps/UIKitCatalog.app")
                .setAutomationName("XCuiTest")
                .setWdaLaunchTimeout(Duration.ofSeconds(60));
    }

}
