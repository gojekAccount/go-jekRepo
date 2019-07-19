package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutPage {
	
	WebDriver driver;
	Actions actions;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-cart']")
	WebElement checkout_Cart;
	
	@FindAll(@FindBy(how=How.XPATH,using="//input[@value='Delete']"))
	List<WebElement> delete;
	
	@FindBy(how=How.XPATH,using=".//*[@id='sc-buy-box-ptc-button']/span/input")
	WebElement proceed_to_buy;

	@FindBy(how=How.XPATH,using=".//*[@id='a-autoid-0-announce")
	WebElement decrement;
	
	
	
	public void checkOut()
	{
		checkout_Cart.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		actions=new Actions(driver);
		actions.moveToElement(delete.get(delete.size()-1)).click().build().perform();
		//decrement.click();
		//decrement.sendKeys(Keys.UP);
		//decrement.sendKeys(Keys.ENTER);
		proceed_to_buy.click();

	}
	
	

}
