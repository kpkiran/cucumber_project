package stepdefinition;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import com.ravikiran.cucumber.Cucumber_Project.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class HomepageStepDefinition {

	public RemoteWebDriver driver;
	public HomePage homePage;
	public LoginPage loginPage;

	@Given("^User is logged into the application$")
	public void user_is_logged_into_the_application() throws Throwable {
		driver = Base.initializeDriver();
		loginPage = new LoginPage(driver);
		String username = (String) Base.properties.get("username");
		String password = (String) Base.properties.get("password");
		loginPage.getUsername().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		loginPage.getLoginButton().click();
	}

	@When("^User clicks on Employee Details link$")
	public void user_clicks_on_employee_details_link() throws Throwable {
		homePage = new HomePage(driver);
		homePage.getEmployeeDetails().click();
	}

	@Then("^User is displayed with Employee details page$")
	public void user_is_displayed_with_employee_details_page() throws Throwable {
		Assert.assertTrue(homePage.getTable().isDisplayed());
	}

	@Then("^User click on the create new button$")
	public void user_click_on_the_create_new_button() throws Throwable {
		homePage.getCreateNewButton().click();
		Assert.assertEquals("http://eaapp.somee.com/Employee/Create", driver.getCurrentUrl());
	}

}
