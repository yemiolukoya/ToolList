package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalExercisesPage {
	WebDriver driver;

	@FindBy(css = "body > div > div:nth-child(10) > form > button")
	private WebElement AdditionalExercisesTab;

	public AdditionalExercisesPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public void clickAdditionalExercises() {
		AdditionalExercisesTab.click();
	}

}
