package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.utilities.waiterutils.AndroidWaiter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

@Log4j2
public class AndroidIsDisplayed extends BaseAndroidPage {

    public AndroidIsDisplayed() {
        super();
    }

    public boolean isElementDisplayed(By locator) {
        try {
            AndroidWaiter.waitForVisibilityOfElement(locator);
            log.info("{} is visible", locator);
            return true;
        } catch (Exception e) {
            log.info("{} is not visible", locator);
            return false;
        }
    }

    public boolean isElementNotDisplayed(By locator) {
        try {
            AndroidWaiter.waitForInvisibilityOfElement(locator);
            log.info("{} is not visible", locator);
            return true;
        } catch (NoSuchElementException e) {
            log.info("{} not found, treating as not visible", locator);
            return true;
        } catch (Exception e) {
            log.info("{} is visible", locator);
            return false;
        }
    }

}
