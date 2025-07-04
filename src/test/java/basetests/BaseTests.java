package basetests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTests {

    public AndroidDriver driver;
    public AppiumDriverLocalService appiumService;
    public UiAutomator2Options uiAutomator2Options;

    @BeforeMethod
    public void startAppium() {
        appiumService = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/bin/appium"))
                .withIPAddress("127.0.0.1")
                .usingPort(4273)
                .build();
        appiumService.start();
        appiumService.clearOutPutStreams();

        uiAutomator2Options.setDeviceName("Pixel_8_Pro");
        uiAutomator2Options.setApp("apps/ApiDemos-debug.apk");
//        uiAutomator2Options.setApp("apps/General-Store.apk");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiAutomator2Options);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        appiumService.stop();
    }

}
