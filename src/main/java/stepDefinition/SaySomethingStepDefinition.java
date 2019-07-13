package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.toollist.safebear.co.uk.toollis.AbstractPageStepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SaySomethingPage;

public class SaySomethingStepDefinition extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();

	private SaySomethingPage sp;

	@When("^click say something$")
	public void click_say_something() throws Throwable {
		sp = new SaySomethingPage(driver);

		sp.clickSaySomethingTab();
		Alert alert = driver.switchTo().alert();
		//alert.sendKeys("keys");
		alert.dismiss();
	}

	@When("^what would you like to say window is opened$")
	public void what_would_you_like_to_say_window_is_opened() throws Throwable {

	}

	@When("^user type something$")
	public void user_type_something() throws Throwable {

	}

	@When("^click ok$")
	public void click_ok() throws Throwable {

	}

	@Then("^you said field is updated$")
	public void you_said_field_is_updated() throws Throwable {

	}

}
