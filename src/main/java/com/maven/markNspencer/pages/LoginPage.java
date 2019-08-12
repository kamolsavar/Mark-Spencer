package com.maven.markNspencer.pages;

import com.maven.markNspencer.Utils.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.CertStoreSpi;

public class LoginPage extends DriverFactory {
    DriverFactory driverFactory=new DriverFactory();
    public LoginPage(){
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath="//a[@class='res-nav-header__login-link']")
    private WebElement singinShape;

    @FindBy(css = ".hdr-signin-login-link")
    private WebElement singLink;

    public void clickOnSigninBtn(){
        singinShape.click();
        singLink.click();
    }

    @FindBy(id="loginEmail")
    private WebElement emailField;

    @FindBy(id="loginPassword")
    private WebElement passwordField;



    @FindBy(xpath="//input[@class='my-account__subcontent__signIn-btn btn--active']")
    private WebElement signinBtn;


    public void enterCredentials(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        driverFactory.implicitWait();

    }
    public void clickSingin(){

        signinBtn.click();
            }


    @FindBy(xpath = "//span[@class='nav-header__welcome']")
    private WebElement message;

    @FindBy(css= "#menuBarTop > ul > li.res-nav-header__item.res-nav-header__item--myaccount.myaccount.dropdown > a")
    private WebElement accountBtn;

    public void clickAccountBtn(){
        accountBtn.click();
        driverFactory.implicitWait();
    }

    public String getMessage(){
        return message.getText();
         }
}
