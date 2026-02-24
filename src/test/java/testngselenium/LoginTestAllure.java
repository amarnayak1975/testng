package testngselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Listeners(AllureTestListener.class)
@Epic("Authentication Module")
@Feature("Login Feature")
public class LoginTestAllure extends BaseTestAllure
{
	protected WebDriver driver;
	 LoginTestPomAllure login;
	

  @BeforeClass
  public void setup()
  {
	  driver = new ChromeDriver();   // 🔥 THIS WAS MISSING

      driver.manage().window().maximize();
     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //WebDriver driver = BaseTestAllure.getDriver();
	  //driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/login");
  }

  @Test(priority = 1)
  @Story("Valid Login")
  @Severity(SeverityLevel.CRITICAL)
  @Description("Valid login test")
  public void validLoginTest()
  {
	  login = new LoginTestPomAllure(driver);
	  login.enterUsername("tomsmith");
      login.enterPassword("SuperSecretPassword!");
      login.clickLogin();

      Assert.assertTrue(login.getMessage().contains("You logged into a secure area"),
              "Valid login failed");
      

  }

 
  @Test(priority = 2)
  @Story("Invalid Login")
  @Severity(SeverityLevel.NORMAL)
  @Description("Invalid login test")
  public void invalidLoginTest() {

     driver.get("https://the-internet.herokuapp.com/login");
     login = new LoginTestPomAllure(driver);
      login.enterUsername("wronguser");
      login.enterPassword("wrongpass");
      login.clickLogin();

      Assert.assertTrue(login.getMessage().contains("Your username is invalid"),
              "Error message not displayed");

  }

  
  @AfterClass
  public void tearDown()
  {
      driver.quit();
  }

}
