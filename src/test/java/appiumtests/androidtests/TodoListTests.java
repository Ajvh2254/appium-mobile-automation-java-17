package appiumtests.androidtests;

import basetests.BaseTodoListTests;
import cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.todolist.HomePage;
import cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.todolist.InputPage;
import org.testng.annotations.Test;

public class TodoListTests extends BaseTodoListTests {

    @Test
    public void setReminderTest() {
        HomePage homePage = new HomePage();
        homePage.isTodoListDisplayed()
                .clickPlusBtn();

        InputPage inputPage = new InputPage();
        inputPage.isTitleHeaderDisplayed()
                .sendTitleKeys()
                .sendDescriptionKeys()
                .clickSliderToggle();
    }

}
