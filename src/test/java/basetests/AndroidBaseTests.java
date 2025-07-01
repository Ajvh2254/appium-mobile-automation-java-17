package basetests;

import com.apps.driver.AndroidDriverManager;
import com.apps.driver.AppiumDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AndroidBaseTests {

    @BeforeMethod
    public void initiateDriver() {
        AppiumDriverManager.startAppium();
        AndroidDriverManager.createAndroidDriver();
    }

    @AfterMethod
    public void tearDown() {
        AppiumDriverManager.stopAppium();
    }

}
