package Stepdefinition;

	import java.util.ArrayList;
	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import org.openqa.selenium.TakesScreenshot;
	//import org.openqa.selenium.By;
	//import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import io.cucumber.java.After;
	//import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
    import Pagefactory.Cartpage;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	public class loginStepDef {
		
		private static final Logger logger = LogManager.getLogger(loginStepDef.class);
	    WebDriver driver;
	    Cartpage lg;
		public loginStepDef() {
			driver = new ChromeDriver();
			lg = new Cartpage(driver);
		}
		    // WebDriver driver ;
		     //Cartpage lg;
		   // private static Logger logger = LogManager.getLogger(loginStepDef.class);
		    @Given("User navigates to the web URL in firstcry")
		    public void User_navigates_to_the_web_URL_in_firstcry() {
		    	logger.info("User navigates to the web URL in firstcry");
		        //driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.firstcry.com/");
		       // lg = new Cartpage(driver);
		    }
		    @When("User click on the Register")
		    public void user_click_on_the_register() {
		    	logger.info("User click on the Register");
		    	//lg.clickLoginRegisterButton();
		    }

		    @When("User Enters the valid emailID")
		    public void userEntersValidEmail() throws InterruptedException{
		    	logger.info("User Enter the valid emailID");
		    	//lg.enterEmail("rrch1717@gmail.com");
		    	//lg.selecttheidshowninthedp();
		    	//Thread.sleep(2000);
		    }

		    @When("User clicks on the continue buttonn")
		    public void userClicksContinueButton()throws InterruptedException {
		    	logger.info("User clicks on the continue button");
		    	//lg.clickContinueButton();
		    	//Thread.sleep(30000);
		    }

		    @When("User Clicks on Submit buttonn")
		    public void userClicksSubmitButton() {
		    	logger.info("User Clicks on Submit button");
		    	//lg.clickSubmitButton();
		    }

		    @Then("Validate login is successfull")
		    public void validateLoginSuccessful() throws InterruptedException{
		    	logger.info("Validate login is successful");
		    	//Thread.sleep(20000);
		        // Add assertions or verification steps for successful login
		        // For example, you can check if the user is redirected to the expected page
		    }
				@When("User goto Search button")
			    public void go_to_search_button() throws InterruptedException{
					logger.info("User goto Search button");
			    	Thread.sleep(2000);
			    	lg.clearsearchbtn();
			    	Thread.sleep(2000);
					lg.searchboxbtn();
					Thread.sleep(2000);
					lg.searchproduct();
			} 

			@When("User select the product")
			public void user_select_the_product()  throws InterruptedException{
				logger.info("User select the product");
		    	lg.clickonproduct();
		    	//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[4]/div[1]/div[3]/div[1]/div/div[1]/div[1]/a/img")).click();
		    	Thread.sleep(2000);
			}

			@When("go to the add to cart button")
			public void go_to_the_add_to_cart_button() throws InterruptedException {
				logger.info("go to the add to cart button");
				ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
		    	driver.switchTo().window(tabs.get(1));
		    	lg.addtocart();
		    	Thread.sleep(2000);
		    	//driver.findElement(By.xpath("//*[@id=\"p_breadcrumb\"]/div[2]/div/div[2]/div[5]/div/div[2]/div[2]/div[1]/div/span[1]")).click();
			}

			@When("go to the Go to cart button")
			public void go_to_the_go_to_cart_button() throws InterruptedException {
				logger.info("go to the Go to cart button");
//				ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
//		    	driver.switchTo().window(tabs.get(1));
				Thread.sleep(3000);
				lg.gotocart();
				Thread.sleep(3000);
				//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[5]/div/div[2]/div[2]/div[1]/div/span[2]")).click();
				//captureScreenshot(driver, "Fail1.png");
			}
			
			@When("increase the Quality of the product")
			public void increase_the_quality_of_the_product() throws InterruptedException {
				logger.info("increase the Quality of the product");
				lg.selectthequt();
				Thread.sleep(2000);
				lg.incquality();
				captureScreenshot(driver, "Passanjali.png");
	
			}

			@Then("Remove the product from the cart")
			public void remove_the_product_from_the_cart() throws InterruptedException {
				logger.info("Remove the product from the cart");
				//Thread.sleep(5000);
				//lg.remove();
				//Thread.sleep(3000);
				
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
