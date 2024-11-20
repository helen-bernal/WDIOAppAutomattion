package com.globant.myTest.test;
import com.globant.myTest.screens.*;
import com.globant.myTest.utils.test.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BottomMenuTest extends BaseTest {
    @Test
    public void HomeScreenView(){
        HomeScreen homeScreen= homeScreen();
        homeScreen.clickHomeButton();
        Assert.assertTrue(homeScreen.isWebDriverIOTextPresent());
    }
    @Test
    public void WebView(){
        WebViewScreen webViewScreen= webViewScreen();
        webViewScreen.clickWebViewButton();
        if (webViewScreen.isLoadingTextPresent()) {
            System.out.println("Waiting for the page to load");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.invisibilityOf(webViewScreen.getLoadingText()));
        }
        Assert.assertTrue(webViewScreen.isNextgenTextPresent(),
                "We are not at Web View Screen");
    }@Test
    public void Login(){
        LoginScreen loginScreen= loginScreen();
        loginScreen.clickLoginButton();
        Assert.assertTrue((loginScreen.isLoginSingUpTextPresent()));
    }
    @Test
    public void Forms(){
        FormsScreen formsScreen= formsScreen();
        formsScreen.clickFormsButton();
        Assert.assertTrue((formsScreen.isFormComponentsTextPresent()));
    }
    @Test
    public void Swipe(){
        SwipeScreen swipeScreen= swipeScreen();
        swipeScreen.clickSwipeButton();
        Assert.assertTrue((swipeScreen.isSwipeHorizontalTextPresent()));
    } @Test
    public void Drag(){
        DragScreen dragScreen= dragScreen();
        dragScreen.clickDragButton();
        Assert.assertTrue((dragScreen.isDragandDropTextPresent()));
    }


}
