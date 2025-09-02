package appiumtests.iostests;

import appiumfactory.appiumcourse.uikitcatalog.AlertViewPage;
import appiumfactory.appiumcourse.uikitcatalog.PickerViewPage;
import appiumfactory.appiumcourse.uikitcatalog.SteppersPage;
import basetests.BaseIosTests;
import org.testng.annotations.Test;

public class UiKitCatalogTests extends BaseIosTests {

    @Test
    public void AlertViewPageTest() {
        AlertViewPage alertViewPage = new AlertViewPage();
        alertViewPage.clickAlertViewsBtn()
                .clickTextEntryBox()
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
        PickerViewPage.clickPickerViewBtn();
        PickerViewPage.iosScrollRedColorValue();
        PickerViewPage.assertScrollRedValue();
        PickerViewPage.iosScrollGreenColorValue();
        PickerViewPage.assertGreenColorValue();
        PickerViewPage.iosScrollBlueColorValue();
        PickerViewPage.assertBlueColorValue();
    }

}
