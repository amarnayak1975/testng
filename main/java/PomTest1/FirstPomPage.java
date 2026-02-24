package PomTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPomPage
{
	WebDriver driver;
	By uid=By.id("username");
	By pass=By.id("password");
	By btn=By.id("submit");
	
	FirstPomPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUserId(String uid)
	{
		driver.findElement(this.uid).sendKeys(uid);
	}
	public void enterPAssword(String pass)
	{
		driver.findElement(this.pass).sendKeys(pass);
	}
	public void btnClick()
	{
		driver.findElement(this.btn).click();
		
	}
	
}
