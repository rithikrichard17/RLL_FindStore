package Stepdefinition;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;

import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pagefactory.EditAddressBook;
import Pagefactory.EditChildProfile;
import Pagefactory.HoverMouse;
//import Utils.ReadExcel;

public class MyProfile 
{
	private final WebDriver driver;
	private final EditAddressBook editaddressbook;
	private final EditChildProfile editchildprofile;
	private final HoverMouse hovermouse;

	public MyProfile() {
		driver = new ChromeDriver();
		editaddressbook = new EditAddressBook(driver);
		editchildprofile = new EditChildProfile(driver);
		hovermouse= new  HoverMouse(driver);

	}
	//public static Logger log;
	//HoverMouse hovermouse; 
//    ReadExcel excelReader;
	
	@Given("I open the browser")
	public void i_open_the_browser() 
	{
//	    driver = new EdgeDriver();
		driver.get("https://www.firstcry.com/");
	    driver.manage().window().maximize();
	//	log= LogManager.getLogger(MyProfile.class);

	}

	@When("I navigate to the application")
	public void i_navigate_to_the_application() 
	{
	  //  driver.get("https://www.firstcry.com/");
	}
	
	@When("I Log in with valid credentials")

	public void i_log_in_with_valid_credentials() throws InterruptedException {
		
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();
	    driver.findElement(By.id("lemail")).sendKeys("rrch1717@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"emailsection\"]/ul/li/p")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[3]/span")).click();
	    Thread.sleep(30000);
	    driver.findElement(By.id("verfiedbtn")).click();
	}

	@When("I click on My Account")
	public void i_click_on_my_account() 
	{
//		hovermouse = new HoverMouse(driver);
		hovermouse.hoverOverMyAccount();
	}

	@When("I select My Profile")
	public void i_select_my_profile() 
	{
		hovermouse.clickMyProfile();
		
	}

	@When("I perform an Edit operation")
	public void i_perform_an_edit_operation() throws IOException 
	{
		
		editaddressbook.enterDetails();
	
		//driver.close();
		
//      EditAddressBook addressBook = new EditAddressBook(driver);
		
/*		String[][] data = ReadExcel.getData("C:\\Users\\User\\Downloads\\Data.xlsx", "Sheet1");

		for(int i = 1; i < 2; i++)
		{
			String name = data[i][0];
			String buildingName = data[i][1];
			String streetAddress = data[i][2];
			String pincode = data[i][3];
			String city = data[i][4];
			String state = data[i][5];
			String country = data[i][6];
			String mobileNo = data[i][7];
					
		boolean dataIsCorrect = true;
		if (dataIsCorrect) {
//		    addressBook.enterDetails();
			addressBook.enterDetails(name, buildingName, streetAddress, pincode, city, state, country, mobileNo);
		} else {
			String expectedErrText = "Special characters & Numbers are not allowed. Max up to 40 Characters.";
		    String actualErrText = addressBook.getErrText();

		    // Print actual and expected error messages for debugging
		    System.out.println("Expected Error Text: " + expectedErrText);
		    System.out.println("Actual Error Text: " + actualErrText);
             
	}
	}*/
}
	
}