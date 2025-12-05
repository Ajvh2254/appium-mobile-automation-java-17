package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.waiterutils.AndroidWaiter;
import com.google.common.collect.ImmutableMap;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

@Log4j2
public class AndroidClick extends BaseAndroidPage {

    public AndroidClick() {
        super();
    }

    public void click(By locator) {
        try {
            AndroidWaiter.waitForElementToBeClickable(locator);
            AndroidDriverManager.getAndroidDriver().findElement(locator).click();
            log.info("Clicked on element: {}", locator);
        } catch (Exception e) {
            log.info("Failed to click on element: {}", locator);
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
            log.info("Mobile clicked on element: {}", locator);
        } catch (Exception e) {
            log.info("Failed to mobile click on element: {}", locator);
            e.printStackTrace();
        }
    }

    public void longClick(By locator, int milliseconds) {
        try {
            AndroidWaiter.waitForElementToBeClickable(locator);
            WebElement element = AndroidDriverManager.getAndroidDriver().findElement(locator);
            ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                    "mobile: longClickGesture", ImmutableMap.of(
                            "elementId", ((RemoteWebElement) element).getId(),
                            "duration", milliseconds));
            log.info("Long pressed element: {}", locator);
        } catch (Exception e) {
            log.info("Failed to long press element: {}", locator);
            e.printStackTrace();
        }
    }

}
