package basetests;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.driver.AppiumDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseGeneralStoreTests {

    @BeforeMethod
    public void initiateGeneralStore() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createGeneralStoreDriver();
    }

    @AfterMethod
    public void tearDown() {
        AndroidDriverManager.quitAndroidDriver();
        AppiumDriverManager.stopAppium();
    }

}
