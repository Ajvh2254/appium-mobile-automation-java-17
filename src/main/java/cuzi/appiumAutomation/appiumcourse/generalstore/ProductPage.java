package cuzi.appiumAutomation.appiumcourse.generalstore;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BaseAndroidPage {

    public ProductPage() {
        super();
    }

    public ProductPage isProductPageDisplayed() {
        isDisplayed.isElementDisplayed(By.id("com.androidsample.generalstore:id/toolbar_title"));
        return this;
    }

    public ProductPage scrollProductIntoView() {
        scroll.scrollIntoView("Jordan 6 Rings");
        return this;
    }

    public ProductPage addProductToCart() {
        List<WebElement> products = AndroidDriverManager.getAndroidDriver().findElements(
                By.id("com.androidsample.generalstore:id/productName"));
        int productCount = products.size();
        for (int i = 0; i < productCount; i++) {
            String productName = products.get(i).getText();
            if (productName.equalsIgnoreCase("Jordan 6 Rings")) {
                AndroidDriverManager.getAndroidDriver().findElements(
                        By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
            }
        }
        return this;
    }

    public ProductPage clickAddToCartBtn() {
        AndroidDriverManager.getAndroidDriver().findElements(
                By.xpath("//android.widget.TextView[@text= 'ADD TO CART']"))
                .get(0).click();
        return this;
    }

    public void clickCartBtn() {
        click.androidClick(By.xpath(
                "//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']"));
    }



}
