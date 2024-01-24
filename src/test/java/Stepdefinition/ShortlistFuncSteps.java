package Stepdefinition;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.util.ArrayList;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	import Pagefactory.DeleteProducts;
	import Pagefactory.LoginRegister;
	import Pagefactory.ProductShortlist;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;


	public class ShortlistFuncSteps {
		WebDriver driver;
		ProductShortlist s; 
		LoginRegister login;
		private static Logger logger = LogManager.getLogger(ShortlistFuncSteps.class);
		
		@Given("I am on the login page")
		public void i_am_on_the_login_page() {
			logger.info("I am on the login page");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.firstcry.com/");
		    String e1 = driver.getTitle();
			String e2 = "Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com";
			Assert.assertEquals(e2, e1);
					
		}

		@When("I log in with valid credentials")
		public void i_log_in_with_valid_credentials() throws InterruptedException{
			logger.info("I log in with valid credentials");
		    login = new LoginRegister(driver);
		    login.clickRegister();
		    login.EnterEmailID("");
		    Thread.sleep(2000);
		    login.clickContinue();
		    Thread.sleep(30000);
		    login.clickSubmit();
		    
		    }
		

		@When("I shortlist a few products")
		public void i_shortlist_a_few_products()  {
			logger.info("I shortlist a few products");
		   s = new ProductShortlist(driver);
			s.Search("Boy fashion");
			s.Searchicon();
			s.Hoveroverproduct();
	}
		
		
		@When("I click on the Shortlist button")
		public void i_click_on_the_shortlist_button() throws InterruptedException {
			logger.info("I click on the Shortlist button");
			ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			s.shortlistsymbol();
			Thread.sleep(5000);
			login.clickMyShortlistbutton();
			Thread.sleep(5000);
			

		}

		@Then("the selected products should be in my Shortlist")
		public void the_selected_products_should_be_in_my_shortlist() throws InterruptedException {	 
			logger.info("the selected products should be in my Shortlist");
			DeleteProducts d = new DeleteProducts(driver);
			d.productdelete();
			
			driver.switchTo().alert().accept();
			captureScreenshot(driver, "Fail1.png");
			}
		
		//@SuppressWarnings("unused")
		private static void captureScreenshot (WebDriver driver, String fileName) {
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File sourceFile = screenshot.getScreenshotAs (OutputType.FILE);
	    File destinationFile= new File(fileName);
	    try {
	    Files.copy(sourceFile.toPath(), destinationFile.toPath());
	    System.out.println("Screenshot captured:" + destinationFile.getAbsoluteFile());
	    } catch (IOException e) {
	     System.out.println("Unable to capture screenshot: "+e.getMessage());
	}
	    driver.close();
		}

	
}
