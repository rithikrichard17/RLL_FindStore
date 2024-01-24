package Stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
//import com.google.common.io.Files;

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

		logger.info("User navigates to the web URL");
		driver.manage().window().maximize();
		findstorepage.navigateToURL("https://www.firstcry.com/");
	}

	@When("User must click on the login\\/Register")
	public void user_must_click_on_the_login_register() throws InterruptedException {
		logger.info("User must click on the login\\/Register");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();
		//findstorepage.clickonLoginIcon();
	    
	}


	@When("User Enter the valid emailID")
	public void user_enter_the_valid_email_id() {
		logger.info("User Enter the valid emailID");
		//driver.findElement(By.id("lemail")).sendKeys("rrch1717@gmail.com");
		//findstorepage.enteremail();
		//driver.findElement(By.xpath("//*[@id=\"emailsection\"]/ul/li/p")).click();
		//findstorepage.clickonemailsection();
		
	    
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() throws InterruptedException {
		logger.info("User clicks on the continue button");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[3]/span")).click();
		//findstorepage.clickContinuebtn();
	    
	}

	@When("User Enter OTP")
	public void user_enter_otp() throws InterruptedException {
		logger.info("User Enter OTP");
		System.out.println("Please Enter the OTP Manually");
	    
	}

	@When("User Clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		logger.info("User Clicks on Submit button");
		Thread.sleep(30000);
		//driver.findElement(By.id("verfiedbtn")).click();
		//findstorepage.clickonsubmitbtn();
	    
	}
	
	@Then("Validate login is successful")
	public void validate_login_is_successful() {
		logger.info("Validate login is successful");
		String e1 = driver.getTitle();
		String e2 = "FirstCry";
		Assert.assertEquals(e2, e1);
	}	
	
	@Given("User must be able to access HomePage")
	public void user_must_be_able_to_access_home_page() {
		logger.info("User must be able to access HomePage");
		System.out.println(driver.getTitle());
		
	}

	@When("User must hover over the stores&preschool")
	public void user_must_hover_over_the_stores_preschool() {
		logger.info("User must hover over the stores&preschool");
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/span/span")).click();
		findstorepage.clickonstorespreschool();
		
	}

	@When("User must click on the find stores from drop down")
	public void user_must_click_on_the_find_stores_from_drop_down() {
	    
		logger.info("User must click on the find stores from drop down");
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/ul/li[1]/a/span")).click();
		findstorepage.clickonfindstores();
	}
	
	@When("User switches focus to the new tab")
	public void user_switches_focus_to_the_new_tab() {
		logger.info("User switches focus to the new tab");
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	    
	}

	@When("User select the store Type,state and city")
	public void he_select_the_store_type_state_and_city() throws IOException, InterruptedException {
		logger.info("User select the store Type,state and city");
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
		
		logger.info("User click on the search button");
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/input[4]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", submitButton);
		captureScreenshot(driver, "pass1.png");
		//WebElement search = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div[1]/input[4]"));
		//search.click();

		
	}


	@Then("User must be able to view the store result")
	public void user_must_be_able_to_view_the_store_result() throws InterruptedException {
		
		logger.info("User must be able to view the store result");
		String title=driver.getTitle();
		System.out.println("The title is"+title);
		
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
	   // driver.close();
	}
	
	
}
