package cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.todolist;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import org.openqa.selenium.By;

public class HomePage extends BaseAndroidPage {

    public HomePage() {
        super();
    }

    public HomePage isTodoListDisplayed() {
        androidIsDisplayed.isElementDisplayed(
                By.xpath("//android.widget.TextView[@text='Todoist']"));
        return this;
    }

}
