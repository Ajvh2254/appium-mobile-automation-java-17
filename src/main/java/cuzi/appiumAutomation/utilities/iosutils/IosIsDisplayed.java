package cuzi.appiumAutomation.utilities.iosutils;

import cuzi.appiumAutomation.utilities.waiterutils.IosWaiter;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class IosIsDisplayed {

    private final IosWaiter iosWaiter;

    public IosIsDisplayed(IOSDriver driver) {
        this.iosWaiter = new IosWaiter(driver);
    }

    public boolean isElementDisplayed(By selector) {
        try {
            iosWaiter.waitForVisibilityOfElement(selector);
            System.out.println(selector + " is visible");
            return true;
        } catch (Exception e) {
            System.out.println(selector + " is not visible");
            return false;
        }
    }


}
