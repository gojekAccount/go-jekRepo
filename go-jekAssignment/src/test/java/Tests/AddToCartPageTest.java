package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.Initializations;
import Pages.AddToCartPage;


public class AddToCartPageTest extends Initializations {
	
	AddToCartPage addToCartObj;

	@Test
	public void addToCart()
	{
		addToCartObj=PageFactory.initElements(driver, AddToCartPage.class);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String cart_count_initial=addToCartObj.getCartCount();
		addToCartObj.addToCart();
		String cart_count_final=addToCartObj.getCartCount();
		if((cart_count_final.equals(cart_count_initial)))
		{
			Assert.assertTrue(true, "Item is not added to cart");
		}
		else
		{
			Assert.assertTrue(false, "Item is added to cart");
		}
	}
	
	@Test
	public void addToCartMac() throws IOException
	{
		addToCartObj=PageFactory.initElements(driver, AddToCartPage.class);
		driver.navigate().to(Initializations.getData("url"));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		addToCartObj.addToCartMac();
		
		
		
	}
}
