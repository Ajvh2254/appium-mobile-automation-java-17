package appiumtests.androidtests;

import appiumfactory.appiumcourse.generalstore.CartPage;
import appiumfactory.appiumcourse.generalstore.LandingPage;
import appiumfactory.appiumcourse.generalstore.ProductPage;
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
