package com.globant.myTest.utils.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {
    protected AndroidDriver driver;
    public BaseScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    protected  Boolean isELementDisplayed(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until((ExpectedConditions.visibilityOf(element)));
        return element.isDisplayed();
    }
    public void clickElement(WebElement element) {
        try {
            element.click();
            System.out.println("Click at" + element);
        } catch (Exception e) {
            System.err.println("Could't click" + element);
            e.printStackTrace();
            throw e;
        }
    }
}
