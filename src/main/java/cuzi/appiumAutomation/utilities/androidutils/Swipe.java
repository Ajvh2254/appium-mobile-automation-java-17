package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

@Log4j2
public class Swipe extends BaseAndroidPage {

    public void swipe(By locator) {
        WebElement element = AndroidDriverManager.getAndroidDriver().findElement(locator);
        ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                "mobile: swipeGesture", ImmutableMap.of(
                        "elementId", ((RemoteWebElement)element).getId(),
                        "direction", "left",
                        "percent", 0.25
                ));
        log.info("Swiped to new image: {}", locator);
    }

}
