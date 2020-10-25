package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ravikiran.cucumber.Cucumber_Project.Base;

public class HomePage extends Base {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By empTable = By.className("table");
	By employeeDetails = By.xpath("//a[contains(text(),'Employee List')]");
	By createNew = By.xpath("//*[contains(text(),'Create New')]");

	public WebElement getTable() {
		return driver.findElement(empTable);
	}

	public WebElement getEmployeeDetails() {
		return driver.findElement(employeeDetails);
	}

	public WebElement getCreateNewButton() {
		return driver.findElement(createNew);
	}
}
