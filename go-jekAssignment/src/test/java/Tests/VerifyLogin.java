package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPage;
import utilities.BrowserFactory;

public class VerifyLogin {

	@Test
	public void checkUserLogin()
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://www.amazon.in/");
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		login_page.loginToAmazon("Go_jek", "gO_jekAssiGnment@1707");
	}
}
