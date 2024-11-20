package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {
    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
    private static final String uiAutomator_LoginSingUp="new UiSelector().text(\"Login / Sign up Form\")";
    @AndroidFindBy(uiAutomator =uiAutomator_LoginSingUp)
    private WebElement LoginSingUpText;
    public Boolean isLoginSingUpTextPresent(){
        return isELementDisplayed(LoginSingUpText);
    }
    @AndroidFindBy(uiAutomator="new UiSelector().description(\"Login\")")
    private WebElement LoginButton;
    public void clickLoginButton() {
        clickElement(LoginButton);
    }
}
