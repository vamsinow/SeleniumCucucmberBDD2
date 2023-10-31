package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import StepDefinitions.Hook.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Demo1 {

	WebDriver driver ;
	JsControlHelper jsControlHelper = new JsControlHelper();
	public  Demo1() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();
		// this.driver = WebDriverSingleton.getDriver();

	
	}


@Given("User navigated to lenskartapp")
public void user_navigated_to_lenskartapp() throws Exception {
  
	
	

	
	
}

@When("user clickon popup button")
public void user_clickon_popup_button() throws Exception {


	Thread.sleep(4000);
	//Removing PopUp  
	jsControlHelper.clickButton(By.id("wzrk-cancel"));
	Thread.sleep(3000);
	
	
	
}

@When("user click on signup button")
public void user_click_on_signup_button() throws Exception {

	//Clicks on signIn space
			jsControlHelper.clickButton(By.xpath("//span[normalize-space()='Sign In']"));
			Thread.sleep(3000);
			//sending Mail into space
		

	
}

@When("user enter the email")
public void user_enter_the_email() throws Exception {

	jsControlHelper.enterText(By.xpath("//input[@placeholder='Mobile / Email']"), "wwwvamsi7@gmail.com");
	Thread.sleep(3000);
	//Clicks on SignUp button
	jsControlHelper.clickButton(By.xpath("//button[@id='remove-button']"));
	Thread.sleep(3000);
	
	
}

@When("user enter the password")
public void user_enter_the_password() throws Exception {

	//Clicks on Password space
		jsControlHelper.clickButton(By.xpath("//input[@placeholder='Enter Password']"));
		Thread.sleep(3000);
		//Sending password
		jsControlHelper.enterText(By.xpath("//input[@placeholder='Enter Password']"), "Vamsi@123");
		Thread.sleep(3000);
		//Clicks on submit button
		
	
	
}

@When("user click on submit button")
public void user_click_on_submit_button() throws InterruptedException {


	jsControlHelper.clickButton(By.xpath("//button[@id='remove-button']"));
	Thread.sleep(3000);

	
}

@When("user click on scroll the webapp")
public void user_click_on_scroll_the_webapp() throws Exception {


	jsControlHelper.scrollToElement(By.xpath("(//div/child::section[@id='idf_banner-0'])[34]/descendant::div/h1"));
	Thread.sleep(3000);

}

@When("user clickon option option that available in lenskart app")
public void user_clickon_option_option_that_available_in_lenskart_app() throws Exception {

	jsControlHelper.clickButton(By.xpath("(//div/child::section[@id='idf_banner-0'])[34]/descendant::div/h1"));
	Thread.sleep(3000);
	
}

	
}
