package org.automation.testcases;



import org.automation.base.DriverInstance;
import org.automation.datagenerators.DataGenerator;
import org.automation.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ValidateLoginFunctionality extends DriverInstance {
	
	@Test(dataProvider="Excel", dataProviderClass= DataGenerator.class)
	public void loingTest(String uname,String pass ) throws Exception {
		
		LoginPage login = new LoginPage(driver);		
		login.enterPassword(uname);
		login.enterUsername(pass);
		login.clickSubmit();
	}
	
}
