package com.globant.myTest.utils.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseScreen {
    protected AndroidDriver driver;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    protected Boolean isElementDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickElement(WebElement element) {
        try {
            element.click();
            System.out.println("Click at " + element);
        } catch (Exception e) {
            System.err.println("Couldn't click " + element);
            e.printStackTrace();
            throw e;
        }
    }

    public void swipeHorizontal(WebElement element, String direction) {
        int startX = element.getLocation().getX();
        int startY = element.getLocation().getY();
        int endX = startX + 1000;

        TouchAction action = new TouchAction(driver);
        if ("right".equals(direction)) {
            action.press(PointOption.point(startX, startY))
                    .moveTo(PointOption.point(endX, startY))
                    .release()
                    .perform();
        } else {
            action.press(PointOption.point(endX, startY))
                    .moveTo(PointOption.point(startX, startY))
                    .release()
                    .perform();
        }
    }
    public void swipeVertical() {
        Dimension size = driver.manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }
}