package org.automation.pages;

import java.io.IOException;

import org.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	
		WebDriver driver;
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}

		public void enterUsername(String uname) throws IOException {
			
			driver.findElement(By.id(Utility.fetchLocatorValue("Login_user_email"))).sendKeys(uname);
		}
		
		public void enterPassword(String pass) throws IOException {
			
			driver.findElement(By.id(Utility.fetchLocatorValue("Login_user_password"))).sendKeys(pass);
			
		}
		
		public void clickSubmit() throws IOException {
			
			driver.findElement(By.xpath(Utility.fetchLocatorValue("Login_submit"))).click() ;
			
		}
		
		
		
		public void clickRegister() throws IOException {
			driver.findElement(By.id(Utility.fetchLocatorValue("Click_register"))).click();
		}
		
		public void enterFirstname(String fname)throws IOException {
			driver.findElement(By.id(Utility.fetchLocatorValue("Firstname"))).sendKeys(fname);
		}
		
		public void enterLastname(String lname) throws IOException {
			driver.findElement(By.id(Utility.fetchLocatorValue("Lastname"))).sendKeys(lname);
		}
		
		public void enterMail(String mail) throws IOException {
			driver.findElement(By.id(Utility.fetchLocatorValue("Email"))).sendKeys(mail);
		}
}
