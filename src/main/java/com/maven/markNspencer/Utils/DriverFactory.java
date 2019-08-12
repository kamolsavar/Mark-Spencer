package com.maven.markNspencer.Utils;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DriverFactory{

    public static WebDriver driver;

    public static String browser= "chrome";


    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public static void startBrowser(){
        switch(browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/java/com/maven/markNspencer/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/java/com/maven/markNspencer/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "opera":
                System.setProperty("webdriver.opera.driver","src/test/java/com/maven/markNspencer/resources/operadriver.exe");
                driver = new OperaDriver();
                break;

            case "ie":
                System.setProperty("webdriver.ie.driver", "src/test/java/com/maven/markNspencer/resources/iedriver.exe") ;
                driver = new InternetExplorerDriver();
                break;

            default:
                System.setProperty("webdriver.gecko.driver", "src/test/java/com/maven/markNspencer/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

        }

        }

    public void navigateTo(String url){
        driver.get(url);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void maximizeBrowser(){
        driver.manage().window().maximize();
    }

    public void implicitWait(){
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           }

    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

    public static void embedScreenshot(Scenario scenario) {
     File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("mark&spencer/target/screenShot.json"+ Math.random()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
