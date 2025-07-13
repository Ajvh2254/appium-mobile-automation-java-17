package appiumfactory.utilities.utils;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class Click extends BasePage {

    public void androidClick(By locator) {
        System.out.println("Clicking on element: " + locator);
        try {
            androidWaiter.waitForElementToBeClickable(locator);
            AndroidDriverManager.getAndroidDriver().findElement(locator).click();
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public void mobileClick(By locator) {
        System.out.println("Clicking on element: " + locator + " with mobile click gesture");
        try {
            WebElement element = AndroidDriverManager.getAndroidDriver().findElement(locator);
            ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                    "mobile: clickGesture", ImmutableMap.of(
                            "elementId", ((RemoteWebElement) element).getId()
                    ));
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public void longClick(By locator, int milliseconds) {
        System.out.println("Long presses element: " + locator);
        try {
            androidWaiter.waitForElementToBeClickable(locator);
            WebElement element = AndroidDriverManager.getAndroidDriver().findElement(locator);
            ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                    "mobile: longClickGesture", ImmutableMap.of(
                            "elementId", ((RemoteWebElement) element).getId(),
                            "duration", milliseconds));
        } catch (Exception e) {
            System.out.println("Failed to long press element: " + locator);
            e.printStackTrace();
        }
    }

}
