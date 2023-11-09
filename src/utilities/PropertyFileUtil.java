package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil{
	public static String getValueForKey(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\krish\\eclipse-workspace\\OrangeHRM\\Environment.properties");
		Properties config=new Properties();
		config.load(fis);
		return config.getProperty(key);

	}

}
