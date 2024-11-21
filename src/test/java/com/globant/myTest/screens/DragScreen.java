package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {
    public DragScreen(AndroidDriver driver) {
        super(driver);
    }
    private static final String uiAutomator_DragandDrop="new UiSelector().text(\"Drag and Drop\")";
    @AndroidFindBy(uiAutomator =uiAutomator_DragandDrop)
    private WebElement DragandDropText;
    public Boolean isDragandDropTextPresent(){
        return isElementDisplayed(DragandDropText);
    }
    private static final String uiAutomator_DragButton="new UiSelector().description(\"Drag\")";
    @AndroidFindBy(uiAutomator=uiAutomator_DragButton)
    private WebElement DragButton;
    public void clickDragButton() {
        clickElement(DragButton);
    }

}
