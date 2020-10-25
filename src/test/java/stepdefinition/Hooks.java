package stepdefinition;


import com.ravikiran.cucumber.Cucumber_Project.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	@Before
	public void initiateBrowser() {

	}

	@After
	public void closeBrowser() {
		driver.close();
	}
}
