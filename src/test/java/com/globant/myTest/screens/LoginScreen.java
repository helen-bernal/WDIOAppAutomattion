package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.Random;

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
    private static final String uiAutomator_LoginButton="new UiSelector().description(\"Login\")";
    @AndroidFindBy(uiAutomator=uiAutomator_LoginButton)
    private WebElement LoginButton;
    public void clickLoginButton() {
        clickElement(LoginButton);
    }
    private static final String uiAutomator_SingUpOption="new UiSelector().description(\"button-sign-up-container\")";
    @AndroidFindBy(uiAutomator=uiAutomator_SingUpOption)
    private WebElement SingUpOption;
    public void clickSingUpOption() {
        clickElement(SingUpOption);
    }
    private static final String uiAutomator_Email="new UiSelector().text(\"Email\")";
    @AndroidFindBy(uiAutomator=uiAutomator_Email)
    private WebElement emailField;
    private static final String uiAutomator_Password="new UiSelector().text(\"Password\")";
    @AndroidFindBy(uiAutomator=uiAutomator_Password)
    private WebElement passwordField;
    private static final String uiAutomator_ConfirmPassword="new UiSelector().text(\"Confirm password\")";
    @AndroidFindBy(uiAutomator=uiAutomator_ConfirmPassword)
    private WebElement confirmPasswordField;
    private static final String uiAutomator_SignUpButton="new UiSelector().description(\"button-SIGN UP\")";
    @AndroidFindBy(uiAutomator=uiAutomator_SignUpButton)
    private WebElement SignUpButton;
    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void confirmPassword(String password) {
        confirmPasswordField.sendKeys(password);
    }
    public void clickSignUpButton() {
        SignUpButton.click();
    }
    private static final String uiAutomator_SuccessSignUo="new UiSelector().className(\"android.widget.FrameLayout\").instance(0)";
    @AndroidFindBy(uiAutomator=uiAutomator_SuccessSignUo)
    private WebElement successText;
    public boolean isSuccessMessageDisplayed() {
        return successText.isDisplayed();
    }

    public String generateRandomEmail() {
        Random rand = new Random();
        return "helen" + rand.nextInt(100000) + "@gmail.com";
    }

    public String generateRandomUsername() {
        return "Helen" + new Random().nextInt(1000);
    }

    public String generateRandomPassword() {
        return "Bernal" + new Random().nextInt(1000);
    }

    public void registerWithRandomData() {
        String email = generateRandomEmail();
        String password = generateRandomPassword();
        enterEmail(email);
        enterPassword(password);
        confirmPassword(password);
        clickSignUpButton();
    }
}
