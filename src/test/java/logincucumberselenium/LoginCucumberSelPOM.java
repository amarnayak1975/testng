package logincucumberselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCucumberSelPOM
{
	WebDriver driver;

    @FindBy(id = "username")
    WebElement usernameTxt;

    @FindBy(id = "password")
    WebElement passwordTxt;

    @FindBy(css = "button[type='submit']")
    WebElement loginBtn;

    @FindBy(id = "flash")
    WebElement message;

    public LoginCucumberSelPOM(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String pass)
    {
    	if (user == null) user = "";
        if (pass == null) pass = "";

        usernameTxt.clear();
        passwordTxt.clear();

        if (!user.isEmpty())
            usernameTxt.sendKeys(user);

        if (!pass.isEmpty())
            passwordTxt.sendKeys(pass);
        loginBtn.click();
    }

    public String getMessage()
    {
        return message.getText();
    }

}




