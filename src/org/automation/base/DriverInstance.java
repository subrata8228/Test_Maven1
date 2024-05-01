package org.automation.base;


import java.io.IOException;

import org.automation.utility.Utility;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInstance {
	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriver() throws IOException {
		
		if(Utility.fetchProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
		}
		else if(Utility.fetchProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		
		driver.get(Utility.fetchProperty("url").toString());
		
	}
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
}
