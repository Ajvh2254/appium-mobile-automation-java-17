package cuzi.appiumAutomation.utilities.iosutils;

import cuzi.appiumAutomation.driver.IosDriverManager;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class IosScroll {

    private static IOSDriver iosDriver;

    public IosScroll(IOSDriver driver) {
        iosDriver = driver;
        System.out.println("IosScroll = Ios Driver initialized: " + System.identityHashCode(iosDriver));
    }

    public void scroll(By locator) {
        WebElement element = IosDriverManager.getIosDriver().findElement(locator);
        Map<String, Object> params = new HashMap<>();
        params.put("element", ((RemoteWebElement)element).getId());
        params.put("direction", "down");
        iosDriver.executeScript("mobile: scroll", params);
    }

}
