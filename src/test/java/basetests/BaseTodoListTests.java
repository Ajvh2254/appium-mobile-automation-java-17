package basetests;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.driver.AppiumDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTodoListTests {

    @BeforeMethod
    public void initiateTodoList() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createTodoListDriver();
    }

    @AfterMethod
    public void tearDown() {
        AndroidDriverManager.quitAndroidDriver();
        AppiumDriverManager.stopAppium();
    }

}
