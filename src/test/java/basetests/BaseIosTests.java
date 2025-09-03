package basetests;

import cuzi.appiumAutomation.driver.AppiumDriverManager;
import cuzi.appiumAutomation.driver.IosDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseIosTests {

    @BeforeMethod
    public void initiateIos() {
        AppiumDriverManager.startAppium();
        IosDriverManager.createIosDriver();
    }

    @AfterMethod
    public void tearDown() {
        IosDriverManager.quitIosDriver();
        AppiumDriverManager.stopAppium();
    }

}
