package StepDefinitions.PageObjectModel;


import java.util.ArrayList;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import StepDefinitions.ControlHelper;
import StepDefinitions.Hook.Hook;

public class POMAddToCartLenskart {

	public WebElement element;//Random X-path by price(Actual price)
	public WebElement element1;//Expected price x-path
	public WebElement element2;//Actual name x-path
	public WebElement element3;//Expected name x-Path
	String baseXPath;
	int randomIndex;
	String randomXPath;
	String randomXPathName;
	String actualValue;
	String ExpectedValue;
	String actualName;
	String expectedName;

	WebDriver driver ;
	ControlHelper controlHelper ;
	
	public  POMAddToCartLenskart() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();
		  controlHelper = new ControlHelper(driver);

	}

	public void login() throws Exception {	
		//this.driver=Hook.driver;
		Thread.sleep(4000);
		//Removing PopUp  
		controlHelper.clickButton(By.id("wzrk-cancel"));
		Thread.sleep(3000);
		//Clicks on signIn space
		controlHelper.clickButton(By.xpath("//span[normalize-space()='Sign In']"));
		Thread.sleep(3000);
		//sending Mail into space
		controlHelper.enterText(By.xpath("//input[@placeholder='Mobile / Email']"), "wwwvamsi7@gmail.com");
		Thread.sleep(3000);
		//Clicks on SignUp button
		controlHelper.clickButton(By.xpath("//button[@id='remove-button']"));
		Thread.sleep(3000);
		//Clicks on Password space
		controlHelper.clickButton(By.xpath("//input[@placeholder='Enter Password']"));
		Thread.sleep(3000);
		//Sending password
		controlHelper.enterText(By.xpath("//input[@placeholder='Enter Password']"), "Vamsi@123");
		Thread.sleep(3000);
		//Clicks on submit button
		controlHelper.clickButton(By.xpath("//button[@id='remove-button']"));
		Thread.sleep(3000);

	}

	public void computerGlasses() throws Exception {
		//Clicks on Computer Glasses
		controlHelper.clickButton(By.xpath("//a[normalize-space()='Computer Glasses']"));
		Thread.sleep(3000);
	}
	public void RandomClick() throws Exception {
		Thread.sleep(3000);
		// Code for Get the XPath at the randomly generated index
		baseXPath = "(//div[@class='ListingStyles__CardWrapperParent-sc-hgixc8-11 jczSUP']/descendant::span[@class='SpecialPriceSpan--1olt47v jXLJtc'])[%d]";
		Random random = new Random();
		randomIndex = random.nextInt(14) + 1;
		randomXPath = String.format(baseXPath, randomIndex);
		// Assign element using the random XPath
		element = driver.findElement(By.xpath(randomXPath));	
		Thread.sleep(3000);
	}
	public void clickonRandomClick() throws Exception {
		// Call RandomClick to get the element
		actualValue = element.getText(); //Storing element name in String actualValue
		System.out.println(actualValue);//Printing actualValue
		element.click();//Performing clicking operation
		Thread.sleep(3000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());//ArrayList for Driver for shifting from one page to another page
		driver.switchTo().window(newTb.get(1)); //1 index for number of Tabs we want to forward  
		//Time lag 5 seconds
	}
	public void validationOfPrice() throws Exception {
		//Storing in webElement for getting price 
		Thread.sleep(6000);
		WebElement element1 = driver.findElement(By.xpath("//div[@class='PriceWrapper--spy5y0 bMoesg']/descendant::span[@class='SpecialPriceSpan--1olt47v eowfNn']"));
		ExpectedValue= element1.getText(); 
		Thread.sleep(3000);
		//Storing in webElement for getting name 
		WebElement element2 = driver.findElement(By.xpath("//div[@class='BasicDetailsWrapper--1ibndb2 eFZzkU']/child::h1[@class='Title--1mf9vro hPTYyn']"));
		actualName = element2.getText();
		System.out.println(actualName);
		Thread.sleep(3000);
		Assert.assertEquals(actualValue, ExpectedValue);
	}
	public void buyNow() throws Exception {
		Thread.sleep(9000);
		controlHelper.clickButton(By.xpath("//p[normalize-space()='BUY NOW']"));//Performing click operation in buy now button
		Thread.sleep(9000);
	}
public void nameValidation() {
	element3 = driver.findElement(By.xpath("(//div[@class='CartStyles__CartWrapper-sc-14bvp3n-0 kePQJa']/descendant::div[@class='ItemTitle--5mcg1a kOgjbp'])[1]"));
	element3.getText();
	expectedName = element3.getText();
	Assert.assertEquals(actualName, expectedName);	
}
	public void homepage() {
		controlHelper.clickButton(By.xpath("//img[@alt='lenskart-logo']"));//Clicking on home page icon
	}
}