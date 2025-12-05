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
public class DragAndDrop extends BaseAndroidPage {

    public DragAndDrop() {
        super();
    }

    public void dragAndDrop(By locator, int x, int y) {
        WebElement source = AndroidDriverManager.getAndroidDriver().findElement(locator);
        ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) source).getId(),
                "endX", x,
                "endY", y
        ));
        log.info("{} was dragged and dropped", locator);
    }

}
