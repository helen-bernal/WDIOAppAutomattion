package com.globant.myTest.utils.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class BaseTest {
    private static String PROPERTIES_FILE="src/test/java/Resources/confirg.properties";
    private static Properties properties= new Properties();
    public static AndroidDriver driver;
    @BeforeMethod(alwaysRun=true)
    public void enviromentSetuo(){
        UiAutomator2Options capabilities=new UiAutomator2Options();
    }

}
