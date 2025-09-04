package appiumtests.iostests;

import cuzi.appiumAutomation.appiumcourse.uikitcatalog.AlertViewPage;
import cuzi.appiumAutomation.appiumcourse.uikitcatalog.PickerViewPage;
import cuzi.appiumAutomation.appiumcourse.uikitcatalog.SteppersPage;
import basetests.BaseIosTests;
import cuzi.appiumAutomation.appiumcourse.uikitcatalog.ios.HomePage;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.Test;

public class UiKitCatalogTests extends BaseIosTests {

    @Test
    public void AlertViewPageTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed();
        homePage.clickAlertViewsBtn();

        AlertViewPage alertViewPage = new AlertViewPage();
        alertViewPage.clickTextEntryBox()
                .sendTextEntryKeys()
                .clickOkBtn()
                .clickConfirmBtn()
                .getAlertText();
    }

    @Test
    public void iosLongClickTest() {
        SteppersPage steppersPage = new SteppersPage();
        steppersPage.clickSteppersBtn()
                .clickAndHoldSteppersBtn();
    }

    @Test
    public void iosScrollTest() {
        PickerViewPage pickerViewPage = new PickerViewPage();
        pickerViewPage.clickPickerViewBtn();
        pickerViewPage.iosScrollRedColorValue();
        pickerViewPage.assertScrollRedValue();
        pickerViewPage.iosScrollGreenColorValue();
        pickerViewPage.assertGreenColorValue();
        pickerViewPage.iosScrollBlueColorValue();
        pickerViewPage.assertBlueColorValue();
    }

}
