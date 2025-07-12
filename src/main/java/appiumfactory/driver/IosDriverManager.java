package appiumfactory.driver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosDriverManager {

    private static final ThreadLocal<IOSDriver> IOS_DRIVER = new ThreadLocal<>();
    private static XCUITestOptions xcuiTestOptions;

    public static void createIosDriver() {
        try {
            System.out.println("Initiating ios driver, add capabilities and install app");
            setIosDriver(new IOSDriver(new URL("http://localhost:4723"), uiKitCapabilities()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quitIosDriver() {
        getIosDriver().quit();
    }

    public static IOSDriver getIosDriver() {
        return IosDriverManager.IOS_DRIVER.get();
    }

    private static void setIosDriver(final IOSDriver iosDriver) {
        IosDriverManager.IOS_DRIVER.set(iosDriver);
    }

    private static XCUITestOptions uiKitCapabilities() {
        return xcuiTestOptions = new XCUITestOptions()
                .setDeviceName("iPhone 16 Plus")
                .setPlatformVersion("18.5")
                .setApp("/Users/anthonyhenderson/Downloads/iosApps/UIKitCatalog.app")
                .setBundleId("com.example.apple-samplecode.UICatalog")
                .setAutomationName("XCuiTest")
                .setWdaLaunchTimeout(Duration.ofSeconds(20));
    }

}
