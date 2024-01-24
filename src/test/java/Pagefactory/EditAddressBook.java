package Pagefactory;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class EditAddressBook 
	{
		@FindBy(id = "txtAddName")
		private WebElement name;
		
		@FindBy(id = "txtAddAddress1")
		private WebElement buildingName;
		
		@FindBy(id = "txtAddAddress2")
		private WebElement streetAddress;
		
		@FindBy(id = "txtAddPincode")
		private WebElement pincode;
		
		@FindBy(id = "txtAddcity")
		private WebElement city;
		
		@FindBy(id = "txtAddState")
		private WebElement state;
		
		@FindBy(id = "txtAddCountry")
		private WebElement country;
		
		@FindBy(id = "txtAddMobile")
		private WebElement mobileNo;
		
		@FindBy(id = "btnSaveAddress")
		private WebElement save;
		
		@FindBy(xpath = "(//span[contains(@class,'validation-summary-errors')])[1]")
		private WebElement incorrectName;
		
		@FindBy(xpath = "(//span[contains(@class,'validation-summary-errors')])[2]")
		private WebElement incorrectBuildingName;
		
		public EditAddressBook(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void enterDetails()
		{
		name.sendKeys("santhosh k");
		buildingName.sendKeys("santhu Apartment");
			streetAddress.sendKeys("kalenahalli");
			pincode.sendKeys("573116");
			city.sendKeys("channarayapatna");
			state.sendKeys("Karnataka");
			country.sendKeys("India");
			mobileNo.sendKeys("7899790199");
			save.click();
		} 
		
	  /*public void enterDetails(String name, String buildingName, String streetAddress, String pincode, String city, String state, String country, String mobileNo)
	  {
	      this.name.sendKeys(name);
	      this.buildingName.sendKeys(buildingName);
	      this.streetAddress.sendKeys(streetAddress);
	      this.pincode.sendKeys(pincode);
	      this.city.sendKeys(city);
	      this.state.sendKeys(state);
	      this.country.sendKeys(country);
	      this.mobileNo.sendKeys(mobileNo);
	      save.click();
	  }*/
		
	/*	public String getErrText()
		{
			String Text = incorrectName.getText();
			return Text;
		}
		
		public String getErrMessage()
		{
			String message = incorrectBuildingName.getText();
			return message;
		}*/
		
		
	}

