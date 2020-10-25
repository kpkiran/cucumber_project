package stepdefinition;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

import com.ravikiran.cucumber.Cucumber_Project.*;

public class LoginStepDefinition {

	public RemoteWebDriver driver;
	LoginPage loginPage;

	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		driver = Base.initializeDriver();
		loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
	}

	@When("^User clicks on Login button$")
	public void user_clicks_on_login_button() throws Throwable {
		loginPage.getLoginButton().click();
	}

	@Then("^User gets the message (.+)$")
	public void user_gets_the_message(String message) throws Throwable {
		Assert.assertEquals(message, loginPage.getInvalidLoginError().getText());
	}

	@Then("^User should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		Assert.assertTrue(loginPage.getLogoutButton().isDisplayed());
	}

	@And("^User enters (.+) in usernamefield$")
	public void user_enters_username_in_usernamefield(String username) throws Throwable {
		loginPage.getUsername().sendKeys(username);
	}

	@And("^User enters (.+) in password field$")
	public void user_enters_password_in_password_field(String password) throws Throwable {
		loginPage.getPassword().sendKeys(password);
	}
}
