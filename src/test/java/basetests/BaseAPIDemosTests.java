package basetests;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.driver.AppiumDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseAPIDemosTests {

    @BeforeMethod
    public void initiateApiDemos() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createAPIDemosDriver();
    }

    @AfterMethod
    public void tearDown() {
        AndroidDriverManager.quitAndroidDriver();
        AppiumDriverManager.stopAppium();
    }

}
