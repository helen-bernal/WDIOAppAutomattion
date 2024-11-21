package com.globant.myTest.test;

import com.globant.myTest.screens.LoginScreen;
import com.globant.myTest.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void SuccessfulLogin(){
        LoginScreen loginScreen= loginScreen();
        loginScreen.clickLoginButton();
        Assert.assertTrue(loginScreen.isLoginSingUpTextPresent());
        String existingEmail = "h@gmail.com";
        String existingPassword = "hh222333";
        loginScreen.enterEmail(existingEmail);
        loginScreen.enterPassword(existingPassword);
        loginScreen.clickLoginButton();
        Assert.assertTrue(loginScreen.isSuccessMessageDisplayed(), "Login was not successful.");
    }

}
