package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.Initializations;
import Pages.AddToCartPage;


public class AddToCartPageTest extends Initializations {

	@Test
	public void addToCart()
	{
		AddToCartPage addToCartObj=PageFactory.initElements(driver, AddToCartPage.class);
		//int cart_count_initial=addToCartObj.getCartCount();
		
		String cart_count_initial=addToCartObj.getCartCount();
		addToCartObj.addToCart();
		
		
		//int cart_count_final=addToCartObj.getCartCount();
		
		String cart_count_final=addToCartObj.getCartCount();
		
		/*if(cart_count_final>cart_count_initial)
		{
			Assert.assertTrue(true, "Item is added to cart");
		}
		else
		{
			Assert.assertTrue(false, "Item is not added to cart");
		}*/
		
		if((cart_count_final.equals(cart_count_initial)))
		{
			Assert.assertTrue(true, "Item is not added to cart");
		}
		else
		{
			Assert.assertTrue(false, "Item is added to cart");
		}
		
		
	}
}
