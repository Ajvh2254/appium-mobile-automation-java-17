package appiumtests.androidtests;

import appiumfactory.appiumcourse.apidemos.CommonPage;
import appiumfactory.appiumcourse.apidemos.pages.*;
import basetests.BaseAPIDemosTests;
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
                .pressEnterKey()
                .clickOkBtn()
                .pressBackKey()
                .pressHomeKey();
    }

}
