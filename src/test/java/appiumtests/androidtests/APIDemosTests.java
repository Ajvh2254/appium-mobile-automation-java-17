package appiumtests.androidtests;

import cuzi.appiumAutomation.appiumcourse.apidemos.CommonPage;
import basetests.BaseAPIDemosTests;
import cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.apidemos.AccessibilityPage;
import cuzi.appiumAutomation.appiumcourse.apidemos.manualtests.apidemos.AnimationPage;
import cuzi.appiumAutomation.appiumcourse.apidemos.pages.*;
import org.testng.annotations.Test;

public class APIDemosTests extends BaseAPIDemosTests {

    @Test
    public void wifiSettingsTest() {
        WifiPage wifiPage = new WifiPage();
        wifiPage.clickPreferenceBtn()
                .clickDependenciesBtn()
                .clickCheckboxBtn()
                .clickWifiSettingsBtn()
                .getAlertTitleText()
                .sendWifiName()
                .clickOkBtn();
    }

    @Test
    public void longClickTest() {
        CommonPage.clickViewsBtn();

        ExpandableListsPage expandableListsPage = new ExpandableListsPage();
        expandableListsPage.clickExpandableListsBtn()
                .clickCustomAdapterBtn()
                .longClickPeopleNamesBtn()
                .isSampleMenuDisplayed();
    }

    @Test
    public void scrollTest() {
        CommonPage.clickViewsBtn();

        ViewsPage viewsPage = new ViewsPage();
        viewsPage.scrollDownViewsPage();
    }

    @Test
    public void scrollIntoViewTest() {
        CommonPage.clickViewsBtn();

        ViewsPage viewsPage = new ViewsPage();
        viewsPage.scrollWebViewIntoView();
    }

    @Test
    public void swipeTest() {
        CommonPage.clickViewsBtn();

        PhotosPage photosPage = new PhotosPage();
        photosPage.clickGalleryBtn()
                .clickPhotosBtn()
                .isImageFocused()
                .swipeToNewImage()
                .isImageNotFocused();
    }

    @Test
    public void dragAndDropTest() {
        CommonPage.clickViewsBtn();

        DragAndDropPage dragAndDropPage = new DragAndDropPage();
        dragAndDropPage.clickDragANdDropBtn()
                .dragAndDropElement()
                .assertElementWasDropped();
    }

    @Test
    public void startAppActivityTest() {
        WifiPage wifiPage = new WifiPage();
        wifiPage.startAppActivity()
                .clickCheckboxBtn()
                .rotateScreen()
                .clickWifiSettingsBtn()
                .getAlertTitleText()
                .getClipboardText()
                .pressAndroidEnterKey()
                .clickOkBtn()
                .pressAndroidBackKey()
                .pressAndroidHomeKey();
    }

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
