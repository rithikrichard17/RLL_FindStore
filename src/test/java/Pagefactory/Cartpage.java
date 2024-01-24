package Pagefactory;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import Base.DriverFactory;
	public class Cartpage {
		    //private final WebDriver driver;

		    @FindBy(xpath = "//span[@class='anch poplogin_main poplogin R12_61']")
		    private WebElement loginRegisterButton;

		    @FindBy(id = "lemail")
		    private WebElement emailInput;
		    
		    @FindBy(xpath = "/html/body/div[2]/div/form/div/div[1]/div/ul/li/p")
		    private WebElement selecttheid;	    

		    @FindBy(xpath = "//span[@class='J14SB_42 cl_fff']")
		    private WebElement continueButton;
		    
		    @FindBy(id = "verfiedbtn")
		    private WebElement submitButton;
		    
		    @FindBy(id = "search_box")
		    private WebElement clearsearch;	
		    
		    @FindBy(id = "search_box")
		    private WebElement searchbox;
		    
		    @FindBy(xpath = "//span[@class='search-button']")
		    private WebElement clickonsearch;

		    @FindBy(xpath = "//div[@class=\"list_img wifi\"]")
		    private WebElement productselect;

		    @FindBy(xpath = "//span[@class='step1 M16_white']")
		    private WebElement selectaddtocart;
		    
		    @FindBy(xpath = "//span[@class='go-icon']")
		    private WebElement selectgotocart; 
		    
		    @FindBy(xpath = "//span[@class='quantity-icon']")
		    private WebElement clickonqut; 
		    
		    @FindBy(xpath = "//*[@id=\"productlist\"]/div/div[2]/div[2]/div[4]/section/div[3]/span[1]")
		    private WebElement clickonIncQuty;

		    @FindBy(xpath = "//span[@class='M15_21 removetext']")
		    private WebElement clickonremove;
		    
		    WebDriver driver = DriverFactory.getDriver();
		    public Cartpage(WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }

		    public void clickLoginRegisterButton() {
		        loginRegisterButton.click();
		    }

		    public void enterEmail(String email) {
		        emailInput.sendKeys(email);
		    }
		    public void selecttheidshowninthedp() {
		    	selecttheid.click();
		    }
		    public void clickContinueButton() {
		        continueButton.click();
		    }
		    
		    public void clickSubmitButton() {
		        submitButton.click();
		    }
		    public void clearsearchbtn() {
		    	clearsearch.clear();
		    }
		    public void searchboxbtn() {
		    	searchbox.sendKeys("Sweatshirts");
		    }
		    public void searchproduct() {
		    	clickonsearch.click();
		    }
		    public void clickonproduct() {
		        productselect.click();
		    }
		    public void addtocart() {
		    	selectaddtocart.click();
		    }
		    public void gotocart() {
		    	selectgotocart.click();
		    }
		    public void selectthequt() {
		    	clickonqut.click();
		    }
		    public void incquality() {
		    	clickonIncQuty.click();
		    }
		    public void remove() {
		    	clickonremove.click();
		    }
	

}
