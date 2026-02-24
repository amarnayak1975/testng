package TestNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest
{
	WebDriver driver;
	
  @Test
  public void test()
  {
	  driver=new ChromeDriver();
	  driver.get("e:\\notes\\selenium\\test.html");
	  LoginClass lc=new LoginClass(driver);
	  lc.login("admin", "admin");
  }
}
