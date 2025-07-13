package appiumfactory.utilities;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class DragAndDrop extends BasePage {

    public DragAndDrop() {
        super();
    }

    public void dragAndDrop(By locator, int x, int y) {
        System.out.println(locator + " was dragged and dropped");
        WebElement source = AndroidDriverManager.getAndroidDriver().findElement(locator);
        ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) source).getId(),
                "endX", x,
                "endY", y
        ));
    }

}
