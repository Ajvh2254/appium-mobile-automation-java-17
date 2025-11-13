package basetests;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.driver.AppiumDriverManager;
import org.testng.annotations.Test;

public class BaseTodoTests {

    @Test
    public void launchDriver() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createTodoDriver();
        AndroidDriverManager.quitAndroidDriver();
        AppiumDriverManager.stopAppium();
    }

}
