package basetests;

import appiumfactory.driver.AppiumDriverManager;
import appiumfactory.driver.IosDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseIosTests {

    @BeforeMethod
    public void initiateIos() {
        AppiumDriverManager.startAppium();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        IosDriverManager.createIosDriver();
    }

    @AfterMethod
    public void tearDown() {
        AppiumDriverManager.stopAppium();
        IosDriverManager.quitIosDriver();
    }

}
