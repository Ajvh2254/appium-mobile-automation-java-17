package cuzi.appiumAutomation.utilities.iosutils;

import cuzi.appiumAutomation.utilities.waiterutils.IosWaiter;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class IosClick {

    private static IOSDriver iosDriver;
    private final IosWaiter iosWait;

    public IosClick(IOSDriver driver) {
        iosDriver = driver;
        this.iosWait = new IosWaiter(driver);
    }

    public void click(By locator) {
        try {
            iosWait.waitForElementToBeClickable(locator);
            iosDriver.findElement(locator).click();
            System.out.println("Clicked on element: " + locator);
        } catch (Exception e) {
            System.out.println("Failed to click on element: " + locator);
            e.printStackTrace();
        }
    }

    public void longClick(By locator, int milliseconds) {
        try {
            iosWait.waitForElementToBeClickable(locator);
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
