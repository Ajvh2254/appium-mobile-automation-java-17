package basetests;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.driver.AppiumDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseAndroidTests {

    @BeforeMethod
    public void initiateAppium() {
        AppiumDriverManager.startAppium();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AndroidDriverManager.createAndroidDriver();
    }

    @AfterMethod
    public void tearDown() {
        AppiumDriverManager.stopAppium();
        AndroidDriverManager.quitAndroidDriver();
    }

}
