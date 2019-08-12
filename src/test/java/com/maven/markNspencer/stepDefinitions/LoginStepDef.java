package com.maven.markNspencer.stepDefinitions;


import com.maven.markNspencer.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();


    @Given("^user on the login page$")
    public void userOnTheLoginPage() {
    }

    @When("^user click on sing in$")
    public void userClickOnSingIn() {
    loginPage.clickOnSigninBtn();
    }

    @Then("^user should be on sign in page$")
    public void userShouldBeOnSignInPage() {
        String pageTitle=loginPage.getTitle();
        String pageTitleActual= "Sign In | Marks & Spencer";
        Assert.assertEquals(pageTitleActual,pageTitle);

    }


    @When("^user input email addreess as '<email>' and password as '<password>'$")
    public void userInputEmailAddreessAsEmailAndPasswordAsPassword(String email, String password) {

    }

    @When("^user input email addreess as '(.+)' and password as '(.+)'$")
    public void user_input_email_addreess_as_and_password_as_(String email, String password)  {
        loginPage.enterCredentials(email, password);
    }


    @And("^click on sign in$")
    public void clickOnSignIn() {
        loginPage.clickSingin();
    }

    @Then("^user should be log in successfully$")
    public void userShouldBeLogInSuccessfully() {
    }

    @And("^see the welcoming '(.+)'$")
    public void see_the_welcoming_(String message) {
        loginPage.clickAccountBtn();
        String actualMsg=loginPage.getMessage();
        Assert.assertEquals(message,actualMsg);
    }

}
