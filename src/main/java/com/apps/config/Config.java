package com.apps.config;

public class Config {

    private static final Boolean DEFAULT_AUTO_EMULATOR_START = false;
    public static final Boolean AUTO_EMULATOR_START = Boolean.parseBoolean(System.getProperty("autoEmulatorStart", DEFAULT_AUTO_EMULATOR_START.toString()));

}
