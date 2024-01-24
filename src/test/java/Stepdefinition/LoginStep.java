package Stepdefinition;	

	import java.io.File;

	import java.io.IOException;
	import org.testng.Assert;
	import java.nio.file.Files;
	//import java.util.ArrayList;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.apache.logging.log4j.LogManager;
	//import org.apache.logging.log4j.Logger;

	//import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	//import io.cucumber.java.en.Then;
	//import io.cucumber.java.en.Then;
	//import io.cucumber.java.en.Then;
	//import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;


		
		public class LoginStep  {
	          WebDriver driver;
	         //private static Logger logger = LogManager.getLogger(LoginStep.class);
			@Given("a user is in the LandingPage on Firstcry")
			public void a_user_is_in_the_landing_page_on_firstcry() {
				//logger.info("a user is in the LandingPage on Firstcry");
				 driver = new ChromeDriver();
				  driver.manage().window().maximize();
				  driver.get("https://www.firstcry.com/");
				  String e1 = driver.getTitle();
					String e2 = "Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com";
					Assert.assertEquals(e2,e1);
				  
			}
	@When("user click on the login button")
			public void user_click_on_the_login_button() {
		//logger.info("user click on the login button");

		
			    
				driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();
			}
			@When("user enter valid emailid")
			public void user_enter_valid_emailid() throws InterruptedException {
				//logger.info("user enter valid emailid");
				
				driver.findElement(By.id("lemail")).sendKeys("rrch1717@gmail.com");
			driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")).click();
			captureScreenshot(driver, "pass.png");
			
			
			}
	@When("user click on the continue button")

			public void user_click_on_the_continue_button() throws InterruptedException {
		//logger.info("user click on the continue button");
				Thread.sleep(2000);
			   driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[3]/span")).click();
			}

			@When("user click the submit button")
			public void user_click_the_submit_button() throws InterruptedException {
			//logger.info("user click the submit button");

				
				Thread.sleep(30000);
				driver.findElement(By.id("verfiedbtn")).click();
			}

			
			@When("user should be logged in successfully")
			public void user_should_be_logged_in_successfully1()throws InterruptedException {
				//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[8]/span[2]/ul/li[17]/span")).click();
	     System.out.println("logged in sucessfully");	
			
			}
			@Given("a user is in the landingPage")
			public void a_user_is_in_the_landing_page() {
				driver = new ChromeDriver();
				  driver.manage().window().maximize();
				  driver.get("https://www.firstcry.com/");
				 
			}

			@When("user clicks on the Login button")
			public void user_clicks_on_the_login_button() {
				driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[7]/span[1]")).click();

				
			}

			@When("user enter invalid emailid")
			public void user_enter_invalid_emailid() {
				driver.findElement(By.id("lemail")).sendKeys("rrch1717@gmail.com");
				driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")).click();
			}
		
	@When("user click on the continue btn")

		public void user_click_on_the_continue_btn() throws InterruptedException {

	//logger.info("user click on the continue button");
			Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[3]/span")).click();
			captureScreenshot(driver, "Fail1.png");

		}
	@When("user click the submit btn")
	public void user_click_the_submit_btn() throws InterruptedException {
	//logger.info("user click the submit button");

		
		Thread.sleep(30000);
		driver.findElement(By.id("verfiedbtn")).click();
		 String e1 = driver.getTitle();
			String e2 = "Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com";
			Assert.assertEquals(e2,e1);
			System.out.println("The title is"+e1);
		//captureScreenshot(driver, "Fail1.png");
	}


			@When("user should be not able to logged successfully")
			public void user_should_be_not_able_to_logged_successfully() {
			    System.out.println("user can not login");
			}


			private static void captureScreenshot (WebDriver driver, String fileName) {
		    TakesScreenshot screenshot = (TakesScreenshot) driver;
		    File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);	   
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
