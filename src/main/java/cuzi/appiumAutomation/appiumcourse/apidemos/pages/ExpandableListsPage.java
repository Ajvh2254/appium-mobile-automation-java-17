package cuzi.appiumAutomation.appiumcourse.apidemos.pages;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ExpandableListsPage extends BaseAndroidPage {

    public ExpandableListsPage() {
        super();
    }

    public ExpandableListsPage clickExpandableListsBtn() {
        click.click(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']"));
        return this;
    }

    public ExpandableListsPage clickCustomAdapterBtn() {
        click.click(AppiumBy.accessibilityId("1. Custom Adapter"));
        return this;
    }

    public ExpandableListsPage longClickPeopleNamesBtn() {
        click.longClick(By.xpath(
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
