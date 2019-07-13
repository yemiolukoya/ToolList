package stepDefinition;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.toollist.safebear.co.uk.toollis.AbstractPageStepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GoToFramePage;

public class goToFrameStepDefinition extends AbstractPageStepDefinition {
	JavascriptExecutor executor;

	WebDriver driver = getDriver();

	private GoToFramePage gp;

	@When("^click go to frame$")
	public void click_go_to_frame() throws Throwable {
		gp = new GoToFramePage(driver);

		// hand window

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle is" + parentWindowHandle);
		gp.clickGoToFrame();

		//Thread.sleep(4000);

		System.out.println(driver.getTitle());

		for (String childTab : driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}

		//Thread.sleep(4000);

		System.out.println(driver.getTitle());
		gp.clickSafeBearImage();
		//driver.findElement(By.cssSelector("body > a > img")).click();
	}

	@When("^safebear page is displayed$")
	public void safebear_page_is_displayed() throws Throwable {

	}

	@When("^safebear text is click$")
	public void safebear_text_is_click() throws Throwable {

	}

	@Then("^user should be navigated to safebear Live site$")
	public void user_should_be_navigated_to_safebear_Live_site() throws Throwable {

	}

}
