package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PressKey extends BaseAndroidPage {

    public void pressBackKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        System.out.println("Pressed BACK key");
    }

    public void pressEnterKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        System.out.println("Pressed ENTER key");
    }

    public void pressHomeKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.HOME));
        System.out.println("Pressed HOME key");
    }

}
