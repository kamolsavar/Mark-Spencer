package com.maven.markNspencer.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FaceBookAnnotation {

    WebDriver driver;

    @BeforeTest
    public void setUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/maven/markNspencer/resources/chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
         driver.get("https://www.facebook.com");
        }

//    @FindBy(css="#")
//    private WebElement userEmail;
//
//    @FindBy(id="")
//    private WebElement passWrd;
//
//    @FindBy(id=)
//    private WebElement loginBtn;


    @Test
    public void loginFacebook() {
        driver.findElement(By.id("email")).sendKeys("kamolsavar@yahoo.co.uk");
        driver.findElement(By.id("pass")).sendKeys("Ud507754ltd");
        driver.findElement(By.id("u_0_a")).click();
           }
}
