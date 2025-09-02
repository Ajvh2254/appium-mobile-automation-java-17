package appiumfactory.driver;

import appiumfactory.base.BaseAndroidPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AndroidDriverManager {

    private static final ThreadLocal<AndroidDriver> DRIVER = new ThreadLocal<>();
    private static UiAutomator2Options uiAutomator2Options;

    public static void createAPIDemosDriver() {
        try {
            setAndroidDriver(new AndroidDriver(new URL("http://localhost:4723"), androidApiDemosCapabilities()));
            System.out.println("Initiating android driver, add capabilities and install app");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        setDriverTimeout();
    }

    public static void createGeneralStoreDriver() {
        try {
            setAndroidDriver(new AndroidDriver(new URL("http://localhost:4723"), generalStoreCapabilities()));
            System.out.println("Initiating android driver, add capabilities and install app");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void quitAndroidDriver() {
        getAndroidDriver().quit();
    }

    public static AndroidDriver getAndroidDriver() {
        return AndroidDriverManager.DRIVER.get();
    }

    private static void setAndroidDriver(AndroidDriver driver) {
        AndroidDriverManager.DRIVER.set(driver);
        BaseAndroidPage.initializeUtilities();
    }

    private static void setDriverTimeout() {
        getAndroidDriver().manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));
    }

    private static UiAutomator2Options androidApiDemosCapabilities() {
        return uiAutomator2Options = new UiAutomator2Options()
                .setAvd("Pixel_8_Pro")
                .setApp("apps/ApiDemos-debug.apk")
                .setAppActivity("io.appium.android.apis.ApiDemos")
                .setAppPackage("io.appium.android.apis")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setAutoGrantPermissions(true)
                .setAvdLaunchTimeout(Duration.ofSeconds(60))
                .setAvdReadyTimeout(Duration.ofSeconds(60))
                .setNoReset(false);
    }

    private static UiAutomator2Options generalStoreCapabilities() {
        return uiAutomator2Options = new UiAutomator2Options()
                .setDeviceName("Pixel_8_Pro")
                .setApp("apps/General-Store.apk");
    }

}
