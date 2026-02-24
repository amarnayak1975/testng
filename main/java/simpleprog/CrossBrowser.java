package simpleprog;

import java.util.Scanner;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;




public class CrossBrowser
{
	@Test
	public void verifyWebsiteUsingURL()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://technocratsgroup.edu.in");
		long startTime = System.currentTimeMillis();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
	    long loadTime = System.currentTimeMillis() - startTime;
	    System.out.println("Homepage loaded in: " + loadTime + " ms");
	    Assert.assertTrue(loadTime <= 5000,
	            "Homepage load performance not acceptable");

	}
	
}
