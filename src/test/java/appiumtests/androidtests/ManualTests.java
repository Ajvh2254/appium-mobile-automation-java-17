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
                .selectPageBtn("Bouncing Balls")
                .isPageTitleDisplayed("Animation/Bouncing Balls")
                .pressAndroidBackKey()
                .isCloningBtnFocusable()
                .isCloningBtnClickable()
                .selectPageBtn("Cloning")
                .isPageTitleDisplayed("Animation/Cloning")
                .pressAndroidBackKey()
                .selectPageBtn("Custom Evaluator")
                .isPlayBtnSelectable()
                .pressAndroidBackKey()
                .selectPageBtn("Default Layout Animations")
                .isAddBtnClickable()
                .pressAndroidBackKey()
                .selectPageBtn("Events")
                .isPageTitleDisplayed("Animation/Events")
                .pressAndroidBackKey()
                .selectPageBtn("Hide-Show Animations")
                .isPageTitleDisplayed("Animation/Hide-Show Animations")
                .pressAndroidBackKey()
                .selectPageBtn("Layout Animations")
                .isPageTitleDisplayed("Animation/Layout Animations")
                .pressAndroidBackKey()
                .selectPageBtn("Loading")
                .isPageTitleDisplayed("Animation/Loading")
                .pressAndroidBackKey()
                .selectPageBtn("Multiple Properties")
                .isPageTitleDisplayed("Animation/Multiple Properties")
                .pressAndroidBackKey()
                .selectPageBtn("Reversing")
                .isPageTitleDisplayed("Animation/Reversing")
                .pressAndroidBackKey()
                .selectPageBtn("Seeking")
                .isPageTitleDisplayed("Animation/Seeking")
                .pressAndroidBackKey()
                .selectPageBtn("View Flip")
                .isPageTitleDisplayed("Animation/View Flip")
                .pressAndroidBackKey();
    }

}
