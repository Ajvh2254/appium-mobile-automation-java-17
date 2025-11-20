package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.driver.AndroidDriverManager;
import org.openqa.selenium.By;

public class AndroidIsTextDisplayed {

    public static String getText(By locator) {
        System.out.println("Getting text from element: " + locator);
        String element = AndroidDriverManager.getAndroidDriver().findElement(locator).getText();
        System.out.println("Text is: " + element);
        return element;
    }

}
