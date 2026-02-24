package cucumberselenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCucumber
{
	@Given("user is on login page")
	public void userPassPage()
	{
		System.out.println("Please Enter username and password");
	}
	
	@When("user enters username and password")
	public void enteruserPass()
	{
		System.out.println("Entered username and password");
	}
	
	@And("clicks on login button")
	public void clickButton()
	{
		System.out.println("Button clicked");
	}
	
	@Then("user is navigated to the home page")
	public void navigateHome()
	{
		System.out.println("To home page");
	}
	
}
