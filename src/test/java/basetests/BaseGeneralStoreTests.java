package basetests;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.driver.AppiumDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseGeneralStoreTests {

    @BeforeMethod
    public void initiateGeneralStore() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createGeneralStoreDriver();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        AndroidDriverManager.quitAndroidDriver();
        AppiumDriverManager.stopAppium();
    }

}
