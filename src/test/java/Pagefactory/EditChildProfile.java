package Pagefactory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class EditChildProfile 
	{
		@FindBy(id = "childFnLName")
		private WebElement name;
		
		@FindBy(id = "childDOB")
		private WebElement dob;
		
		@FindBy(id = "childGenderGirl")
		private WebElement gender;
		
		@FindBy(id = "weight")
		private WebElement weight;
		
		@FindBy(id = "height")
		private WebElement height;
		
		@FindBy(id = "btn_1")
		private WebElement save;
		
		public EditChildProfile(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void enterDetails()
		{
			name.sendKeys("Baby");
			dob.sendKeys("13/09/2023");
			gender.click();
			weight.sendKeys("10");
			height.sendKeys("50");
			save.click();
		}

}
