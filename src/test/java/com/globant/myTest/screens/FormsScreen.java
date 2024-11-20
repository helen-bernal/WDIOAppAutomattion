package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {
    public FormsScreen(AndroidDriver driver) {
        super(driver);
    }
    private static final String uiAutomator_FormComponents="new UiSelector().text(\"Form components\")";
    @AndroidFindBy(uiAutomator =uiAutomator_FormComponents)
    private WebElement FormComponentsText;
    public Boolean isFormComponentsTextPresent(){
        return isELementDisplayed(FormComponentsText);
    }
    private static final String uiAutomator_FormButton="new UiSelector().description(\"Forms\")";
    @AndroidFindBy(uiAutomator=uiAutomator_FormButton)
    private WebElement FormsButton;
    public void clickFormsButton() {
        clickElement(FormsButton);
    }
}
