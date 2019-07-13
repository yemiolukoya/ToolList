package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownTabPage {

	WebDriver driver;
	@FindBy(id = "num1")
	private WebElement firstDropDown;

	@FindBy(id = "num2")
	private WebElement secondDropDown;

	@FindBy(css = "body > div > div > div.form-group > form > input")
	private WebElement submitBtn;
	
	public DropDownTabPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	public void selectFirstDropDown () {
		Select selectFirstDrpDwn = new Select(firstDropDown);
		selectFirstDrpDwn.selectByIndex(2);
	}
	
	public void selectSecondDropDown () {
		Select selectSecondDrpDwn = new Select(secondDropDown);
		selectSecondDrpDwn.selectByIndex(2);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
}
