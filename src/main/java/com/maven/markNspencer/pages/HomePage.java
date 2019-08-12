package com.maven.markNspencer.pages;

import com.maven.markNspencer.Utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends DriverFactory {

    @FindBy(xpath = "//input[@name=\"searchTerm\" and @class=\"search-bar--search-lg ng-pristine ng-valid ng-empty ng-touched\"]")
    public WebElement searchBox;

    @FindBy(xpath="//button[@type=\"submit\" and @class =\"search-bar--submit search-bar--submit__lg btn__icon btn__icon--search\"]")
    public WebElement submitButton;

    @FindBy(xpath="//a[@class=\"res-nav-header__login-link\"]")
    public WebElement signinButton;


    public HomePage(){

        PageFactory.initElements(driver, this);
    }

    public void inputSerchBox(String text ){
        searchBox.sendKeys(text);
    }

    public void clickSearch(){
        submitButton.click();
    }

    public void clickSignin(){
        signinButton.click();
    }


}
