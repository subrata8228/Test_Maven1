package org.automation.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Utility {
	
	public static Object fetchProperty(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("./config/config.properties");
		Properties p =new Properties();
		p.load(file);
		return p.get(key);
		
	}
	
	public static String fetchLocatorValue(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("./config/Element.properties");
		Properties p = new Properties();
		p.load(file);
		return p.get(key).toString();
	}
}
