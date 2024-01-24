package Stepdefinition;


import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.aventstack.extentreports.ExtentTest;

import Pagefactory.AddToCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Add_to_Cart_Steps{
	
	private static final Logger logger = LogManager.getLogger(StoreLocatorFuncSteps.class);
	private final WebDriver driver;
	private final AddToCartPage addToCart;
	public Add_to_Cart_Steps() {
		driver = new ChromeDriver();
		addToCart = new AddToCartPage(driver);
	
	// WebDriver driver;
	//public static Logger log;
	//private AddToCartPage addToCart;
	
	}
	 


@Given("User navigate to the FirstCry URL")
public void i_navigate_to_the_first_cry_url() {
    // Write code here that turns the phrase above into concrete actions
	logger.info("User navigates to the web URL");
	driver.manage().window().maximize();
	driver.get("https://www.firstcry.com/");
	
}

@Given("User have valid credentials for login")
public void i_have_valid_credentials_for_login() throws InterruptedException{
    // Write code here that turns the phrase above into concrete actions
	logger.info("User have valid credentials for login");
	//addToCart.login("rrch1717@gmail.com");
	
}

@When("User log into the application with my credentials")
public void i_log_into_the_application_with_my_credentials() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	//Thread.sleep(2000);
	//addToCart.clickOnCont();
	//addToCart.clickOnSubmitBTN();
    
}

@Then("User should be redirected to the homepage")
public void i_should_be_redirected_to_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
	logger.info("User should be redirected to the homepage");
	assertTrue(driver.getTitle().equals("Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com"));

   }

@When("User search for a specific product")
public void i_search_for_a_specific_product() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	addToCart.UseSearch();


}



@When("select one product from the search results")
public void select_one_product_from_the_search_results() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	addToCart.clickFirstItem();
	 
	
}

@When("User switches focus to the new tab in Firstcry")
public void user_switches_focus_to_the_new_tab() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
    
}


@When("I click on {string} for the selected product")
public void i_click_on_for_the_selected_product(String string) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	addToCart.clickAddToCart();
}

@Then("the selected product should be added to my cart")
public void the_selected_product_should_be_added_to_my_cart() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='step2 M16_white']")).click();
	//addToCart.clickOnMiniCartDetails();
	//log.info("ADDTOCART FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");
	
}


@Then("he must see the text messsage {string} is displayed")
public void he_must_see_the_text_messsage_is_displayed(String expectedDescription) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	WebElement descriptionElement = driver.findElement(By.xpath("//p[@class='prod-heading p-heading B14_42']")); // Replace with your actual selector

    // Retrieve the description text
    String actualDescription = descriptionElement.getText();

    // Assert that the actual description contains the expected text
    assertTrue(actualDescription.contains(expectedDescription), "The product description does not contain the expected text.");
   
    //driver.close();
    
	    }
        


        
}






