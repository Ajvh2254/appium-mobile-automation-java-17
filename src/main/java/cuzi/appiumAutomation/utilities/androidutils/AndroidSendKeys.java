package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class AndroidSendKeys {

    public static void sendKeys(By locator, String text) {
        AndroidDriverManager.getAndroidDriver().findElement(locator).sendKeys(text);
        log.info("Typing text: {} into {}", text, locator);
    }

}
