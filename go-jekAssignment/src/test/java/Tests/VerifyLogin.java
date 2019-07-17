package Tests;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		login_page.loginToAmazon("myassignmentgojek@gmail.com", "gO_jekAssiGnment@1707");
	}
}
