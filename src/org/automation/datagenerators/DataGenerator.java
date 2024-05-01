package org.automation.datagenerators;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	
	@DataProvider(name="Excel")
	public static Object[][] testData() throws Exception{
		
		FileInputStream file = new FileInputStream("./Testdata/Testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginSheet = workbook.getSheet("Sheet1");
		int ndata= loginSheet.getPhysicalNumberOfRows();
		Object [][] test= new Object[ndata][2];
		
		for(int i=0;i<ndata;i++) {
			
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell username= row.getCell(0);
			XSSFCell password= row.getCell(1);
			test[i][0]=username.getStringCellValue();
			test[i][1]=password.getStringCellValue();
		}
		
		return test;
	}
	
	@DataProvider(name="Register")
	public static Object[][] testingData() throws IOException {
		
		FileInputStream file = new FileInputStream("./Testdata/Testdata2.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet reg=  workbook.getSheet("Register");
		int ndata = reg.getPhysicalNumberOfRows();
		Object [][] test1 = new Object[ndata][3];
		
		for(int i=0;i<ndata;i++) {
			XSSFRow row= reg.getRow(i);
			XSSFCell fname=row.getCell(0);
			XSSFCell lname=row.getCell(1);
			XSSFCell mail= row.getCell(2);
			
			test1[i][0] = fname.getStringCellValue();
			test1[i][1] = lname.getStringCellValue();
			test1[i][2] = mail.getStringCellValue();
			
		}
		return test1;
	}
}
