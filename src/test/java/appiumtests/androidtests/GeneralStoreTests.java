package appiumtests.androidtests;

import appiumfactory.appiumcourse.generalstore.LandingPage;
import basetests.BaseGeneralStoreTests;
import org.testng.annotations.Test;

public class GeneralStoreTests extends BaseGeneralStoreTests {

    LandingPage landingPage = new LandingPage();

    @Test
    public void landingPageTest() {
        landingPage.clickCountryDropdown()
                .scrollCountryDropdown()
                .clickCountryBtn()
                .sendNameKeys()
                .hideKeyboard()
                .clickFemaleBtn()
                .clickLetsShopBtn();
    }

    @Test
    public void toastMessageTest() {
        landingPage.clickCountryDropdown()
                .scrollCountryDropdown()
                .clickCountryBtn()
                .clickFemaleBtn()
                .clickLetsShopBtn()
                .handleToastMessage();
    }

}
