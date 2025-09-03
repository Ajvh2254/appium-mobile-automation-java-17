package appiumtests.androidtests;

import cuzi.appiumAutomation.appiumcourse.generalstore.CartPage;
import cuzi.appiumAutomation.appiumcourse.generalstore.LandingPage;
import cuzi.appiumAutomation.appiumcourse.generalstore.ProductPage;
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

    @Test
    public void toastMessageTest() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickCountryDropdown()
                .scrollCountryDropdown()
                .clickCountryBtn()
                .clickFemaleBtn()
                .clickLetsShopBtn()
                .handleToastMessage();
    }

    @Test
    public void addProductToCartTest() {
        LandingPage landingPage = new LandingPage();
        landingPage.sendNameKeys()
                .hideKeyboard()
                .clickLetsShopBtn();

        ProductPage productPage = new ProductPage();
        productPage.isProductPageDisplayed()
                .scrollProductIntoView()
                .addProductToCart()
                .clickCartBtn();
    }

    @Test
    public void shoppingTest() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickCountryDropdown()
                .scrollCountryDropdown()
                .clickCountryBtn()
                .sendNameKeys()
                .hideKeyboard()
                .clickFemaleBtn()
                .clickLetsShopBtn();

        ProductPage productPage = new ProductPage();
        productPage.isProductPageDisplayed()
                .clickAddToCartBtn()
                .clickAddToCartBtn()
                .clickCartBtn();

        CartPage cartPage = new CartPage();
        cartPage.isCartPageDisplayed()
                .getProductTotal()
                .longClickTermsBtn()
                .clickCloseBtn()
                .clickEmailsCheckbox()
                .clickCompletePurchaseBtn();
    }

}
