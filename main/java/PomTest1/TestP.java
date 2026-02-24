package PomTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestP
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("e:\\notes\\selenium\\test.html");
		FirstPomPage fp=new FirstPomPage(driver);
		fp.enterUserId("aaaa");
		fp.enterPAssword("1111");
		fp.btnClick();
	}

}
