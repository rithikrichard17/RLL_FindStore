package Pagefactory;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class ProductShortlist {
		
		private Actions actions;
		private WebDriverWait wait;
		
		@FindBy(xpath ="//*[@id=\"search_box\"]")
		private WebElement searchbtn;
		
		@FindBy(xpath ="/html/body/div[1]/div[5]/div/div[2]/form/span")
		private WebElement searchicon;
		
		@FindBy(xpath ="/html/body/div[5]/div[2]/div/div[2]/div[3]/div[1]/div/div[1]/div/div[1]")
		private WebElement product;
		
			@FindBy(id = "shortlist")
		private WebElement shortlist;
			
			
		
		public ProductShortlist(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		}
		
		public void Hoveroverproduct() 
		{
	    	//actions.moveToElement(product).build().perform();	
			product.click();
		}
		
			
		public void Search(String u) 
		{
			searchbtn.clear();
			searchbtn.sendKeys(u);
		}
		
		public void Searchicon()
		{
			
			searchicon.click();
		}
		
		public void shortlistsymbol() 
		{
			
			shortlist.click();
		}

}
