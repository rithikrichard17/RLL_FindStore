package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FindStorePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='anch poplogin_main poplogin R12_61']")
    WebElement Loginicon;

	@FindBy(xpath="//span[text()='Stores & Preschools']")
    WebElement storespreschool;
	
	@FindBy(xpath="//span[text()='Find Stores']")
	WebElement findstores;
	
	@FindBy(xpath="//option[@value='FirstCry']")
    WebElement FirstCry;
	
	@FindBy(xpath="//option[@value='Karnataka']")
    WebElement Karnataka;
	
	@FindBy(xpath="//option[@value='Bangalore KR Puram']")
    WebElement Bangalorekrpuram;
	
	@FindBy(xpath="//*[@id=\"login\"]/div/div[3]/span")
    WebElement Continuebtn;
	
	@FindBy(id="verfiedbtn")
    WebElement Submitbtn;
	
	@FindBy(xpath="//*[@id=\"emailsection\"]/ul/li/p")
	WebElement emailsection;
	
	@FindBy(id="lemail")
	WebElement EnterEmail;
	
	
	
	public FindStorePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	public void navigateToURL(String url) {
		driver.get(url);
	}
	
    public void clickonLoginIcon() {
		
    	Loginicon.click();
	}
	
	public void clickonstorespreschool() {
		
		storespreschool.click();
	}
	
	public void clickonfindstores() {
		
		findstores.click();
		
	}
	
	public void clickonFirstCry() {
		
		FirstCry.click();
		
	}
	
	public void clickonKarnataka() {
		
		Karnataka.click();
		
	}
	
	public void clickonBangalorekrpuram () {
		
		Bangalorekrpuram.click();
	}	
	
	public void enteremail() {
		
		EnterEmail.sendKeys("rrch1717@gmail.com");
	}
	
	public void clickonemailsection() {
		
		emailsection.click();
	}
	
		
	public void clickContinuebtn() {
		
		Continuebtn.click();
	}
	
	public void clickonsubmitbtn() {
		
		Submitbtn.click();
		
	}
}
