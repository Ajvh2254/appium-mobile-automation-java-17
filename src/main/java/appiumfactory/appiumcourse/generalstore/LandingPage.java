package appiumfactory.appiumcourse.generalstore;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import appiumfactory.utilities.SendKeys;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LandingPage extends BasePage {

    public LandingPage() {
        super();
    }

    public LandingPage clickCountryDropdown() {
        click.androidClick(By.id("android:id/text1"));
        return this;
    }

    public LandingPage scrollCountryDropdown() {
        scroll.scrollIntoView("Bermuda");
        return this;
    }

    public LandingPage clickCountryBtn() {
        click.androidClick(By.xpath(
                "//android.widget.TextView[@text= 'Bermuda']"));
        return this;
    }

    public LandingPage sendNameKeys() {
        SendKeys.androidSendKeys(By.xpath(
                "//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']"),
                "Ray Fitzgerald");
        return this;
    }

    public LandingPage hideKeyboard() {
        AndroidDriverManager.getAndroidDriver().hideKeyboard();
        return this;
    }

    public LandingPage clickFemaleBtn() {
        click.androidClick(By.xpath("//android.widget.RadioButton[@text= 'Female']"));
        return this;
    }

    public LandingPage clickLetsShopBtn() {
        click.androidClick(By.id("com.androidsample.generalstore:id/btnLetsShop"));
        return this;
    }

    public void handleToastMessage() {
        String toastMessage = AndroidDriverManager.getAndroidDriver().findElement(
                By.xpath("(//android.widget.Toast)[1]")).getDomAttribute("name");
        Assert.assertEquals(toastMessage, "Please enter your name");
    }

}
