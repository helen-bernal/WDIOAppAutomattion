package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {
    private static final String uiAutomator_WebText="new UiSelector().text(\"WEBDRIVER\")";
    @AndroidFindBy(uiAutomator = uiAutomator_WebText)
    private WebElement WebDriverIOText;
    public HomeScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public Boolean isWebDriverIOTextPresent(){
        return isELementDisplayed(WebDriverIOText);
    }
    private static final String uiAutomator_WebButton="new UiSelector().description(\"Home\")";
    @AndroidFindBy(uiAutomator=uiAutomator_WebButton)
    private WebElement HomeButton;
    public void clickHomeButton() {
        clickElement(HomeButton);
    }
}
