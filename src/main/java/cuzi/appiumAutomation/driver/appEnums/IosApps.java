package cuzi.appiumAutomation.driver.appEnums;

public enum IosApps {

    UIKIT_CATALOG("UIKitCatalog.app");

    private final String appPath;

    IosApps(String appName) {
        this.appPath = appName;
    }

    public String getAppFilePath() {
        return appPath;
    }
}
