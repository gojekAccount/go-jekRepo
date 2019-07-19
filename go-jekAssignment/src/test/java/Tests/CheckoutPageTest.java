package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BaseTest.Initializations;
import Pages.CheckoutPage;

public class CheckoutPageTest extends Initializations {
	
	CheckoutPage checkoutpage;
	
	
	
	@Test
	public void checkoutItem() throws IOException
	{
		checkoutpage=PageFactory.initElements(driver, CheckoutPage.class);
		driver.navigate().to(Initializations.getData("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		checkoutpage.checkOut();
		
	}

}
