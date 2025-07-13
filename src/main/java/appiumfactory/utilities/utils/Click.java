package appiumfactory.utilities.utils;

import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.utilities.AndroidWaiterUtils;
import org.openqa.selenium.By;

public class Click {

    public void androidClick(By locator) {
        System.out.println("Clicking on element: " + locator);
        try {
            AndroidWaiterUtils androidWaiterUtils = new AndroidWaiterUtils();
            androidWaiterUtils.waitForElementToBeClickable(locator);
            AndroidDriverManager.getAndroidDriver().findElement(locator).click();
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }
}
