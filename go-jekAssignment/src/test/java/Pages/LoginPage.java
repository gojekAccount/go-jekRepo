package Pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
public class LoginPage {
	
	WebDriver driver;
	Actions actions;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-link-accountList']/span[1]")
	WebElement signin_text;
	
	@FindBy(how=How.XPATH,using=".//*[@id='nav-link-accountList']")
	@CacheLookup
	WebElement hello_signin;
	
	
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
	
	
	public void loginToAmazon(String email, String pwd)
	{
		
		actions=new Actions(driver);
		actions.doubleClick(hello_signin).build().perform();
		mail_id.sendKeys(email);
		continue_button.click();
		password.sendKeys(pwd);
		login_button.click();
	}
	
	public String textBeforeAndAfterLogin() {
		
		String text=signin_text.getText();
		return text;
		
	}
	
	
	
	

}
