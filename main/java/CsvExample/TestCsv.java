package CsvExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCsv
{

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new ChromeDriver();

        String csvFile = "E:\\notes\\selenium\\userpass.csv";
        BufferedReader br = new BufferedReader(new FileReader(csvFile));

        String line;
        boolean isFirstLine = true;

        while ((line = br.readLine()) != null)
        {
            if (isFirstLine)
            {
                isFirstLine = false;
                continue;
            }
            String[] data = line.split(",");
            String username = data[0];
            String password = data[1];
            driver.get("file:///E:/notes/selenium/test.html");
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            driver.findElement(By.id("submit")).click();
            String un = "aaaa";
            if (un.equals(username))
            {
                System.out.println("Login successful for: " + username);
            } else
            {
                System.out.println("Login failed for: " + username);
            }
        }

        br.close();
        driver.quit();
	}

}




