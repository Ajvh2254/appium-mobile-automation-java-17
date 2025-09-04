package cuzi.appiumAutomation.appiumcourse.generalstore;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BaseAndroidPage {

    public CartPage() {
        super();
    }

    public CartPage isCartPageDisplayed() {
        androidIsDisplayed.isElementDisplayed(By.id("com.androidsample.generalstore:id/toolbar_title"));
        return this;
    }

    public CartPage getProductTotal() {
        List<WebElement> productPrices = AndroidDriverManager.getAndroidDriver().findElements(
                By.id("com.androidsample.generalstore:id/productPrice"));
        int productCount = productPrices.size();
        double sum = 0;
        for (int i = 0; i < productCount; i++) {
            String amountString = productPrices.get(i).getText();
            double price = Double.parseDouble(amountString.substring(1));
            sum = sum + price;
        }
        String totalSum = AndroidDriverManager.getAndroidDriver().findElement(
                By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        double displaySum = Double.parseDouble(totalSum.substring(1));
        Assert.assertEquals(sum, displaySum);
        return this;
    }

    public CartPage longClickTermsBtn() {
        androidClick.longClick(By.id("com.androidsample.generalstore:id/termsButton"), 5000);
        return this;
    }

    public CartPage clickCloseBtn() {
        androidClick.click(By.id("android:id/button1"));
        return this;
    }

    public CartPage clickEmailsCheckbox() {
        androidClick.click(AppiumBy.className("android.widget.CheckBox"));
        return this;
    }

    public void clickCompletePurchaseBtn() {
        androidClick.click(By.id("com.androidsample.generalstore:id/btnProceed"));
    }

}
