package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import org.openqa.selenium.By;

public class AndroidSendKeys {

    public static void sendKeys(By locator, String text) {
        AndroidDriverManager.getAndroidDriver().findElement(locator).sendKeys(text);
    }

}
