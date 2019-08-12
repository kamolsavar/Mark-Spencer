package com.maven.markNspencer.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleAnnotation {
    WebDriver driver;

    @BeforeTest
    public void setUpBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/com/maven/markNspencer/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://www.gmail.com");
    }

    @Test
    public void loginGmail(){
    driver.findElement(By.id("identifierId")).sendKeys("kamolsavar@gmail.com");
    driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("61289248");
    driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
    }
}
