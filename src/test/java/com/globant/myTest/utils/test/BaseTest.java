package com.globant.myTest.utils.test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {
    private static String PROPERTIES_FILE="src/test/java/Resources/confirg.properties";
    private static Properties properties= new Properties();
    public static AndroidDriver driver;
    @BeforeMethod(alwaysRun=true)
    public void enviromentSetuo(){
        loadProperties();
        UiAutomator2Options capabilities=new UiAutomator2Options();
        try{
            driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),capabilities);

        }catch (MalformedURLException exception){
            System.out.println(exception.getMessage());

        }
    }
    public void loadProperties(){
        try{
            FileInputStream fileInputStream= new FileInputStream(PROPERTIES_FILE);
            properties.load(fileInputStream);
        } catch (IOException e){
            throw new RuntimeException("Error loaing properties file"+ PROPERTIES_FILE);
        }
    }
    public static String getCapability(String variable){
        return properties.getProperty(variable);
    }
    public static void SetUpCapabilities(UiAutomator2Options capabilities)
    {
        capabilities.setPlatformName(getCapability("platformName"));
        capabilities.setDeviceName(getCapability("deviceName"));
        capabilities.setAppActivity(getCapability("appActivity"));
        capabilities.setAppPackage(getCapability("appPackage"));

    }
    @AfterTest
    public static void downServer(){
        driver.quit();
    }
}
