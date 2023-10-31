package StepDefinitions.PageObjectModel;

import java.util.ArrayList;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import StepDefinitions.ControlHelper;
import StepDefinitions.Hook.Hook;

public class LenskartSelectProductPOM {
	WebDriver driver ;
	public  LenskartSelectProductPOM() {
		Hook hook=new Hook();
		 this.driver = hook.getDriver();
	}

	//WebDriver driver = WebDriverSingleton.getDriver();
	ControlHelper controlHelper = new ControlHelper(driver);
	
	public void loginLenskart() throws Exception {	
		//this.driver=Hook.driver;
		Thread.sleep(4000);
		controlHelper.clickButton(By.id("wzrk-cancel"));
		Thread.sleep(3000);
		controlHelper.clickButton(By.xpath("//span[normalize-space()='Sign In']"));
		Thread.sleep(3000);
		controlHelper.enterText(By.xpath("//input[@placeholder='Mobile / Email']"), "wwwvamsi7@gmail.com");
		Thread.sleep(3000);
		controlHelper.clickButton(By.xpath("//button[@class='ButtonWrapper--18uby1n iTsdrr']"));
		Thread.sleep(3000);
		controlHelper.clickButton(By.xpath("//input[@placeholder='Enter Password']"));
		Thread.sleep(3000);
		controlHelper.enterText(By.xpath("//input[@placeholder='Enter Password']"), "Vamsi@123");
		Thread.sleep(3000);
		controlHelper.clickButton(By.xpath("//button[@class='ButtonWrapper--18uby1n iTsdrr']"));
		Thread.sleep(3000);
	}
	public void selectEyeglases() throws Exception {
		Thread.sleep(3000);
		
			WebElement Name = driver.findElement(By.xpath("//a[normalize-space()='Eyeglasses' ]/parent::div[@class='LastRowLinkContainer--1wqxbsm bZJjJN']"));
			 String actualText1 = Name.getText();
			 String expectedText1 = "EYEGLASSES";
			 Assert.assertEquals(actualText1, expectedText1);
			    
		controlHelper.clickButton(By.xpath("//a[normalize-space()='Eyeglasses' ]/parent::div[@class='LastRowLinkContainer--1wqxbsm bZJjJN']"));
	}
	public void viewRange() throws InterruptedException {
	    Thread.sleep(3000);
	    // Click the VIEW RANGE button
//	    controlHelper.clickButton(By.xpath("//a[@href='/eyeglasses/offer/eyeglasses.html']//div[@class='CategoryCarouselstyles__VIEW_RANGE_CONTAINER-sc-rgbt65-11 kJWHAA'][normalize-space()='VIEW RANGE']"));
//	    Thread.sleep(3000);
	    // Get the text of the element
	    WebElement element = driver.findElement(By.xpath("//a[@href='/eyeglasses/offer/eyeglasses.html']//div[@class='CategoryCarouselstyles__VIEW_RANGE_CONTAINER-sc-rgbt65-11 kJWHAA'][normalize-space()='VIEW RANGE']"));
	    String actualText = element.getText();
	    // Define the expected text
	    String expectedText = "VIEW RANGE";  // Replace with your expected text
	    // Checking the actual text against the expected text
	    Assert.assertEquals(actualText, expectedText);
	    element.click();
	}

	public void clickOnImg() throws Exception {
		controlHelper.clickButton(By.xpath("//div[@class='ListingStyles__CardWrapperParent-sc-hgixc8-11 jczSUP']//div//div[1]//div[1]//div[1]//a[1]//div[2]//img[1]"));
		Thread.sleep(3000);
	}
	public void  jsCode() {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
	}
	public void SelectLens() throws Exception {
		controlHelper.clickButton(By.xpath("//button[@id='btn-primary']//p[@class='PrimaryText--1m1wiht eUdCBJ']"));
		Thread.sleep(3000);
	}
	public void onlyFrame() throws Exception {
		controlHelper.clickButton(By.xpath("//div[@id='frame_only']//div[@class='ContentWrapper--1hzntad hlKoA-d']"));
		Thread.sleep(3000);
	}
}