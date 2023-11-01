package StepDefinitions.Hook;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		//plugin = {"com.Avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		features = { "src/test/resources/Features"
				+ "" }, 
		
		glue = { "StepDefinitions" }, 
		dryRun=false,      //cross check every method is implemented or not  
		monochrome=true, //remove unnecessary character in console window
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}   //pretty will give output console very clearly

		)

public class TestNgRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()

	{

		return super.scenarios();

	}
	
	@BeforeClass
	public static void beforeClass() {

	}

	@AfterClass
	public static void afterClass() {

	}

}

