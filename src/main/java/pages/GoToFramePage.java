package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToFramePage {
	JavascriptExecutor executor;

	WebDriver driver;

	@FindBy(css = "body > div > div > p:nth-child(13) > a")
	private WebElement goToFrameTab;
	
	@FindBy(xpath = "//a[@target=\"_blank\"]//img")
	private WebElement safeBearImage;
	
	public GoToFramePage(WebDriver driver) {

		this.driver = driver;
		this.executor = (JavascriptExecutor) this.driver;


		PageFactory.initElements(driver, this);
	}
	
	public void clickGoToFrame() {
		goToFrameTab.click();
	}
	
	public void clickSafeBearImage() {
		executor.executeScript("arguments[0].click();", safeBearImage);

	}

}
