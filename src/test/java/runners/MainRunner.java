package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"classpath:features"}, //tell runner class where feature file is stored
        glue = {"stepDefinitions"},
        tags = "@regression",
        monochrome = true,
        dryRun = false, //true will not execute step definitions
        plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json"}

)


public class MainRunner extends AbstractTestNGCucumberTests {

}
