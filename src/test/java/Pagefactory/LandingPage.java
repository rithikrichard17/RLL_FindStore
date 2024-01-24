package Pagefactory;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	Actions actions;
	@FindBy(xpath = "//li[contains(@class,'logreg')]")
	private WebElement goToLogIn;
	
	
	@FindBy(xpath = "//span[contains(@class,'anch myacc_2')]")
	private WebElement myAccText;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);
		new WebDriverWait(driver,Duration.ofSeconds(60));
	}
	
	
	public void goToLogInPage() {
		goToLogIn.click();
	}
	
	
	
	
	public String getMyaccText() {
		return myAccText.getText();
	}
	
}
	
	
	
	
	
	


