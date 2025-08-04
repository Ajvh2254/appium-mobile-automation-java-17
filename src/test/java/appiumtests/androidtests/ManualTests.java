package appiumtests.androidtests;

import appiumfactory.appiumcourse.apidemos.pages.AccessibilityPage;
import appiumfactory.appiumcourse.apidemos.pages.AnimationPage;
import basetests.BaseAPIDemosTests;
import org.testng.annotations.Test;

public class ManualTests extends BaseAPIDemosTests {

    @Test
    public void accessibilityPageTest() {
        AccessibilityPage accessibilityPage = new AccessibilityPage();
        accessibilityPage.isAPIDemosHeaderDisplayed()
                .isAPIDemosIconsDisplayed()
                .clickAccessibilityPageBtn()
                .isAPIDemosHeaderDisplayed()
                .isAPIDemosIconsDisplayed()
                .clickNodeProviderBtn()
                .isNodeProviderHeaderDisplayed()
                .pressAndroidBackKey()
                .clickNodeQueryingBtn()
                .isNodeQueryHeaderDisplayed()
                .pressAndroidBackKey()
                .clickServiceBtn()
                .isServiceHeaderDisplayed()
                .pressAndroidBackKey()
                .clickCustomViewBtn()
                .isCustomViewHeaderDisplayed();
    }

    @Test
    public void animationPageTest() {
        AnimationPage animationPage = new AnimationPage();
        animationPage.isAPIDemosHeaderDisplayed()
                .clickAnimationBtn()
                .isAPIDemosTitleDisplayed()
                .clickBouncingBallsBtn()
                .isBouncingBallsLogoDisplayed()
                .pressAndroidBackKey();
    }

}
