package SecondApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstLogin
{
	WebDriver driver;
	By uname=By.xpath("//input[@id='my-text-id']");
	By pass=By.xpath("//input[@name='my-password']");
	By login=By.xpath("//button[@type='submit']");
	FirstLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void username()
	{
		driver.findElement(uname).sendKeys("Selenium");
	}
	public void password()
	{
		driver.findElement(pass).sendKeys("admin");
	}
	public void lgnbtn()
	{
		driver.findElement(login).click();
	}
}
