package testngselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTestPomAllure
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


    public LoginTestPomAllure(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username)
    {
        usernameTxt.sendKeys(username);
    }

    public void enterPassword(String password)
    {
        passwordTxt.sendKeys(password);
    }

    public void clickLogin()
    {
        loginBtn.click();
    }

    public String getMessage()
    {
        return message.getText();
    }

}