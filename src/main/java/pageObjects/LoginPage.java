package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import helpers.Wait;
import managers.FileReaderManager;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using ="txtUsername")
	@CacheLookup
	WebElement username;
	
	@FindBy(how = How.ID, using ="txtPassword")
	@CacheLookup
	WebElement textpasswrd;
	
	@FindBy(how = How.ID, using ="btnLogin")
	@CacheLookup
	private WebElement submitbtn;
	
	public void navigateToLoginPage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());

	}
	
	public void loginHrmAccount(String name, String passwrd) {
		username.sendKeys(name);
		textpasswrd.sendKeys(passwrd);
		submitbtn.click();
		Wait.untilPageLoadComplete(driver);
	}
	
	public void InvaildloginHrmAccount(String name, String passwrd) {
		username.sendKeys(name);
		textpasswrd.sendKeys(passwrd);
		submitbtn.click();
		Wait.untilPageLoadComplete(driver);
	}

}
