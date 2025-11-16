package appiumtests.androidtests;

import basetests.BaseTodoTests;
import cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.todo.TutorialPage;
import org.testng.annotations.Test;

public class TodoTests extends BaseTodoTests {

    @Test
    public void tutorialPageTest() {
        TutorialPage tutorialPage = new TutorialPage();
        tutorialPage.isWelcomeTextDisplayed()
                .isAdvertisingTextDisplayed()
                .isSkipBtnDisplayed()
                .isPageIndicatorDisplayed()
                .isNextBtnClickable();
    }

}
