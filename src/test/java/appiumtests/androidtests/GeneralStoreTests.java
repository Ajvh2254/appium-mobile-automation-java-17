package appiumtests.androidtests;

import appiumfactory.appiumcourse.generalstore.CartPage;
import appiumfactory.appiumcourse.generalstore.LandingPage;
import appiumfactory.appiumcourse.generalstore.ProductPage;
import appiumfactory.utilities.Sleep;
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

    @Test
    public void addProductToCartTest() {
        Sleep.sleep(5000);
        landingPage.sendNameKeys()
                .hideKeyboard();

        ProductPage productPage = new ProductPage();
        productPage.scrollProductIntoView()
                .addProductToCart()
                .clickCartBtn();
    }

    @Test
    public void shoppingTest() {
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
