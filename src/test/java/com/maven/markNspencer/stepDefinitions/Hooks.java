package com.maven.markNspencer.stepDefinitions;

import com.maven.markNspencer.Utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory= new DriverFactory();

    @Before
    public void setUp(){
        driverFactory.startBrowser();
        driverFactory.maximizeBrowser();
        driverFactory.navigateTo("https://www.marksandspencer.com");
        driverFactory.implicitWait();
        }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            driverFactory.embedScreenshot(scenario);
        }
        driverFactory.closeBrowser();
    }
}
