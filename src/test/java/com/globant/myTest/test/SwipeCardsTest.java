package com.globant.myTest.test;

import com.globant.myTest.screens.SwipeScreen;
import com.globant.myTest.utils.test.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SwipeCardsTest extends BaseTest {
    @BeforeMethod
    public void setUp() {
        swipeScreen = swipeScreen();
        swipeScreen.clickSwipeButton();
        swipeScreen = new SwipeScreen((AndroidDriver) driver);
    }
    private SwipeScreen swipeScreen;
    @Test
    public void swipeHorizontalUntilLastCard() {
        while (!swipeScreen.isLastCardVisible()) {
            swipeScreen.swipeHorizontal(swipeScreen.lastCardCarousel, "right");
        }
    }

    public void swipeVerticalUntilFound() {
        while (!swipeScreen.isYouFoundMeTextVisible()) {
            swipeScreen.swipeVertical();
        }
    }

    @Test
    public void swipeTest() {
        swipeScreen = swipeScreen();
        swipeScreen.clickSwipeButton();
        Assert.assertTrue(swipeScreen.isSwipeHorizontalTextPresent(), "We are not at Swipe Screen");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(swipeScreen.lastCardCarousel));
        swipeHorizontalUntilLastCard();
        swipeVerticalUntilFound();

        Assert.assertTrue(swipeScreen.isYouFoundMeTextVisible(), "Couldn't find You Found Me!! text");
    }
}

