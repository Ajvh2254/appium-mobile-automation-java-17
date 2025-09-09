package appiumtests.iostests;

import cuzi.appiumAutomation.appiumcourse.uikitcatalog.*;
import basetests.BaseIosTests;
import cuzi.appiumAutomation.appiumcourse.uikitcatalog.ios.HomePage;
import org.testng.annotations.Test;

public class UiKitCatalogTests extends BaseIosTests {

    @Test
    public void AlertViewPageTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed()
                .clickAlertViewsBtn();

        AlertViewPage alertViewPage = new AlertViewPage();
        alertViewPage.clickTextEntryBox()
                .sendTextEntryKeys()
                .clickOkBtn()
                .clickConfirmBtn()
                .getAlertText();
    }

    @Test
    public void iosLongClickTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed()
                .clickSteppersBtn();

        SteppersPage steppersPage = new SteppersPage();
        steppersPage.clickAndHoldSteppersBtn();
    }

    @Test
    public void iosScrollTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed()
                .clickPickerViewBtn();

        PickerViewPage pickerViewPage = new PickerViewPage();
        pickerViewPage.iosScrollRedColorValue()
                .assertScrollRedValue()
                .iosScrollGreenColorValue()
                .assertGreenColorValue()
                .iosScrollBlueColorValue()
                .assertBlueColorValue();
    }

    @Test
    public void printChildCellsTest() {
        HomePage homePage = new HomePage();
        homePage.isUiKitCatalogPageDisplayed()
                .printChildCell();
    }

}
