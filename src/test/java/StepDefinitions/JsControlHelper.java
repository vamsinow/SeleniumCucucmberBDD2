package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import StepDefinitions.Hook.Hook;

public class JsControlHelper {

	    WebDriver driver;

	    public JsControlHelper() {
	        Hook hook = new Hook();
	        this.driver = hook.getDriver();
	    }

	    public JsControlHelper(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickButton(By locator) {
	        WebElement button = driver.findElement(locator);
	        if (button instanceof JavascriptExecutor) {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
	        } else {
	            button.click();
	        }
	    }

	    public void enterText(By locator, String text) {
	        WebElement inputField = driver.findElement(locator);
	        if (inputField instanceof JavascriptExecutor) {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", inputField, text);
	        } else {
	            inputField.sendKeys(text);
	        }
	        
	    }
	    public void scrollToElement(By locator) {
	        WebElement element = driver.findElement(locator);
	        if (element instanceof JavascriptExecutor) {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	        }
	    }

	}



