package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = ".text(\"WEBDRIVER\")")
    private WebElement WebDriverIOText;
    public HomeScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public Boolean isWebDriverIOTextPresent(){
        return isELementDisplayed(WebDriverIOText);
    }
    @AndroidFindBy(uiAutomator="new UiSelector().description(\"Home\")")
    private WebElement HomeButton;
    public void clickHomeButton() {
        clickElement(HomeButton);
    }
}
