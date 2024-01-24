package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver wait;
	
	
	
	
	
	@FindBy(id = "lemail")
	private WebElement enterEmail;
	
	@FindBy(xpath = "//div[contains(@class,'btn-login-continue')]")
	private WebElement contBTN;
	
	@FindBy(id = "verfiedbtn")
	private WebElement submitBTN;
	
	@FindBy(xpath ="/html/body/div[1]/div[5]/div/div[3]/ul/li[9]/a/span[2]")
	private WebElement myShortlistbutton;
	
	@FindBy(xpath = "/html/body/div[2]/p/text()")
	private WebElement resgisterTxt;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		new Actions(driver);
	}
	
	public void login() {
		enterEmail.sendKeys("ganeshchilukuri143@gmail.com");
//		enterEmail.sendKeys("ganeshchilukuri345@gmail.com");
	}
	
	public void clickOnCont() {
		contBTN.click();
	}
	
	public void clickOnSubmitBTN() throws InterruptedException {
		Thread.sleep(40000);
		submitBTN.click();
	}
	
	
	
	
	public void giveInvalidEmailId() {
		enterEmail.sendKeys("ganeshchilukuri143@gmail.com");
	}
	public String getRedgText() {
		return resgisterTxt.getText();
	}

}