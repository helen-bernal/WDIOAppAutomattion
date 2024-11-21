package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebViewScreen extends BaseScreen {
    public WebViewScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }
    private static final String uiAutomator_loading="new UiSelector().text(\"LOADING...\")";
    @AndroidFindBy(uiAutomator =uiAutomator_loading)
    private WebElement LoadingText;
    public Boolean isLoadingTextPresent(){
        return isElementDisplayed(LoadingText);
    }
    public WebElement getLoadingText() {
        return LoadingText;
    }
    private static final String uiAutomator_Nextgen="new UiSelector().text(\"Next-gen browser and mobile automation test framework for Node.js\")";
    @AndroidFindBy(uiAutomator =uiAutomator_Nextgen)
    private WebElement NextgenText;
    public Boolean isNextgenTextPresent(){
        return isElementDisplayed(NextgenText);
    }
    private static final String uiAutomator_WebView="new UiSelector().description(\"Webview\")";
    @AndroidFindBy(uiAutomator=uiAutomator_WebView)
    private WebElement WebViewButton;
    public void clickWebViewButton() {
        clickElement(WebViewButton);
    }
}
