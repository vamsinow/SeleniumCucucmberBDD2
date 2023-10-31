package StepDefinitions;

import org.openqa.selenium.WebDriver;
import StepDefinitions.Hook.Hook;
import StepDefinitions.PageObjectModel.POMAddToWishlistAndRemove;
import io.cucumber.java.en.*;

public class AddToWishlistAndRemove {
	WebDriver driver ;
	public  AddToWishlistAndRemove() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();
	//	 this.driver = WebDriverSingleton.getDriver();
	}
	ControlHelper controlHelper = new ControlHelper(driver);
	POMAddToWishlistAndRemove wishlist = new POMAddToWishlistAndRemove();
	@Given("a logged-in user is on the product page")
	public void a_logged_in_user_is_on_the_product_page() throws Exception {
		wishlist.login();
	}
	@When("user clicks on KidsGlasses")
	public void user_clicks_on_kids_glasses() throws Exception {
		wishlist.kidsGlasses();
	}
	@When("the user adds an item to their wishlist")
	public void the_user_adds_an_item_to_their_wishlist() throws Exception {
		wishlist.SelectingRandomProduct();
		wishlist.clickOnWishlist();
		wishlist.clickOnWIshlistProduct();
		wishlist.clickOnwishlistprodValidation();
		wishlist.removeWishlist();	
	}
	@When("user clicks on wishlist")
	public void user_clicks_on_wishlist() throws Exception {
	}
	@Then("user validate price of select product")
	public void user_validate_price_of_select_product() {
	}
	//REMOVE THE PRODUCT
	@Given("a logged-in user has items in their wishlist'")
	public void a_logged_in_user_has_items_in_their_wishlist() throws Exception {	
	//	wishlist.login();
	}
	@When("user click on wishlst")
	public void user_click_on_wishlst() throws Exception {
	//	wishlist.clickOnWishlist();
	//	wishlist.clickOnWIshlistProduct();

		//validation 
	//	wishlist.clickOnwishlistprodValidation();
	}
	@When("the user removes added item from their wishlist")
	public void the_user_removes_added_item_from_their_wishlist() throws Exception {
	//	wishlist.removeWishlist();
	}
	@Then("the item should be removed from the user wishlist")
	public void the_item_should_be_removed_from_the_user_wishlist() {
	}
}