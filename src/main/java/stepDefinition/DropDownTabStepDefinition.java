package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.toollist.safebear.co.uk.toollis.AbstractPageStepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DropDownTabPage;

public class DropDownTabStepDefinition extends AbstractPageStepDefinition {

	WebDriver driver = getDriver();
	DropDownTabPage dp;

	@When("^user select two numbers from the dropdowns$")
	public void user_select_two_numbers_from_the_dropdowns() throws Throwable {
		dp = new DropDownTabPage(driver);
		dp.selectFirstDropDown();
		dp.selectSecondDropDown();
	}

	@When("^click submit$")
	public void click_submit() throws Throwable {
		dp.clickSubmitBtn();

	}

	@Then("^total is displayed$")
	public void total_is_displayed() throws Throwable {
		
	String ExpectedResult = "Total = 5";
	String ActaulResult = driver.findElement(By.id("addResult")).getText();
	Assert.assertEquals(ActaulResult, ExpectedResult);

	}

}
