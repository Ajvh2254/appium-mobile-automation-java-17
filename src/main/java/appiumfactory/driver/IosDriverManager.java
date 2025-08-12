package appiumfactory.driver;

import appiumfactory.base.BasePage;
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
            setIosDriver(new IOSDriver(new URL("http://localhost:4723"), uiKitCapabilities()));
            System.out.println("Initiating ios driver, add capabilities and install app");
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
        BasePage.initializeUtilities();
    }

    private static XCUITestOptions uiKitCapabilities() {
        return xcuiTestOptions = new XCUITestOptions()
                .setDeviceName("iPhone 16 Pro")
                .setPlatformVersion("18.6")
                .setApp("apps/UIKitCatalog.app")
                .setBundleId("com.example.apple-samplecode.UIKitCatalog")
                .setAutomationName("XCuiTest")
                .setWdaLaunchTimeout(Duration.ofSeconds(60));
    }

}
