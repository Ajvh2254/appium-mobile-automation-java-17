package appiumfactory.utilities;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.driver.IosDriverManager;
import appiumfactory.utilities.androidutils.AndroidWaiter;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class Click extends BasePage {

    public Click() {
        super();
    }

    public void androidClick(By locator) {
        try {
            AndroidWaiter.waitForElementToBeClickable(locator);
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

    public void androidLongClick(By locator, int milliseconds) {
        try {
            AndroidWaiter.waitForElementToBeClickable(locator);
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

    public static void iosClick(By locator) {
        try {
            IosWaiter.waitForElementToBeClickable(locator);
            IosDriverManager.getIosDriver().findElement(locator).click();
            System.out.println("Clicked on element: " + locator);
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public static void iosLongClick(By locator, int milliseconds) {
        try {
            IosWaiter.waitForElementToBeClickable(locator);
            WebElement element = IosDriverManager.getIosDriver().findElement(locator);
            Map<String, Object> params = new HashMap<>();
            params.put("element", ((RemoteWebElement)element).getId());
            params.put("duration", milliseconds);
            IosDriverManager.getIosDriver().executeScript("mobile: touchAndHold", params);
            System.out.println("Long pressed element: " + locator);
        } catch (Exception e) {
            System.out.println("Failed to long press element: " + locator);
            e.printStackTrace();
        }
    }

}
