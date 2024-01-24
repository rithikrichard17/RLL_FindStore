package Pagefactory;


import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.DriverFactory;

public class AddToCartPage  {
   
    @FindBy(xpath = "//span[@class='anch poplogin_main poplogin R12_61']") // Update with actual login button XPath
    private WebElement loginButton;

    @FindBy(id = "lemail") // Update with actual username field ID
    private WebElement usernameField;
    
  
    @FindBy(xpath="//span[@class='J14SB_42 cl_fff']") // Update with actual continue button XPath
    private WebElement continueButton;

    

    @FindBy(xpath = "//*[@id=\"verfiedbtn\"]") // Update with actual submit button ID
    private WebElement submitButton;



    
    @FindBy(xpath = "//img[@title='Spiky Round Digital Sports Watch -Blue']")
	private WebElement firstItem;
    
    
    @FindBy(id = "search_box")
    private WebElement searchBox;
    
    @FindBy(xpath = "//span[@class='search-button']") // Update with actual search box ID
    private WebElement searchbutton;
    

    

    @FindBy(xpath = "//span[contains(text(),'ADD TO CART')]")
    private WebElement addToCartButton;
    
    @FindBy(xpath = "//span[@class='step2 M16_white']\"")
    private WebElement MiniCartDetails;
	
    
    //private WebDriver driver;
    WebDriver driver = DriverFactory.getDriver();

    // Constructor
    public AddToCartPage(WebDriver driver) {
    	this.driver = driver; // Calling BasePage constructor
    	 PageFactory.initElements(driver, this);
    }

    // Method to log into the application
    public void login(String username)  {
        loginButton.click();
        usernameField.sendKeys(username);
        
    }
    
    public void clickOnCont() throws InterruptedException {
    	Thread.sleep(2000);
    	continueButton.click();
	}
	
    public void clickOnSubmitBTN() throws InterruptedException {
		Thread.sleep(20000);
		submitButton.click();
		
	}
	
    public void UseSearch() {
    	
    	searchBox.clear();
    	searchBox.sendKeys("watches");
    	searchbutton.click();

    	
    }
   
    
    public void clickFirstItem() throws InterruptedException {
		
		firstItem.click();
	}
    
    public void clickAddToCart() {
        addToCartButton.click();
    }
    
    public void clickOnMiniCartDetails() {
    	MiniCartDetails.click();
    }
    
    
   
	
    
    // Additional methods for other interactions can be added here
}
