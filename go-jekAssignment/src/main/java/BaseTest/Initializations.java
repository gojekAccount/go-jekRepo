package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class Initializations {
	static Properties properties=new Properties();
	protected static WebDriver driver;
	static Select select;
	public static String getData(String propName) throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\data.properties");
		properties.load(fis);
		String prop=properties.getProperty(propName);
		return prop;
	}
	
	
	

}
