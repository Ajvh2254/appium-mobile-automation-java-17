package cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidIsTextDisplayed;
import cuzi.appiumAutomation.utilities.waiterutils.AndroidWaiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TutorialPage extends BaseAndroidPage {

    public String isWelcomeTextDisplayed() {
        By welcomeHeader = By.xpath("//*[@text='Welcome!']");
        // Using "current node" represented with an asterisk Example: //*[]
        return AndroidIsTextDisplayed.getText(welcomeHeader);
    }

    public boolean isAdvertisingTextDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath(
                "//*[@text='Welcome to your privacy friendly To-Do list. This app contains no tracking or advertising.']"));
        return true;
    }

    public boolean isSkipBtnDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.id("org.secuso.privacyfriendlytodolist:id/btn_skip"));
        return true;
    }

    public void isPageIndicatorDisplayed() {
        By pageIndicator = By.xpath("//android.widget.TextView[@text='•']");
        List<WebElement> pageIndicators = AndroidDriverManager.getAndroidDriver().findElements(pageIndicator);
        for (int i = 0; i < pageIndicators.size(); i++) {
            androidIsDisplayed.isElementDisplayed(pageIndicator);
        }
    }

    public boolean isNextBtnClickable() {
        By nextBtn = By.id("org.secuso.privacyfriendlytodolist:id/btn_next");
        try {
            AndroidWaiter.waitForElementToBeClickable(nextBtn);
            System.out.println(nextBtn + " is clickable");
            return true;
        } catch (Exception e) {
            System.out.println(nextBtn + " is not clickable");
            return false;
        }
    }

}
