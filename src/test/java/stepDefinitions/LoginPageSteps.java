package stepDefinitions;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.TestContext;
//import dataProviders.ConfigFileReader;
import managers.PageObjectManager;
import managers.WebDriverManager;
import managers.FileReaderManager;
import org.junit.Assert;  
import pageObjects.LoginPage;
import pageObjects.HomePage;

public class LoginPageSteps {
	WebDriver driver;
	LoginPage loginpage;
	//HomePage homepage;
	//PageObjectManager pageObjectManager;
	//WebDriverManager webDriverManager;

	TestContext testContext;
	
	public  LoginPageSteps(TestContext context) {
		testContext = context;
		loginpage = testContext.getPageObjectManager().getLoginPage();
		
	}
	
	@Given("^I visit the website$")
	public void i_visit_the_website() throws Throwable {
	//	webDriverManager = new WebDriverManager();
	//	driver = webDriverManager.getDriver();
	//	driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

	loginpage.navigateToLoginPage();
	}

	@When("^I enter valid account detaits$")
	public void i_enter_valid_account_detaits() throws Throwable {
		//pageObjectManager = new PageObjectManager(driver);	 
		//loginpage = pageObjectManager.getLoginPage();
		loginpage.loginHrmAccount(FileReaderManager.getInstance().getConfigReader().getUserName(), FileReaderManager.getInstance().getConfigReader().getPassword());
	}


	@When("^I enter invalid account detaits$")
	public void i_enter_invalid_account_detaits() throws Throwable {
		//pageObjectManager = new PageObjectManager(driver);	 
		//loginpage = pageObjectManager.getLoginPage();
		loginpage.InvaildloginHrmAccount(FileReaderManager.getInstance().getConfigReader().ingetUserName(), FileReaderManager.getInstance().getConfigReader().ingetPassword());
	}
}
