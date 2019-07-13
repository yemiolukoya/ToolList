package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaySomethingPage {

	WebDriver driver;

	@FindBy(css = "body > div > div > button")
	private WebElement saySomethingTab;

	public SaySomethingPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public void clickSaySomethingTab() {
		saySomethingTab.click();
	}

}
