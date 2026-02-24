package PomTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM 
{
	WebDriver driver;
	@FindBy(id="fname") WebElement fname;
	@FindBy(id="lname") WebElement lname;
	@FindBy(id="email") WebElement email;
	@FindBy(id="p") WebElement pw;
	@FindBy(id="male") WebElement m;
	@FindBy(id="c1") WebElement c;
	@FindBy(id="btnSmt") WebElement btn;
	
	public RegistrationPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void registration(String f,String l,String e,String p)
	{
		fname.sendKeys(f);
		lname.sendKeys(l);
		email.sendKeys(e);
		pw.sendKeys(p);
		m.click();
		c.click();
		c.sendKeys("india");
		btn.click();
	}
}
