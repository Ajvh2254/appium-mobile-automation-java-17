package appiumtests.androidtests;

import appiumfactory.appiumcourse.apidemos.pages.AccessibilityPage;
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

}
