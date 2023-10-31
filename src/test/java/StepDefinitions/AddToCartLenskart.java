package StepDefinitions;


import org.openqa.selenium.WebDriver;

import StepDefinitions.Hook.Hook;
import StepDefinitions.PageObjectModel.POMAddToCartLenskart;
import io.cucumber.java.en.*;
public class AddToCartLenskart {
    WebDriver driver;
  	ControlHelper controlHelper ;
  	POMAddToCartLenskart addtocart ;

    public AddToCartLenskart() {
      
    	
    	Hook hook=new Hook();
		 this.driver = hook.getDriver();
		 
		 
		 
    	 controlHelper = new ControlHelper(driver);
    	 addtocart = new POMAddToCartLenskart();
		
    }

	

	@Given("user navigates to the login page of Lenskart")
	public void user_navigates_to_the_login_page_of_lenskart() throws Exception {
		Thread.sleep(9000);
		addtocart.login();
	}

	@And("user navigates to the Computer Glasses section")
	public void user_navigates_to_the_computer_glasses_section() throws Exception {
		addtocart.computerGlasses();
	}

	@When("user performs a random click to select any product")
	public void user_performs_a_random_click_to_select_any_product() throws Exception {
		addtocart.RandomClick();
	}

	@And("user navigated to product")
	public void user_navigated_to_product() throws Exception {
		addtocart.clickonRandomClick();
	}


	@Then("user validate the product by price")
	public void user_validate_the_product_by_price() throws Exception {
		addtocart.validationOfPrice();

	}
	@When("user clicks on  buynow operation")
	public void user_clicks_on_buynow_operation() throws Exception {
		addtocart.buyNow();
	}


	@Then("user validate the product by name")
	public void user_validate_the_product_by_name() {
		addtocart.nameValidation();
	}


	@Then("user checks the actual price and expected price")
	public void user_checks_the_actual_price_and_expected_price() throws Exception {
		addtocart.validationOfPrice();
	}

	@And("user navigates to the Lenskart homepage")
	public void user_navigates_to_the_lenskart_homepage() {
		addtocart.homepage();

	}

}
