package Pagefactory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HoverMouse 
	{
		private Actions actions;
		
		@FindBy(xpath = "//span[contains(@class,'anch myacc_2')]")
		private WebElement myAccount;
		
		@FindBy(linkText = "My Profile")
		private WebElement myProfile;
		
		public HoverMouse(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			actions = new Actions(driver);
		}
		
		public void hoverOverMyAccount()
		{
			actions.moveToElement(myAccount).build().perform();
		}
		
		public void clickMyProfile()
		{
			myProfile.click();
		}
		
	}
	
