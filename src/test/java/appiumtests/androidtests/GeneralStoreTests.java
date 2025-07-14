package appiumtests.androidtests;

import appiumfactory.appiumcourse.generalstore.LandingPage;
import basetests.BaseGeneralStoreTests;
import org.testng.annotations.Test;

public class GeneralStoreTests extends BaseGeneralStoreTests {

    @Test
    public void landingPageTest() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickCountryDropdown()
                .scrollCountryDropdown()
                .clickCountryBtn()
                .sendNameKeys()
                .hideKeyboard()
                .clickFemaleBtn()
                .clickLetsShopBtn();
    }

}
