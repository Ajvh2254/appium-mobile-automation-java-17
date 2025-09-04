package cuzi.appiumAutomation.appiumcourse.apidemos.manualtests;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccessibilityPage extends BaseAndroidPage {

    public AccessibilityPage() {
        super();
    }

    public AccessibilityPage isAPIDemosHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='API Demos']"));
        return this;
    }

    public AccessibilityPage isAPIDemosIconsDisplayed() {
        List<WebElement> apiDemosIcons = AndroidDriverManager.getAndroidDriver()
                .findElements(By.id("android:id/text1"));
        for (int i = 0; i < apiDemosIcons.size(); i++) {
            androidIsDisplayed.isElementDisplayed(By.id("android:id/text1"));
        }
        return this;
    }

    public AccessibilityPage clickAccessibilityPageBtn() {
        androidClick.click(AppiumBy.accessibilityId("Access'ibility"));
        return this;
    }

    public AccessibilityPage pressAndroidBackKey() {
        pressKey.pressBackKey();
        return this;
    }

    public AccessibilityPage clickNodeProviderBtn() {
        androidClick.click(AppiumBy.accessibilityId("Accessibility Node Provider"));
        return this;
    }

    public AccessibilityPage isNodeProviderHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Accessibility Node Provider']"));
        return this;
    }

    public AccessibilityPage clickNodeQueryingBtn() {
        androidClick.click(AppiumBy.accessibilityId("Accessibility Node Querying"));
        return this;
    }

    public AccessibilityPage isNodeQueryHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Accessibility Node Querying']"));
        return this;
    }

    public AccessibilityPage clickServiceBtn() {
        androidClick.click(AppiumBy.accessibilityId("Accessibility Service"));
        return this;
    }

    public AccessibilityPage isServiceHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Accessibility Service']"));
        return this;
    }

    public AccessibilityPage clickCustomViewBtn() {
        androidClick.click(AppiumBy.accessibilityId("Custom View"));
        return this;
    }

    public void isCustomViewHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Accessibility/Custom View']"));
    }

}
