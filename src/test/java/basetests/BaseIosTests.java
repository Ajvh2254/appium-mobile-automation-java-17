package basetests;

import appiumfactory.driver.AppiumDriverManager;
import appiumfactory.driver.IosDriverManager;
import appiumfactory.utilities.Sleep;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseIosTests {

    @BeforeMethod
    public void initiateIos() {
        AppiumDriverManager.startAppium();
        Sleep.sleep(20000);
        IosDriverManager.createIosDriver();
    }

    @AfterMethod
    public void tearDown() {
        AppiumDriverManager.stopAppium();
        IosDriverManager.quitIosDriver();
    }

}
