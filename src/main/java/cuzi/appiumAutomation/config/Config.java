package cuzi.appiumAutomation.config;

import cuzi.appiumAutomation.driver.appEnums.IosApps;

import java.nio.file.Path;

public class Config {

    private static final String USER_DIR = System.getProperty("user.dir");


    // IOS specific File Paths
    private static final String IOS_DIRECTORY = USER_DIR + "/apps/iosApps";
    public static final String IOS_UIKIT_PATH = String.valueOf(Path.of(IOS_DIRECTORY, IosApps.UIKIT_CATALOG.getAppFilePath()));
}
