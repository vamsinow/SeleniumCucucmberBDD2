package StepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinitions.Hook.Hook;
import StepDefinitions.Hook.WebDriverSingleton;

public class ControlHelper {

	WebDriver driver ;

	public  ControlHelper() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();
		// this.driver = WebDriverSingleton.getDriver();

	
	}
//WebDriver driver = Hook.driver;

	    public ControlHelper(WebDriver driver) {
//	        this.driver = driver;
	    
			 this.driver = driver;
	    }

	    public void clickButton(By locator) {
	        WebElement button = driver.findElement(locator);
	        button.click();
	    }

	    public void enterText(By locator, String text) {
	        WebElement inputField = driver.findElement(locator);
	        inputField.sendKeys(text);
	    }
	}


