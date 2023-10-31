package StepDefinitions.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import StepDefinitions.ControlHelper;
import StepDefinitions.Hook.Hook;

public class LoginPOM {

	WebDriver driver ;
	public  LoginPOM() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();

	}
	
	public void ProductReview(){
		Hook hook=new Hook();
		
		this.driver=hook.getDriver();
	}
	ControlHelper controlHelper = new ControlHelper(driver);

	public void popupClose() throws Exception {
		Thread.sleep(3000);
		// Code for check button
		controlHelper.clickButton(By.id("wzrk-cancel"));
	}

	public void clickonSignIn() throws Exception {
		// code for click on sign up
		controlHelper.clickButton(By.xpath("//span[normalize-space()='Sign In']"));
		Thread.sleep(3000);
	}

	public void Email() throws Exception {
		//code for entering Mobile/Email 
		controlHelper.enterText(By.xpath("//input[@placeholder='Mobile / Email']"), "wwwvamsi1@gmail.com");
		Thread.sleep(3000);
		//code for click on submit button
		controlHelper.clickButton(By.xpath("//button[@class='ButtonWrapper--18uby1n iTsdrr']"));
		Thread.sleep(3000);

	}

	public void password() throws Exception {
		//code for clicks on entering password
		controlHelper.clickButton(By.xpath("//input[@placeholder='Enter Password']"));
		Thread.sleep(3000);
		//code for entering password
		controlHelper.enterText(By.xpath("//input[@placeholder='Enter Password']"), "Vamsi@123");
		Thread.sleep(3000);
		//code for clicks on submit button
		controlHelper.clickButton(By.xpath("//button[@class='ButtonWrapper--18uby1n iTsdrr']"));
		Thread.sleep(3000);

	}

}
