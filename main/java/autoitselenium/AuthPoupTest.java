package autoitselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AuthPoupTest
{
	public static void main(String[] args) throws Exception
	{

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        Thread.sleep(2000);
        Runtime.getRuntime().exec("e:\\autoit\\AuthPopup.exe");
        Thread.sleep(4000);
        driver.quit();
	}
}





