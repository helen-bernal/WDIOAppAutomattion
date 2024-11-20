package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {
    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
    private static final String uiAutomator_SwipeHorizontal="new UiSelector().text(\"Swipe horizontal\")";
    @AndroidFindBy(uiAutomator =uiAutomator_SwipeHorizontal)
    private WebElement SwipeHorizontalText;
    public Boolean isSwipeHorizontalTextPresent(){
        return isELementDisplayed(SwipeHorizontalText);
    }
    private static final String uiAutomator_SwipeButton="new UiSelector().description(\"Swipe\")";
    @AndroidFindBy(uiAutomator=uiAutomator_SwipeButton)
    private WebElement SwipeButton;
    public void clickSwipeButton() {
        clickElement(SwipeButton);
    }
}
