package com.maven.markNspencer.grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class SauceLabsDemo {
    private WebDriver driver;

    @Test
    public void firstSauceLabsTest() {

        String sauceUserName = "automation2019";
        String sauceAccessKey = "95aeb682-c068-41ff-a06c-770cf4500238";
        String sauceURL = "https://" + sauceUserName + ":" +sauceAccessKey +"@ondemand.saucelabs.com:80/wd/hub";

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
       // capabilities.setCapability("username", sauceUserName);
        //capabilities.setCapability("accessKey", sauceAccessKey);
       // capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "59.0");
        capabilities.setCapability("build", "Onboarding Sample App - Java-TestNG");
        capabilities.setCapability("name", "3-cross-browser");

        try {
            driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).click();
        WebElement searchField = driver.findElement(By.name("btnK"));

        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertTrue(searchField.isDisplayed());
    }
}
