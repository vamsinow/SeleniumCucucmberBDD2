package StepDefinitions.Hook;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hook {

	public  static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	WebDriver driver1;
    @Before
    public  void setUp() {
    	driver1 = WebDriverSingleton.getDriver();
    	setDriver(driver1);
    }

    public  void setDriver(WebDriver driver) {
        Hook.driver.set(driver);
    }
    
    public  WebDriver getDriver() {
        return Hook.driver.get();
    }

    @After
    public void tearDown(Scenario scenario) {
        // Perform actions after each scenario (e.g., taking screenshots)
        if (scenario.isFailed()) {
            try {
                // Take a screenshot
                TakesScreenshot screenshot = (TakesScreenshot) driver;
                File source = screenshot.getScreenshotAs(OutputType.FILE);

                // Specify the directory and file name for the screenshot
                String screenshotName = scenario.getName().replaceAll(" ", "_") + "_screenshot.png";
                String destinationPath = "screenshots/" + screenshotName;

                // Copy the screenshot to the specified location
                File destinationFile = new File(destinationPath);
                FileUtils.copyFile(source, destinationFile);

                // Embed the screenshot in the Cucumber report
                scenario.attach(Files.readAllBytes(Paths.get(destinationPath)), "image/png", screenshotName);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            driver.close();
//            driver.quit();
        }
        getDriver().close();
        getDriver().quit();
    }
}
