package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Initializations {
	static Properties properties=new Properties();
	public static String getData(String propName) throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\data.properties");
		properties.load(fis);
		String prop=properties.getProperty(propName);
		return prop;
	}
	
	
	

}
