package cuzi.appiumAutomation.driver;

import cuzi.appiumAutomation.config.Config;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

public class IosDriverManager {

    private static IOSDriver iosdriver;
    private static XCUITestOptions xcuiTestOptions;

    public static void createIosDriver() {
        try {
            setIosDriver(new IOSDriver(new URI("http://localhost:4723").toURL(), uiKitCapabilities()));
            System.out.println("Initiating ios driver, add capabilities and install app");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        setDriverTimeout();
    }

    public static void quitIosDriver() {
        iosdriver.quit();
        System.out.println("Quitting ios driver");
    }

    public static IOSDriver getIosDriver() {
        if (iosdriver == null) {
            throw new RuntimeException("IOS Driver is null");
        }
        return iosdriver;
    }

    private static void setDriverTimeout() {
        iosdriver.manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
    }

    private static void setIosDriver(final IOSDriver iosDriver) {
        IosDriverManager.iosdriver = iosDriver;
    }

    private static XCUITestOptions uiKitCapabilities() {
        return xcuiTestOptions = new XCUITestOptions()
                .setDeviceName("iPhone 16 Plus")
                .setPlatformVersion("18.6")
                .setApp(Config.IOS_UIKIT_PATH)
                .setAutomationName(AutomationName.IOS_XCUI_TEST)
                .setDerivedDataPath("/tmp/wda-dd")
                .setBundleId("com.example.apple-samplecode.UICatalog")
                .setWdaLaunchTimeout(Duration.ofSeconds(30))
                .setNoReset(false);
    }

}
