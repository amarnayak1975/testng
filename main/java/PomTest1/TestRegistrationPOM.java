package PomTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRegistrationPOM {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("e:\\notes\\selenium\\registration.html");
		RegistrationPOM rc=new RegistrationPOM(driver);
		rc.registration("ash", "tiwari", "a@gmail.com", "test");

	}

}


