package com.globant.myTest.test;

import com.globant.myTest.screens.HomeScreen;
import com.globant.myTest.screens.LoginScreen;
import com.globant.myTest.utils.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingUpTest extends BaseTest {
    @Test
    public void OpenSingUpForm(){
        LoginScreen loginScreen= loginScreen();
        loginScreen.clickLoginButton();
        Assert.assertTrue(loginScreen.isLoginSingUpTextPresent());
        loginScreen.clickSingUpOption();
        loginScreen.registerWithRandomData();

    }
}
