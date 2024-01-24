package Stepdefinition;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import Page.preschoolpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pagefactory.PreSchool;

public class preschooStepDef {
	//private static final Logger logger = LogManager.getLogger(StoreLocatorFuncSteps.class);
	private final WebDriver driver;
	private final PreSchool preschool;
	public preschooStepDef() {
		driver = new ChromeDriver();
		preschool = new PreSchool(driver);
	}
    //WebDriver driver ;
    //preschoolpage PP;
	@Given("a user is in the LandingPage")
	public void a_user_is_in_the_landing_page_on_firstcry() {
        //driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
        driver.manage().window().maximize();
        
       // PP = new preschoolpage();
	}

	@When("user click on the login buttonn")
	public void user_click_on_the_login_button() throws InterruptedException {
		//driver.findElement(By.xpath("//span[@class='anch poplogin_main poplogin R12_61']")).click();
		//preschool.clickonLoginIcon();
	}

	@When("user enter valid emailid and")
	public void user_enter_valid_emailid() throws InterruptedException {		
		//driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/div/input")).click();
		//driver.findElement(By.id("lemail")).sendKeys("rrch1717@gmail.com");
		

		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")).click();
	}

	@When("user click on the continue buttonn")
	public void user_click_on_the_continue_button() throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='J14SB_42 cl_fff']")).click();
		//Thread.sleep(4000);
	}

	@When("user click the submit buttonn")
	public void user_click_the_submit_button() throws InterruptedException {
		Thread.sleep(30000);
		//driver.findElement(By.id("verfiedbtn")).click();

	}

	@When("user should be loggedin")
	public void user_should_be_logged_in_successfully() throws InterruptedException {
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/span/span")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/ul/li[2]/a/span")).click();
		//Thread.sleep(3000);
		//ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
    	//driver.switchTo().window(tabs.get(1));
		//driver.findElement(By.id("school-finder-btn")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div[1]/select/option[98]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div[1]/select/option[98]")).click();
		//Thread.sleep(3000);
		///driver.findElement(By.id("pincode-finder")).sendKeys("110092");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div[3]/div/input")).click();		
	}
	@When("user can click on storeandpreschool")
	public void user_can_click_on_storeandpreschool() throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/span/span")).click();
		preschool.clickonstorespreschool();
		   
	}

	@When("user can click on findpreschool")
	public void user_can_click_on_findpreschool()throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/ul/li[2]/ul/li[2]/a/span")).click();
		preschool.clickonfindpreschool(); 
	}

	@When("user switches focus to new tab")
	public void user_switches_focus_to_new_tab() throws InterruptedException {
		ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
		driver.findElement(By.id("school-finder-btn")).click();
    	
		Thread.sleep(3000);
	    
	}

	@When("user clicks on the second available city")
	public void user_clicks_on_the_second_available_city() throws InterruptedException {
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div[1]/select/option[98]")).click();
		preschool.clickonNeWDelhi();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div[1]/select/option[98]")).click();
		Thread.sleep(3000);
	    
	}

	@When("click on findmy preschool")
	public void click_on_findmy_preschool() throws InterruptedException {
	
		//driver.findElement(By.id("pincode-finder")).sendKeys("110092");
		preschool.clickonpincode();
		Thread.sleep(3000);
		captureScreenshot(driver, "Fail1.png");
	    
	}

	@Then("user must able to verify the firstcry Intellitots preschools in NewDelhi")
	public void user_must_able_to_verify_the_firstcry_intellitots_preschools_in_NewDelhi() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div[2]/form/div[3]/div/input")).click();	
		preschool.Verifybtn();
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
    //driver.close();
	}
	
}

