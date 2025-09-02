package appiumfactory.utilities;

import appiumfactory.base.BaseAndroidPage;
import appiumfactory.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

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
        System.out.println(locator + " was dragged and dropped");
    }

}
