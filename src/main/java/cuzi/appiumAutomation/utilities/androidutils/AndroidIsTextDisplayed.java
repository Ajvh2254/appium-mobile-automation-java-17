package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class AndroidIsTextDisplayed {

    public static String getText(By locator) {
        String element = AndroidDriverManager.getAndroidDriver().findElement(locator).getText();
        log.info("Text is: {}", element);
        return element;
    }

}
