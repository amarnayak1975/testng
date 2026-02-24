package PomPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTestPageFact
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
    	driver.get("e:\\notes\\selenium\\test.html");
        LoginClass lp = new LoginClass(driver);
    	lp.login("admin", "admin123");

	}

}
