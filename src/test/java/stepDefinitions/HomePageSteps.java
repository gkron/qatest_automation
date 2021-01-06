package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import helpers.TestContext;
import pageObjects.HomePage;

public class HomePageSteps {

	TestContext testContext;
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	
	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {
	//	homepage = pageObjectManager.getHomePage();
		String title= homePage.getTitle();
		Assert.assertEquals("OrangeHRM", title);
		
	}

	@Then("^I should not be able to login$")
	public void i_should_not_be_able_to_login() throws Throwable {
	//	homepage = pageObjectManager.getHomePage();
		String title= homePage.getTitle();
		Assert.assertEquals("OrangeHRM44", title);
		
	}
	
}
