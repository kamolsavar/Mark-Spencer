package com.maven.markNspencer;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/maven/markNspencer/resources/features",
                tags= {"@smoke"},
                plugin={"json:target/kamol.json", "html:target/selenium-report"})


public class RunTests {
}
