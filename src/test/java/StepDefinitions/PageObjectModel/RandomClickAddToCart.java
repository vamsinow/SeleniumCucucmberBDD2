package StepDefinitions.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Random;
import StepDefinitions.ControlHelper;
import StepDefinitions.Hook.Hook;
public class RandomClickAddToCart {
	
	WebDriver driver ;
	public  RandomClickAddToCart() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();
	}
	
	// WebDriver driver=Hook.driver;
		public void ProductReview(){
		//	this.driver=Hook.driver;
			
			
			ControlHelper controlHelper = new ControlHelper(driver);

		        
	

		        // Define XPaths
		        String[] xpaths = {
		     "//div[@id='208961']//img[@class='ProductImage--1dys3d0 idYeQL']",
		                "//div[@id='148704']//img[@class='ProductImage--1dys3d0 idYeQL']",
		                "//div[@id='143908']//img[@class='ProductImage--1dys3d0 idYeQL']",
		                "//div[@id='204468']//img[@class='ProductImage--1dys3d0 idYeQL']",
		                ""
		                // Add more XPaths as needed
		        };

		        // Generate a random index
		        Random random = new Random();
		        int randomIndex = random.nextInt(xpaths.length);

		        // Perform a click on the randomly selected XPath
		        String randomXPath = xpaths[randomIndex];
		        driver.get("https://www.lenskart.com/");    // Replace with your URL
		        driver.findElement(By.xpath("//a[normalize-space()='Computer Glasses']")).click();
		        controlHelper.clickButton(By.xpath("//a[normalize-space()='Computer Glasses']"));
		        
		        WebElement element = driver.findElement(By.xpath(randomXPath));
		        element.click();

		       
		        // Close the WebDriver
		        driver.quit();
		    }

		
			
		}




	
	

	

