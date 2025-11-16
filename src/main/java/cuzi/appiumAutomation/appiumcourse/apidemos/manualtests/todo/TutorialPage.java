package cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TutorialPage extends BaseAndroidPage {

    public TutorialPage isWelcomeTextDisplayed() {
        String welcomeHeader = AndroidDriverManager.getAndroidDriver().findElement(By.xpath(
                "//android.widget.TextView[@text='Welcome!']")).getText();
        Assert.assertEquals(welcomeHeader, "Welcome!");
        return this;
    }



    public TutorialPage isAdvertisingTextDisplayed() {
        boolean advertisingText = androidIsDisplayed.isElementDisplayed(By.xpath(
                "//android.widget.TextView[@text='Welcome to your privacy friendly To-Do list. This app contains no tracking or advertising.']"));
        Assert.assertTrue(advertisingText);
        return this;
    }

    public TutorialPage isSkipBtnDisplayed() {
        boolean skipBtn = androidIsDisplayed.isElementDisplayed(By.id(
                "org.secuso.privacyfriendlytodolist:id/btn_skip"));
        Assert.assertTrue(skipBtn);
        return this;
    }

    public TutorialPage isPageIndicatorDisplayed() {
        By pageIndicator = By.xpath("//android.widget.TextView[@text='•']");
        List<WebElement> pageIndicators = AndroidDriverManager.getAndroidDriver().findElements(pageIndicator);
        for (int i = 0; i < pageIndicators.size(); i++) {
            androidIsDisplayed.isElementDisplayed(pageIndicator);
        }
        return this;
    }

    public void isNextBtnDisplayed() {
        boolean nextBtn = androidIsDisplayed.isElementDisplayed(By.id(
                "org.secuso.privacyfriendlytodolist:id/btn_next"));
        Assert.assertTrue(nextBtn);
    }

}
