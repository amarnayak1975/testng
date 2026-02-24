package logincucumberselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginCucumber
{
	protected WebDriver driver;
	LoginCucumberSelPOM login;

	@Given("user is on login page")
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	@When("user enters username and password")
	public void validLoginTest()
	{
		login = new LoginCucumberSelPOM(driver);
		login.login("tomsmith","SuperSecretPassword!");
	}
	@Then("user is navigated to the home page")
	public void tearDown()
	{
		driver.quit();
	}
}
