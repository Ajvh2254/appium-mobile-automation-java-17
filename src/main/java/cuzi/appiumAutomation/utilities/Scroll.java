package cuzi.appiumAutomation.utilities;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.driver.IosDriverManager;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class Scroll extends BaseAndroidPage {

    public Scroll() {
        super();
    }

    public void androidScroll() {
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                    "mobile: scrollGesture", ImmutableMap.of(
                            "left", 100, "top", 100, "width", 200, "height", 200,
                            "direction", "down",
                            "percent", 1.0
                    ));
        System.out.println("Scrolled down page");
        } while (canScrollMore);
    }

    public void scrollIntoView(String text) {
        AndroidDriverManager.getAndroidDriver().findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ text +"\"));"
        ));
        System.out.println("Scrolled " + text + " into view");
    }

    public static void iosScroll(By locator) {
        WebElement element = IosDriverManager.getIosDriver().findElement(locator);
        Map<String, Object> params = new HashMap<>();
        params.put("element", ((RemoteWebElement)element).getId());
        params.put("direction", "down");
        IosDriverManager.getIosDriver().executeScript("mobile: scroll", params);
    }

}
