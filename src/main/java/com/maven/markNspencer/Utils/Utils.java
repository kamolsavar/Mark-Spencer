package com.maven.markNspencer.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends AutomationConstant {
    WebDriverWait wait = new WebDriverWait(driver,AutomationConstant.TimeOut);

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForElementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void mouseHOverToAndClick(WebElement elementHoverTo, WebElement elementClickTo){
        Actions actions = new Actions(driver);
        actions.moveToElement(elementHoverTo).click(elementClickTo).build().perform();
    }


}
