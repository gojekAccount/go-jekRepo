package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Executables\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
