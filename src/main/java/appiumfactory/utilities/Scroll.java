package appiumfactory.utilities;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll extends BasePage {

    public Scroll() {
        super();
    }

    public void scroll() {
        System.out.println("Scrolls down page");
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) AndroidDriverManager.getAndroidDriver()).executeScript(
                    "mobile: scrollGesture", ImmutableMap.of(
                            "left", 100, "top", 100, "width", 200, "height", 200,
                            "direction", "down",
                            "percent", 1.0
                    ));
        } while (canScrollMore);
    }

    public void scrollIntoView(String text) {
        System.out.println("Scrolls " + text + " into view");
        AndroidDriverManager.getAndroidDriver().findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ text +"\"));"
        ));
    }

}
