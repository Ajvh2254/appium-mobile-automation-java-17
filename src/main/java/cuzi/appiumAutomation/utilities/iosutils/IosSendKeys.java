package cuzi.appiumAutomation.utilities.iosutils;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class IosSendKeys {

    private static IOSDriver iosDriver;

    public IosSendKeys(IOSDriver driver) {
        iosDriver = driver;
        System.out.println("IosScroll - Ios Driver initialized: " + System.identityHashCode(iosDriver));
    }

    public void sendKeys(By locator, String text) {
        iosDriver.findElement(locator).sendKeys(text);
    }

}
