package basetests;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.driver.AppiumDriverManager;
import appiumfactory.utilities.Sleep;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseGeneralStoreTests {

    @BeforeMethod
    public void initiateGeneralStore() {
        AppiumDriverManager.startAppium();
        Sleep.sleep(20000);
        AndroidDriverManager.createGeneralStoreDriver();
    }

    @AfterMethod
    public void tearDown() {
        AppiumDriverManager.stopAppium();
        AndroidDriverManager.quitAndroidDriver();
    }

}
