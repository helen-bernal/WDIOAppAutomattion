package com.globant.myTest.screens;

import com.globant.myTest.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwipeScreen extends BaseScreen {
    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
    private static final String uiAutomator_SwipeHorizontal = "new UiSelector().text(\"Swipe horizontal\")";
    @AndroidFindBy(uiAutomator = uiAutomator_SwipeHorizontal)
    private WebElement SwipeHorizontalText;

    private static final String uiAutomator_SwipeButton = "new UiSelector().description(\"Swipe\")";
    @AndroidFindBy(uiAutomator = uiAutomator_SwipeButton)
    private WebElement SwipeButton;

    private static final String uiAutomator_horizontalCarousel = "new UiSelector().resourceId(\"__CAROUSEL_ITEM_0_READY__\")";
    @AndroidFindBy(uiAutomator = uiAutomator_horizontalCarousel)
    public WebElement horizontalCarousel;

    private static final String uiAutomator_firstCard = "new UiSelector().description(\"card\").instance(0)";
    @AndroidFindBy(uiAutomator = uiAutomator_firstCard)
    public WebElement firstCardCarousel;

    private static final String uiAutomator_lastCard = "new UiSelector().description(\"card\")";
    @AndroidFindBy(uiAutomator = uiAutomator_lastCard)
    public WebElement lastCardCarousel;

    private static final String uiAutomator_youFoundMeText = "new UiSelector().text(\"You found me!!!\")";
    @AndroidFindBy(uiAutomator = uiAutomator_youFoundMeText)
    private WebElement youFoundMeText;

    private static final String uiAutomator_ItemToSwipeVertical = "new UiSelector().className(\"android.view.ViewGroup\").instance(5)";
    @AndroidFindBy(uiAutomator = uiAutomator_ItemToSwipeVertical)
    public WebElement ItemToSwipeVertical;



    public Boolean isSwipeHorizontalTextPresent() {
        return isElementDisplayed(SwipeHorizontalText);  // Corregido el nombre
    }

    public void clickSwipeButton() {
        clickElement(SwipeButton);
    }

    public boolean isFirstCardHidden() {
        return !isElementDisplayed(firstCardCarousel);  // Corregido el nombre
    }

    public boolean isLastCardVisible() {
        return isElementDisplayed(lastCardCarousel);  // Corregido el nombre
    }

    public boolean isYouFoundMeTextVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.visibilityOf(youFoundMeText));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void swipeHorizontal(WebElement element, String direction) {
        swipeHorizontal(element, direction);  // Uso del método de BaseScreen
    }

    public void swipeVertical(WebElement element, String direction) {
        swipeVertical();  // Uso del método de BaseScreen
    }
}