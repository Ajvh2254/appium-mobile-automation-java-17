package cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.todolist;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import io.appium.java_client.AppiumBy;
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

    public HomePage clickMoreOptionsBtn() {
        androidClick.click(AppiumBy.accessibilityId("More options"));
        return this;
    }

    public void clickSettingsBtn() {
        androidClick.click(
                By.xpath("//android.widget.TextView[@resource-id='com.todoist.remix:id/title' and @text='Settings']"));
    }

    public void clickAboutBtn() {
        androidClick.click(
                By.xpath("//android.widget.TextView[@resource-id='com.todoist.remix:id/title' and @text='About']"));
    }

    public void clickPlusBtn() {
        androidClick.click(By.id("com.todoist.remix:id/addToDoItemFAB"));
    }

}
