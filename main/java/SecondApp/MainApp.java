package SecondApp;

import java.io.FileInputStream;
import java.io.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import java.io.IOException;


public class MainApp 
{
public static void main( String[] args ) throws IOException, InvalidFormatException
{
	WebDriver driver = new ChromeDriver();
	 OPCPackage pkg = OPCPackage.open("E:\\notes\\selenium\\userpass.xlsx");
     XSSFWorkbook workbook = new XSSFWorkbook(pkg);

	
	Sheet sheet = workbook.getSheetAt(0);
	for (int i = 1; i <= sheet.getLastRowNum(); i++) 
	{
		Row row = sheet.getRow(i);
		String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
		driver.get("e:\\notes\\selenium\\test.html");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click();
		String currentURL = "aaaa";
	    if (currentURL.equals(username))
		{
	    	System.out.println("Login successful for: " + username);
	    }
		else 
		{
			System.out.println("Login failed for: " + username);
	    }
	}
	driver.quit();
	workbook.close();
	pkg.close();
	 }
}

   