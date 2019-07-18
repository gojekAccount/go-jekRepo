package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCartPage {
	
	WebDriver driver;
	Actions actions;
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-link-shopall']")
	WebElement shopBycategory;
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-flyout-shopAll']/div[2]/span[7]/span")
	WebElement electronics;
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-flyout-shopAll']/div[3]/div[7]/div[1]/div/a[3]/span")
	WebElement headphones;
	
	@FindBy(how=How.XPATH,using=".//*[@id='100_dealView_1']/div/div[2]/div/div/div[10]/div/span/span/span/button")
	WebElement cart;
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-cart-count']")
	WebElement cart_count;
	
	public void addToCart()
	{
		actions=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		actions.moveToElement(shopBycategory).moveToElement(electronics).moveToElement(headphones).click().build().perform();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		cart.click();
	}
	
	/*public int getCartCount()
	{
		String str=cart_count.getText();
		int count=Integer.parseInt(str);
		return count;
	}*/
	
	public String getCartCount()
	{
		String str=cart_count.getText();
		return str;
	}
	 
	
	

}
