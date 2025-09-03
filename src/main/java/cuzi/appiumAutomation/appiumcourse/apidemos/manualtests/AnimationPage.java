package cuzi.appiumAutomation.appiumcourse.apidemos.manualtests;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.waiterutils.AndroidWaiter;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AnimationPage extends BaseAndroidPage {

    public AnimationPage isAPIDemosHeaderDisplayed() {
        String apiDemos = AndroidDriverManager.getAndroidDriver().findElement(
                By.xpath("//android.widget.TextView[@text='API Demos']")).getText();
        Assert.assertEquals(apiDemos, "API Demos");
        return this;
    }

    public AnimationPage clickAnimationBtn() {
        click.click(AppiumBy.accessibilityId("Animation"));
        return this;
    }

    public AnimationPage isAPIDemosTitleDisplayed() {
        boolean apiDemos = isDisplayed.isElementDisplayed(
                By.xpath("//android.widget.TextView[@text='API Demos']"));
        Assert.assertTrue(apiDemos);
        return this;
    }

    public AnimationPage selectPageBtn(String btn) {
        click.click(AppiumBy.accessibilityId(btn));
        return this;
    }

    public AnimationPage isPageTitleDisplayed(String logo) {
        boolean bbTitle = isDisplayed.isElementDisplayed(
                By.xpath("//android.widget.TextView[@text='" + logo + "']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(bbTitle, "Page logo is not displayed");
        softAssert.assertAll();
        return this;
    }

    public AnimationPage pressAndroidBackKey() {
        pressKey.pressBackKey();
        return this;
    }

    public AnimationPage isCloningBtnFocusable() {
        WebElement cloningBtn = AndroidDriverManager.getAndroidDriver().findElement(
                AppiumBy.accessibilityId("Cloning"));
        Assert.assertEquals(cloningBtn.getDomAttribute("focusable"), "false");
        return this;
    }

    public AnimationPage isCloningBtnClickable() {
        AndroidWaiter.waitForElementToBeClickable(AppiumBy.accessibilityId("Cloning"));
        return this;
    }

    public AnimationPage isPlayBtnSelectable() {
        boolean evaluatorTitle = AndroidDriverManager.getAndroidDriver().findElement(
                By.xpath("//android.widget.TextView[@text='Animation/Custom Evaluator']")).isSelected();
        Assert.assertFalse(evaluatorTitle);
        return this;
    }

    public AnimationPage isAddBtnClickable() {
        boolean addBtn = AndroidDriverManager.getAndroidDriver().findElement(
                AppiumBy.accessibilityId("Add Button")).isEnabled();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(addBtn);
        softAssert.assertAll();
        return this;
    }

}
