package appiumfactory.utilities.iosutils;

import appiumfactory.base.BaseIosPage;
import appiumfactory.utilities.IosWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class IosClick extends BaseIosPage {

    public static void iosClick(By locator) {
        try {
            IosWaiter.waitForElementToBeClickable(locator);
            iosDriver.findElement(locator).click();
            System.out.println("Clicked on element: " + locator);
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public static void iosLongClick(By locator, int milliseconds) {
        try {
            IosWaiter.waitForElementToBeClickable(locator);
            WebElement element = iosDriver.findElement(locator);
            Map<String, Object> params = new HashMap<>();
            params.put("element", ((RemoteWebElement)element).getId());
            params.put("duration", milliseconds);
            iosDriver.executeScript("mobile: touchAndHold", params);
            System.out.println("Long pressed element: " + locator);
        } catch (Exception e) {
            System.out.println("Failed to long press element: " + locator);
            e.printStackTrace();
        }
    }

}
