package appiumfactory.appiumcourse.apidemos.pages;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ExpandableListsPage extends BasePage {

    public ExpandableListsPage() {
        super();
    }

    public ExpandableListsPage clickExpandableListsBtn() {
        click.androidClick(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']"));
        return this;
    }

    public ExpandableListsPage clickCustomAdapterBtn() {
        click.androidClick(AppiumBy.accessibilityId("1. Custom Adapter"));
        return this;
    }

    public ExpandableListsPage longClickPeopleNamesBtn() {
        click.androidLongClick(By.xpath(
                "//android.widget.TextView[@text='People Names']"), 2000);
        return this;
    }

    public void isSampleMenuDisplayed() {
        String text = AndroidDriverManager.getAndroidDriver().findElement(
                By.id("android:id/title")).getText();
        Assert.assertEquals(text, "Sample menu");
        Assert.assertTrue(isDisplayed.isElementDisplayed(By.id("android:id/title")));
    }

}
