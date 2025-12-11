package cuzi.appiumAutomation.appiumcourse.manualtests.todo;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidIsTextDisplayed;
import cuzi.appiumAutomation.utilities.waiterutils.AndroidWaiter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class TutorialPage extends BaseAndroidPage {

    By nextBtn = By.id("org.secuso.privacyfriendlytodolist:id/btn_next");

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
            log.info("{} is clickable", nextBtn);
            return true;
        } catch (Exception e) {
            log.info(nextBtn + " is not clickable");
            return false;
        }
    }

    public void clickNextBtn() {
        androidClick.click(nextBtn);
    }

    public String isListsHeaderDisplayed() {
        By listsHeader = By.xpath("//*[@text='Lists']");
        return AndroidIsTextDisplayed.getText(listsHeader);
    }

    public boolean isListsTextDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath(
                "//android.widget.TextView[@text='You can manage your tasks in labeled To-Do lists.']"));
        return true;
    }

    public boolean isReminderHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath("//android.widget.TextView[@text='Reminder']"));
        return true;
    }

    public String isReminderTextDisplayed() {
        By reminderText = By.xpath(
                "//android.widget.TextView[@text='You can define deadlines and reminders for your tasks.']");
        return AndroidIsTextDisplayed.getText(reminderText);
    }

    public String isEverythingHeaderDisplayed() {
        By everythingHeader = By.xpath("//android.widget.TextView[@text='Everything is important']");
        return AndroidIsTextDisplayed.getText(everythingHeader);
    }

    public boolean isEverythingTextDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath(
                "//android.widget.TextView[@text='You can add subtasks and the progress of their main task. Progress can be set manually or automatically by the number of done subtasks.']"));
        return true;
    }

    public String isSecureHeaderDisplayed() {
        By secureHeader = By.xpath("//android.widget.TextView[@text='Secure']");
        return AndroidIsTextDisplayed.getText(secureHeader);
    }

    public boolean isSecureTextDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.xpath(
                "//android.widget.TextView[@text='You can add a PIN-protection in the settings.']"));
        return true;
    }

    public void clickOkayBtn() {
        androidClick.click(nextBtn);
    }

}
