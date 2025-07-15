package appiumtests.androidtests;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.driver.AppiumDriverManager;
import appiumfactory.utilities.Sleep;
import org.testng.annotations.Test;

public class DriverTests {

    @Test
    public void test() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createAPIDemosDriver();
        Sleep.sleep(10000);
        AppiumDriverManager.stopAppium();
        AndroidDriverManager.quitAndroidDriver();
    }

}
