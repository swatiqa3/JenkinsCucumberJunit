package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BrowserUtils;
import utils.SeleniumWrapper;

public class HomePage  extends  SeleniumWrapper{
	
	
	@FindBy(xpath="(//a[@data-product-id='1'])[1]")
	private WebElement eleAddToProductLink;
	
	@FindBy(xpath="//*[text()=' Home']")
	private WebElement eleHomeLink;
	
	
	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void LaunchURL(String strURL) {		
		getURL(strURL);	
	}
		
	public void clickHomeLink() {
		clickElement(eleHomeLink);
	}
	

}
