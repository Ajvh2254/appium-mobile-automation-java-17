package cuzi.appiumAutomation.utilities.iosutils;

import cuzi.appiumAutomation.utilities.waiterutils.IosWaiter;
import io.appium.java_client.ios.IOSDriver;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

@Log4j2
public class IosIsDisplayed {

    private final IosWaiter iosWaiter;

    public IosIsDisplayed(IOSDriver driver) {
        this.iosWaiter = new IosWaiter(driver);
    }

    public boolean isElementDisplayed(By selector) {
        try {
            iosWaiter.waitForVisibilityOfElement(selector);
            log.info("{} is visible", selector);
            return true;
        } catch (Exception e) {
            log.info( "{} is not visible", selector);
            return false;
        }
    }


}
