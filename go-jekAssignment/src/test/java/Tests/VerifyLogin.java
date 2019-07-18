package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.Initializations;
import Pages.LoginPage;
import utilities.BrowserFactory;

public class VerifyLogin extends Initializations{

	//1. Test case to verify user login is successful or unsuccessful
	@Test
	public void checkUserLogin() throws IOException
	{
		WebDriver driver=BrowserFactory.startBrowser(Initializations.getData("browser"),Initializations.getData("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Creating object for LoginPage
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		
		login_page.loginToAmazon(Initializations.getData("shop_mail"), Initializations.getData("shop_pwd"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String afterLogin=login_page.textBeforeAndAfterLogin();
		
		//Condition to check user name id displayed after log into to Amazon
		if(afterLogin.contains(Initializations.getData("shop_username")))
		{
			Assert.assertTrue(true, "Logged in successfully ");
		}
		else
		{
			Assert.assertTrue(false, "Log in is unsuccessfull");
		}
	}
	
	
}
