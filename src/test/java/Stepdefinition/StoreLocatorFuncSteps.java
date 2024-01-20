package Stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Pagefactory.FindStorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreLocatorFuncSteps {
	
		private static final Logger logger = LogManager.getLogger(StoreLocatorFuncSteps.class);
		private final WebDriver driver;
		private final FindStorePage findstorepage;
		public StoreLocatorFuncSteps() {
			driver = new ChromeDriver();
			findstorepage = new FindStorePage(driver);
	}
	
	
	@Given("User navigates to the web URL")
	public void user_navigates_to_the_web_url() {

		logger.info("Navigating to the URL");
		driver.manage().window().maximize();
		findstorepage.navigateToURL("https://www.firstcry.com/");
	}

	@When("User must click on the login\\/Register")
	public void user_must_click_on_the_login_register() throws InterruptedException {
		logger.info("Performing the login process");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();
		findstorepage.clickonLoginIcon();
	    
	}


	@When("User Enter the valid emailID")
	public void user_enter_the_valid_email_id() {
		
		//driver.findElement(By.id("lemail")).sendKeys("rrch1717@gmail.com");
		findstorepage.enteremail();
		//driver.findElement(By.xpath("//*[@id=\"emailsection\"]/ul/li/p")).click();
		findstorepage.clickonemailsection();
		
	    
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() throws InterruptedException {
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[3]/span")).click();
		findstorepage.clickContinuebtn();
	    
	}

	@When("User Enter OTP")
	public void user_enter_otp() throws InterruptedException {
		
		System.out.println("Please Enter the OTP Manually");
	    
	}

	@When("User Clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		
		Thread.sleep(30000);
		//driver.findElement(By.id("verfiedbtn")).click();
		findstorepage.clickonsubmitbtn();
	    
	}
	
	@Then("Validate login is successful")
	public void validate_login_is_successful() {
		
		String e1 = driver.getTitle();
		String e2 = "FirstCry";
		Assert.assertEquals(e2, e1);
	}	
	
	@Given("User must be able to access HomePage")
	public void user_must_be_able_to_access_home_page() {
		
		System.out.println(driver.getTitle());
		
	}

	@When("User must hover over the stores&preschool")
	public void user_must_hover_over_the_stores_preschool() {
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/span/span")).click();
		findstorepage.clickonstorespreschool();
		
	}

	@When("User must click on the find stores from drop down")
	public void user_must_click_on_the_find_stores_from_drop_down() {
	    
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/ul/li[1]/a/span")).click();
		findstorepage.clickonfindstores();
	}
	
	@When("User switches focus to the new tab")
	public void user_switches_focus_to_the_new_tab() {
		
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	    
	}

	@When("User select the store Type,state and city")
	public void he_select_the_store_type_state_and_city() throws IOException, InterruptedException {
		
		//driver.findElement(By.xpath("//option[@value='FirstCry']")).click();
		findstorepage.clickonFirstCry();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//option[@value='Karnataka']")).click();
		findstorepage.clickonKarnataka();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//option[@value='Bangalore KR Puram']")).click();
		findstorepage.clickonBangalorekrpuram();
		Thread.sleep(10000);
		
		
	}
	
	@When("User click on the search button")
	public void user_click_on_the_search_button() throws InterruptedException {
		
	   
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/input[4]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", submitButton);
		
		//WebElement search = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/input[4]"));
		//search.click();

		
	}


	@Then("User must be able to view the store result")
	public void user_must_be_able_to_view_the_store_result() throws InterruptedException {
		
		
		String title=driver.getTitle();
		System.out.println("The title is"+title);
		
	}
	
	//@Then("User can take screenshot of the storepage")
	//public void user_can_take_screenshot_of_the_storepage() throws IOException {
	    
		//try {
		//	 driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/input[4]")).click();
		//  } catch (NoSuchElementException  e) {
		//	TakesScreenshot screenshot = (TakesScreenshot) driver;
		  //  File src = screenshot.getScreenshotAs(OutputType.FILE);
		  //  File dest = new File("D:\\Mphasis Training\\Selenium workspace\\FirstCry_RLL\\src\\test\\resources\\screenshot\\ErrorSS.png");
		   // Files.copy(src,dest);
		   // driver.close();
		//}
			 
	}

