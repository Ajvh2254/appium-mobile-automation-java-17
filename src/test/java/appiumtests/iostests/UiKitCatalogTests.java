package appiumtests.iostests;

import appiumfactory.appiumcourse.uikitcatalog.AlertViewPage;
import basetests.BaseIosTests;
import org.testng.annotations.Test;

public class UiKitCatalogTests extends BaseIosTests {

    @Test
    public void AlertViewPageTest() {
        AlertViewPage alertViewPage = new AlertViewPage();
        alertViewPage.clickAlertViewsBtn()
                .clickTextEntryBox()
                .sendTextEntryKeys();
    }

}
