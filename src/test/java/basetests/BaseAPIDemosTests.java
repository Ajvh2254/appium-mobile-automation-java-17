package basetests;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.driver.AppiumDriverManager;
import appiumfactory.utilities.Sleep;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseAPIDemosTests {

    @BeforeMethod
    public void initiateApiDemos() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createAPIDemosDriver();
        Sleep.sleep(10000);
    }

    @AfterMethod
    public void tearDown() {
        AppiumDriverManager.stopAppium();
        AndroidDriverManager.quitAndroidDriver();
    }

}
