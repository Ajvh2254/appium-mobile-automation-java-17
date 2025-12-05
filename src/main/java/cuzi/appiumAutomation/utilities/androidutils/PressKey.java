package cuzi.appiumAutomation.utilities.androidutils;

import cuzi.appiumAutomation.base.BaseAndroidPage;
import cuzi.appiumAutomation.driver.AndroidDriverManager;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PressKey extends BaseAndroidPage {

    public void pressBackKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.BACK));
        log.info("Pressed BACK key");
    }

    public void pressEnterKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
        log.info("Pressed ENTER key");
    }

    public void pressHomeKey() {
        AndroidDriverManager.getAndroidDriver().pressKey(new KeyEvent(AndroidKey.HOME));
        log.info("Pressed HOME key");
    }

}
