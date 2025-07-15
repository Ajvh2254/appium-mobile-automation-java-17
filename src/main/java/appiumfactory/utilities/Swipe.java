package appiumfactory.utilities;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class Swipe extends BasePage {

    public void swipe(By locator) {
        System.out.println("Swipes to new image: " + locator);
        WebElement element = AndroidDriverManager.getAndroidDriver().findElement(locator);
        ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                "mobile: swipeGesture", ImmutableMap.of(
                        "elementId", ((RemoteWebElement)element).getId(),
                        "direction", "left",
                        "percent", 0.25
                ));
    }

}
