package appiumtests.androidtests;

import appiumfactory.appiumcourse.apidemos.WifiPage;
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

}
