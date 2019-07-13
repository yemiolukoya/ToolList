package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

	JavascriptExecutor executor;

	WebDriver driver;

	@FindBy(id = "username")
	private WebElement userID;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(id = "enter")
	private WebElement login;

	public LoginPages(WebDriver driver) {

		this.driver = driver;
		this.executor = (JavascriptExecutor) this.driver;

		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username) {
		userID.sendKeys(username);
	}

	public void enterPassword(String password) {

		pwd.sendKeys(password);

	}

	public void clickLogin() {
		login.click();
	}

}
