package Pagefactory;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class Clickshortlist {
		private WebDriverWait wait;

		@FindBy(linkText ="Shorlist")
		private WebElement shortlisted1;
		
		public Clickshortlist(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		}
		
		public void clickshortlisted1()
		{
			wait.until(ExpectedConditions.visibilityOf(shortlisted1));
			shortlisted1.click();
			
		}

}
