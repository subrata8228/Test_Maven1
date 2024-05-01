package org.automation.testcases;

import java.io.IOException;

import org.automation.base.DriverInstance;
import org.automation.datagenerators.DataGenerator;
import org.automation.pages.LoginPage;
import org.testng.annotations.Test;
public class ValidateRegister extends DriverInstance {

	
	@Test(dataProvider="Register", dataProviderClass= DataGenerator.class) 
	public void Register(String fname,String lname, String mail) throws IOException, InterruptedException {
		
		LoginPage p =new LoginPage(driver);
		Thread.sleep(5000);
		p.clickRegister();
		Thread.sleep(5000);
		p.enterFirstname(fname);
		p.enterLastname(lname);
		p.enterMail(mail);
	}
}
