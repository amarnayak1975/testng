package PomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass
{
	WebDriver driver;
	public LoginClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement txtUname;
	
	@FindBy(id="password")
	WebElement txtPass;
	
	@FindBy(id="submit")
	WebElement btnSumbit;
	
	public void login(String uname,String pass)
	{
			txtUname.sendKeys(uname);
			txtPass.sendKeys(pass);
			btnSumbit.click();
	}
}

