package appiumtests.androidtests;

import basetests.BaseTodoTests;
import cuzi.appiumAutomation.appiumcourse.manualtests.todo.TutorialPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoTests extends BaseTodoTests {

    @Test
    public void tutorialPageTest() {
        TutorialPage tutorialPage = new TutorialPage();
        Assert.assertEquals(tutorialPage.isWelcomeTextDisplayed(), "Welcome!");
        Assert.assertTrue(tutorialPage.isAdvertisingTextDisplayed());
        Assert.assertTrue(tutorialPage.isSkipBtnDisplayed());
        tutorialPage.isPageIndicatorDisplayed();
        Assert.assertTrue(tutorialPage.isNextBtnClickable());
    }

}
