package com.maven.markNspencer.grid;

import jdk.internal.org.objectweb.asm.tree.TableSwitchInsnNode;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridTest {
    static WebDriver driver;
    static String nodeURL;

    public static void main(String[] args) {
        nodeURL=" http://192.168.0.12:3835/wd/hub";

        DesiredCapabilities capabilities= DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        try {
            driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.co.uk/");
        driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
        driver.quit();
    }
}
