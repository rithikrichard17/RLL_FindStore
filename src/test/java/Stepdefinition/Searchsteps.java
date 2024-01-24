package Stepdefinition;
	
	
	import static org.testng.Assert.assertTrue;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.util.ArrayList;



	//import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	import Pagefactory.FirstCryPage;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;


	public class Searchsteps {
		
		private final WebDriver driver;
		private final FirstCryPage firstCryPage;
		public Searchsteps() {
			driver = new ChromeDriver();
			firstCryPage = new FirstCryPage(driver);
		        
		       
		    }
		@Given("I navigate to the FirstCry URL")
		public void i_navigate_to_the_first_cry_url() {
			
			//logger.info("I navigate to the FirstCry URL");
			driver.manage().window().maximize();
			driver.get("https://www.firstcry.com/");
			
		}

		@Given("I have valid credentials for login")
		public void i_have_valid_credentials_for_login() {
			//logger.info("I have valid credentials for login");
			//firstCryPage.login("nareshch9663@gmail.com");
		}

		@When("I log into the application with my credentials")
		public void i_log_into_the_application_with_my_credentials() throws InterruptedException {
			//logger.info("I log into the application with my credentials");
			Thread.sleep(2000);
			//firstCryPage.clickOnCont();
			//firstCryPage.clickOnSubmitBTN();
		}

		@Then("I should be redirected to the homepage")
		public void i_should_be_redirected_to_the_homepage() {
			//logger.info("I should be redirected to the homepage");
			assertTrue(driver.getTitle().equals("Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com"));
			

			
			
			
		}

		@When("I search for a specific product")
		public void i_search_for_a_specific_product() {
			//logger.info("I search for a specific product");
			firstCryPage.searchTextBox.clear();
			
		}

		@When("select  {string} from the search results")
		public void select_from_the_search_results(String searchproduct) throws InterruptedException {
			//logger.info("select  {string} from the search results");
			firstCryPage.searchTextBox.clear();
			firstCryPage.entersearchText(searchproduct);
			firstCryPage.searchitem.click();
			Thread.sleep(2000);
			firstCryPage.clickonitem.click();
			
			//logger.info("SEARCH MODULE FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");
			captureScreenshot(driver, "Fail1.png");
			
		}

		@When("User switches focus to the new tab")
		public void user_switches_focus_to_the_new_tab() {
			//logger.info("User switches focus to the new tab");
			
			ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			
		}

		@Then("title should contain {string}")
		public void title_should_contain(String string) {
			//logger.info("title should contain {string}");
		
			//WebDriverWait w = new WebDriverWait(driver,5);
			//String actualValue = firstCryPage.getTitleOfWatchesFirstItem();
			 // String expectedValue = "KIDSUN Bunny Detailing Analogue Watch - Light Pink";
			  // Assert.assertEquals(actualValue, expectedValue);
			  
		}

		
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
		    
		    //driver.close();
	}

}
