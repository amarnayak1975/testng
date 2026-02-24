package PomTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest 
{
	WebDriver driver;
  @Test
  public void f()
  {
	  driver=new ChromeDriver();
	  RegistrationPOM r=new RegistrationPOM(driver);
	  driver.get("e:\\notes\\selenium\\regn.html");
	  r.registration("ash", "bsh", "aa","ss");
  }
}
