package cuzi.appiumAutomation.utilities;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import org.openqa.selenium.By;

public class SendKeys {

    public static void sendKeys(By locator, String text) {
        AndroidDriverManager.getAndroidDriver().findElement(locator).sendKeys(text);
    }

}
