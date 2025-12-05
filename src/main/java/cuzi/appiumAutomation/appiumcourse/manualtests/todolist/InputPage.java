package cuzi.appiumAutomation.appiumcourse.manualtests.todolist;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.utilities.androidutils.AndroidSendKeys;
import org.openqa.selenium.By;

public class InputPage extends BaseAndroidPage {

    public InputPage() {
        super();
    }

    public InputPage isTitleHeaderDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.id("com.todoist.remix:id/userToDoEditText"));
        return this;
    }

    public InputPage sendTitleKeys() {
        AndroidSendKeys.sendKeys(By.id("com.todoist.remix:id/userToDoEditText"), "New Reminder");
        return this;
    }

    public InputPage sendDescriptionKeys() {
        AndroidSendKeys.sendKeys(
                By.id("com.todoist.remix:id/userToDoDescription"), "Important meeting");
        return this;
    }

    public InputPage clickSliderToggle() {
        androidClick.click(By.className("android.widget.Switch"));
        return this;
    }

}
