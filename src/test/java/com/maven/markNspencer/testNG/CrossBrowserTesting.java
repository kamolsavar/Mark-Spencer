package com.maven.markNspencer.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrossBrowserTesting {
    public WebDriver driver;


    @BeforeTest
    @Parameters("browser")
    public void startBrowser(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/java/com/maven/markNspencer/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/java/com/maven/markNspencer/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "opera":
                System.setProperty("webdriver.opera.driver", "src/test/java/com/maven/markNspencer/resources/operadriver.exe");
                driver = new OperaDriver();
                break;

            case "ie":
                System.setProperty("webdriver.ie.driver", "src/test/java/com/maven/markNspencer/resources/iedriver.exe");
                driver = new InternetExplorerDriver();
                break;

//            default:
//                System.setProperty("webdriver.gecko.driver", "src/test/java/com/maven/markNspencer/resources/geckodriver.exe");
//                driver = new FirefoxDriver();
//                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://gmail.com");
    }

    @Test
    public void loginGmail(){
        driver.findElement(By.id("identifierId")).sendKeys("kamolsavar@gmail.com");
        driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("61289248");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
    }
}
