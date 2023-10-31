package StepDefinitions.PageObjectModel;

import java.util.ArrayList;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import StepDefinitions.ControlHelper;
import StepDefinitions.Hook.Hook;
public class LenskartAddToCartPOM {	
	
	WebDriver driver ;
	public  LenskartAddToCartPOM() {
		Hook hook=new Hook();
		hook.getDriver();
		this.driver = hook.getDriver();

	}
	

//	
//	WebDriver driver = WebDriverSingleton.getDriver();
	ControlHelper controlHelper = new ControlHelper(driver);
	LenskartSelectProductPOM selectProduct = new LenskartSelectProductPOM();
	public void selectType() throws Exception{
		controlHelper.clickButton(By.xpath("//a[normalize-space()='Computer Glasses']"));
		Thread.sleep(3000);
		controlHelper.clickButton(By.xpath("//div[@class='ListingStyles__CardWrapperParent-sc-hgixc8-11 jczSUP']//div//div[1]//div[1]//div[1]//a[1]//div[2]//img[1]"));
		Thread.sleep(3000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		Thread.sleep(9000);
	}
	public void button() throws Exception {
		controlHelper.clickButton(By.xpath("//p[normalize-space()='BUY NOW']"));

		Thread.sleep(9000);
	}
}
