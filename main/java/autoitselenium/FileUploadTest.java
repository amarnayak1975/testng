package autoitselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest
{
	public static void main(String[] args) throws Exception 
	{

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open file upload page
        driver.get("https://the-internet.herokuapp.com/upload");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",
                driver.findElement(By.id("file-upload")));

        Thread.sleep(2000);

        Runtime.getRuntime().exec("E:\\autoit\\GuiTest.exe");

        
      
     
        driver.findElement(By.id("file-submit")).click();

        // Close browser
        Thread.sleep(3000);
        driver.quit();
	}
}



