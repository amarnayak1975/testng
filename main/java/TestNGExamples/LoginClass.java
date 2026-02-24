package TestNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass
{
	WebDriver driver;
	
	@FindBy(id="username") WebElement txtUsername;
	@FindBy(id="password") WebElement txtPassword;
	@FindBy(id="loginbtn") WebElement btnSubmit;
	
	LoginClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String u,String p)
	{
		txtUsername.sendKeys(u);
		txtPassword.sendKeys(p);
		btnSubmit.click();
	}
	
}
