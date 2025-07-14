package appiumfactory.appiumcourse.generalstore;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    public LandingPage() {
        super();
    }

    public LandingPage clickCountryDropdown() {
        click.androidClick(By.xpath("android:id/text1"));
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AndroidDriverManager.getAndroidDriver().findElement(By.xpath(
                "//android.widget.EditText[@resource-id='com.androidsample.generalstore:id/nameField']"))
                .sendKeys("Ray Fitzgerald");
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

    public void clickLetsShopBtn() {
        click.androidClick(By.id("com.androidsample.generalstore:id/btnLetsShop"));
    }

}
