package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.toollist.safebear.co.uk.toollis.AbstractPageStepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPages;

public class LoginStepDefinition extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();

	private LoginPages lp;

	@Given("^i am on toolslist website$")
	public void i_am_on_toolslist_website() throws Throwable {
		// System.setProperty("webdriver.gecko.driver", "geckodriver");
		// WebDriver driver = new FirefoxDriver();
		driver.get("http://toolslist.safebear.co.uk:8080/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		lp = new LoginPages(driver);

	}

	@When("^i enter valid username$")
	public void i_enter_valid_username() throws Throwable {
		lp.enterUsername("tester");

	}

	@When("^i enter valid password$")
	public void i_enter_valid_password() throws Throwable {
		lp.enterPassword("letmein");

	}

	@When("^i click login$")
	public void i_click_login() throws Throwable {
		lp.clickLogin();

	}

	@Then("^login successful message should be displayed$")
	public void login_successful_message_should_be_displayed() throws Throwable {
		boolean welcomeTester = driver.findElement(By.cssSelector("body > div > div:nth-child(3) > h1")).isDisplayed();
		Assert.assertTrue(welcomeTester);
	}

}
