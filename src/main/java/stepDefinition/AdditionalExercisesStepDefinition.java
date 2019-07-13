package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.toollist.safebear.co.uk.toollis.AbstractPageStepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AdditionalExercisesPage;

public class AdditionalExercisesStepDefinition extends AbstractPageStepDefinition {
	WebDriver driver = getDriver();

	private AdditionalExercisesPage ap;

	@When("^user click additional exercises$")
	public void user_click_additional_exercises() throws Throwable {
		ap = new AdditionalExercisesPage(driver);
		ap.clickAdditionalExercises();

	}

	@Then("^Welcome to the Additional Exercises should be displayed$")
	public void welcome_to_the_Additional_Exercises_should_be_displayed() throws Throwable {
		boolean WelcomeToTheAdditionalExercises_Message = driver
				.findElement(By.cssSelector("body > div > div > div.jumbotron > h1")).isDisplayed();
		Assert.assertTrue(WelcomeToTheAdditionalExercises_Message);

		String ExpectedResult = "Welcome to the Additional Exercises";

		String ActualResult = driver.findElement(By.cssSelector("body > div > div > div.jumbotron > h1")).getText();
		
		Assert.assertEquals(ActualResult, ExpectedResult);
	}

}
