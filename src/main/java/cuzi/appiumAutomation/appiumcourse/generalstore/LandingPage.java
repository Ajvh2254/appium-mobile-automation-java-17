package cuzi.appiumAutomation.appiumcourse.generalstore;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import cuzi.appiumAutomation.utilities.androidutils.AndroidSendKeys;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LandingPage extends BaseAndroidPage {

    public LandingPage() {
        super();
    }

    public LandingPage clickCountryDropdown() {
        androidClick.click(By.id("android:id/text1"));
        return this;
    }

    public LandingPage scrollCountryDropdown() {
        androidScroll.scrollIntoView("Bermuda");
        return this;
    }

    public LandingPage clickCountryBtn() {
        androidClick.click(By.xpath(
                "//android.widget.TextView[@text= 'Bermuda']"));
        return this;
    }

    public LandingPage sendNameKeys() {
        AndroidSendKeys.sendKeys(By.xpath(
                "//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']"),
                "Ray Fitzgerald");
        return this;
    }

    public LandingPage hideKeyboard() {
        AndroidDriverManager.getAndroidDriver().hideKeyboard();
        return this;
    }

    public LandingPage clickFemaleBtn() {
        androidClick.click(By.xpath("//android.widget.RadioButton[@text= 'Female']"));
        return this;
    }

    public LandingPage clickLetsShopBtn() {
        androidClick.click(By.id("com.androidsample.generalstore:id/btnLetsShop"));
        return this;
    }

    public void handleToastMessage() {
        String toastMessage = AndroidDriverManager.getAndroidDriver().findElement(
                By.xpath("(//android.widget.Toast)[1]")).getDomAttribute("name");
        Assert.assertEquals(toastMessage, "Please enter your name");
    }

}
