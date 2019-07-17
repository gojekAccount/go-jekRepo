package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-link-accountList']/span[1]")
	@CacheLookup
	WebElement Hello_signin;
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-flyout-ya-signin']/a/span")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ap_email']")
	@CacheLookup
	WebElement mail_id;
	
	@FindBy(how=How.XPATH,using=".//*[@id='continue']")
	@CacheLookup
	WebElement continue_button;
	
	@FindBy(how=How.XPATH,using=".//*[@id='ap_password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='signInSubmit']")
	@CacheLookup
	WebElement login_button;
	
	
	public void loginToAmazon(String uname, String pwd)
	{
		Hello_signin.click();
		signIn.click();
		mail_id.sendKeys(uname);
		continue_button.click();
		password.sendKeys(pwd);
		login_button.click();
	}
	
	
	
	

}
