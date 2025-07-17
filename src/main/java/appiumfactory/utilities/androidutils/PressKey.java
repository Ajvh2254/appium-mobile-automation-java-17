package appiumfactory.utilities.androidutils;

import appiumfactory.base.BasePage;
import appiumfactory.driver.AndroidDriverManager;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PressKey extends BasePage {

    public void pressBackKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.BACK));
    }

}
