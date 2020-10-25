package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ravikiran.cucumber.Cucumber_Project.Base;

public class LoginPage extends Base {

	public RemoteWebDriver driver;

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	By uid = By.id("UserName");
	By pid = By.id("Password");
	By login = By.xpath("//input[@type='submit']");
	By logout = By.xpath("//a[contains(text(),'Log off')]");
	By invaliLogin = By.xpath("//li[contains(text(),'Invalid login attempt.')]");
	By invalidPassword = By.xpath("//span[contains(text(),'The Password field is required.')]");
	By invalidUsername = By.xpath("//body/div[2]/div[1]/div[2]/section[1]/form[1]/div[2]/div[1]/span[1]");

	public WebElement getUsername() {
		return driver.findElement(uid);
	}

	public WebElement getPassword() {
		return driver.findElement(pid);
	}

	public WebElement getLoginButton() {
		return driver.findElement(login);
	}

	public WebElement getLogoutButton() {
		return driver.findElement(logout);
	}

	public WebElement getInvalidLoginError() {
		return driver.findElement(invaliLogin);
	}

	public WebElement getInvalidUsernameError() {
		return driver.findElement(invalidUsername);
	}

	public WebElement getInvalidPasswordError() {
		return driver.findElement(invalidPassword);
	}

}
