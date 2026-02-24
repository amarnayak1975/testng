package testngselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;

public class LoginTest
{
	protected WebDriver driver;
	 LoginTestPom login;
	 ExtentReports extent;
	    ExtentTest test;

  @BeforeClass
  public void setup()
  {
	  extent = ExtentReportManager.getReport();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/login");
  }

  @Test(priority = 1)
  public void validLoginTest()
  {
	  test = extent.createTest("Valid Login Test");
      login = new LoginTestPom(driver);
      login.enterUsername("tomsmith");
      login.enterPassword("SuperSecretPassword!");
      login.clickLogin();

      Assert.assertTrue(login.getMessage().contains("You logged into a secure area"),
              "Valid login failed");
      test.pass("Valid login successful");

  }

 
  @Test(priority = 2)
  public void invalidLoginTest() {
      test = extent.createTest("Invalid Login Test");

     driver.get("https://the-internet.herokuapp.com/login");
      login = new LoginTestPom(driver);

      login.enterUsername("wronguser");
      login.enterPassword("wrongpass");
      login.clickLogin();

      Assert.assertTrue(login.getMessage().contains("Your username is invalid"),
              "Error message not displayed");
      test.pass("Invalid login error message displayed correctly");

  }

  @AfterMethod
  public void recordResult(ITestResult result) {

      if (result.getStatus() == ITestResult.FAILURE) {
          test.fail(result.getThrowable());
      }
      else if (result.getStatus() == ITestResult.SKIP) {
          test.skip("Test skipped");
      }
  }
  @AfterClass
  public void tearDown()
  {
      driver.quit();
      extent.flush();
  }

}
