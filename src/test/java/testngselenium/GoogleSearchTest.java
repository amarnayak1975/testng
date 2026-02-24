package testngselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest
{
	
	WebDriver driver;

	@BeforeClass
	public void setup()
	{
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com");
	}

	@Test(priority = 1)
	public void verifyTitlePositive()
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Google", "Title does not match");
	}

	@Test(priority = 2)
	public void verifyTitleNegative()
	{
		String actualTitle = driver.getTitle();
		Assert.assertNotEquals(actualTitle, "Yahoo", "Title should not match");
  }

	@Test(priority = 3)
	public void verifySearchBoxDisplayed()
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		Assert.assertTrue(searchBox.isDisplayed(), "Search box is not visible");
	}

	@Test(priority = 4)
	public void verifyWrongElement()
	{
		boolean isPresent = driver.findElements(By.name("wrongElement")).size() > 0;
		Assert.assertFalse(isPresent, "Wrong element should not be present");
	}

	@Test(priority = 5)
	public void searchTextPositive()
	{
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("TestNG Selenium");
		searchBox.submit();
		Assert.assertTrue(driver.getTitle().contains("TestNG"), "Search result not correct");
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
