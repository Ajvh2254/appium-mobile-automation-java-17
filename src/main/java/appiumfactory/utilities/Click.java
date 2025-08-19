package appiumfactory.utilities;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class Click extends BasePage {

    public Click() {
        super();
    }

    public void androidClick(By locator) {
        try {
            androidWaiter.waitForElementToBeClickable(locator);
            AndroidDriverManager.getAndroidDriver().findElement(locator).click();
            System.out.println("Clicked on element: " + locator);
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public void mobileClick(By locator) {
        try {
            WebElement element = AndroidDriverManager.getAndroidDriver().findElement(locator);
            ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                    "mobile: clickGesture", ImmutableMap.of(
                            "elementId", ((RemoteWebElement) element).getId()
                    ));
            System.out.println("Clicked on element: " + locator + " with mobile click gesture");
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public void longClick(By locator, int milliseconds) {
        try {
            androidWaiter.waitForElementToBeClickable(locator);
            WebElement element = AndroidDriverManager.getAndroidDriver().findElement(locator);
            ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                    "mobile: longClickGesture", ImmutableMap.of(
                            "elementId", ((RemoteWebElement) element).getId(),
                            "duration", milliseconds));
            System.out.println("Long pressed element: " + locator);
        } catch (Exception e) {
            System.out.println("Failed to long press element: " + locator);
            e.printStackTrace();
        }
    }

}
