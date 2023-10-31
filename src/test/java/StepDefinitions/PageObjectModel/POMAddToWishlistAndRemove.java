package StepDefinitions.PageObjectModel;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import StepDefinitions.ControlHelper;
import StepDefinitions.Hook.Hook;
import StepDefinitions.Hook.WebDriverSingleton;

public class POMAddToWishlistAndRemove {
	public WebElement element;//Random X-path by price(Actual price)
	public WebElement element1;//Expected price x-path
	public WebElement element2;// x-path of wishlist
	public WebElement element3;//remove product price actual value
	public WebElement element4;//remove product price expected value
	public WebElement element5;//clicks on remove wishlist icon

	String baseXPath;
	String baseXPath1;
	int randomIndex;
	String randomXPath;
	String randomXPath1;
	String randomXPathName;
	String baseXpath1;
	String expectedName;
	String actualprice;
	String Expectedprice;


	String ActualPriceValue;
	String ExpectedPriceValue;
	String actualName;
	String actualValue;



	WebDriver driver ;
	ControlHelper controlHelper;
	POMAddToCartLenskart addtocart;
	public  POMAddToWishlistAndRemove() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();
		// this.driver = WebDriverSingleton.getDriver();
		  controlHelper = new ControlHelper(driver);
			 addtocart = new POMAddToCartLenskart();

	}


	//Driver From hook
//	WebDriver driver = Hook.driver;
	//ControlHelper
	

	public void login() throws Exception {	
		addtocart.login();
	}



	public void kidsGlasses() throws Exception {
		controlHelper.clickButton(By.xpath("//a[normalize-space()='Kids Glasses']"));
		Thread.sleep(3000);
	}




	public void SelectingRandomProduct() throws Exception {
		Thread.sleep(3000);
		baseXPath ="(//div[@id='Similar_Products']/following-sibling::div/descendant::a[contains(@class,'AnchorWrapper')]//*[name()='svg' and @class='wishlist-icon'])[%d]";
		baseXPath1="(//div[@id='Similar_Products']/following-sibling::div/descendant::a[contains(@class,'AnchorWrapper')]//*[name()='svg' and @class='wishlist-icon'])[%d]/parent::div/following-sibling::div[2]/descendant::span[contains(@class,'SpecialPrice')]";
		Random random = new Random();
		randomIndex = random.nextInt(1) + 1;
		randomXPath = String.format(baseXPath, randomIndex); 
		randomXPath1 = String.format(baseXPath1, randomIndex); 
		// Assign element using the random XPath
		element = driver.findElement(By.xpath(randomXPath));
		element1 = driver.findElement(By.xpath(randomXPath1));
		Thread.sleep(3000);
		actualValue = element.getText(); //Storing element name in String actualValue
		System.out.println(actualValue);//Printing actualValue
		ActualPriceValue = element1.getText();
		System.out.println(ActualPriceValue);
		System.out.println(actualValue);

		element.click();//Performing clicking operation

	}






	public void clickOnWishlist() throws Exception {
		controlHelper.clickButton(By.xpath("//span[normalize-space()='Wishlist']"));
		Thread.sleep(3000);
	}



	public void clickOnWIshlistProduct() throws Exception {
		Thread.sleep(3000);
		element3 = driver.findElement(By.xpath("//div[@id='wishlistView']//div[1]//div[1]//a[2]//div[2]//span[1]"));
		actualprice = element3.getText().replaceAll("\\s", "");  // Remove spaces from actual price
		element3.click();
		Thread.sleep(3000);





	}


	public void clickOnwishlistprodValidation() throws Exception {
		Thread.sleep(3000);
		ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());//ArrayList for Driver for shifting from one page to another page
		driver.switchTo().window(newTb1.get(1)); //1 index for number of Tabs we want to forward  
		Thread.sleep(9000); 

		element4 = driver.findElement(By.xpath("//div[@class='ProductDetailsContainer--9uz8j8 jiJjgp']/descendant::span[@class='SpecialPriceSpan--1olt47v eowfNn']"));
		Expectedprice = element4.getText().replaceAll("\\s", "");  
		//      Remove spaces from expected price
		//		Thread.sleep(3000);

		Assert.assertEquals(actualprice, Expectedprice);

	}






	public void removeWishlist() throws Exception {

		Thread.sleep(9000);
		element5    =  driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M12 4.248C')]"));
		element5.click();
		Thread.sleep(3000);


	} 

}



