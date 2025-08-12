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

}
