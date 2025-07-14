package appiumtests.androidtests;

import appiumfactory.appiumcourse.apidemos.CommonPage;
import appiumfactory.appiumcourse.apidemos.pages.ExpandableListsPage;
import appiumfactory.appiumcourse.apidemos.pages.WifiPage;
import basetests.BaseAndroidTests;
import org.testng.annotations.Test;

public class AppiumTests extends BaseAndroidTests {

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

}
