	package Pagefactory;
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginRegister {
		@FindBy(xpath = "//span[@class='anch Register_popup Register R12_61']")
		//span[@class='anch Register_popup Register R12_61']
		private WebElement register;
		
		@FindBy(id ="lemail")
		private WebElement emailbox;
		
		@FindBy(xpath ="/html/body/div[2]/div/form/div/div[3]/span")
		private WebElement continuebtn;
		
		@FindBy(xpath = "//*[@id=\"verfiedbtn\"]")
		private WebElement Submitbtn;
		
		@FindBy(xpath ="/html/body/div[1]/div[5]/div/div[3]/ul/li[9]/a/span[2]")
		private WebElement myShortlistbutton;
		
		
		
		public LoginRegister(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		public void clickRegister()
		{
			register.click();
		}
		public void EnterEmailID(String u) 
		{
			emailbox.sendKeys("rrch1717@gmail.com");
		}
		public void clickContinue() 
		{
			continuebtn.click();
		}
		
		public void clickSubmit() 
		{
			Submitbtn.click();
		}

		
		public  void clickMyShortlistbutton() {
			myShortlistbutton.click();
		}

}
