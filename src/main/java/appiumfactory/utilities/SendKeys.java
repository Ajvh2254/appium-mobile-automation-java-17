package appiumfactory.utilities;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.driver.IosDriverManager;
import org.openqa.selenium.By;

public class SendKeys {

    public static void androidSendKeys(By locator, String text) {
        AndroidDriverManager.getAndroidDriver().findElement(locator).sendKeys(text);
    }

    public static void iosSendKeys(By locator, String text) {
        IosDriverManager.getIosDriver().findElement(locator).sendKeys(text);
    }

}
