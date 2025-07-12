package basetests;

import appiumfactory.driver.AppiumDriverManager;
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
    }

}
