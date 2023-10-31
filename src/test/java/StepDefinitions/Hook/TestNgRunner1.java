package StepDefinitions.Hook;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/Demo1.feature",
        glue = "StepDefinitions",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestNgRunner1 extends AbstractTestNGCucumberTests {
		

	
    }