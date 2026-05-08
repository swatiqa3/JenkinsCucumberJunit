package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BrowserUtils;
import utils.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper{
	

	
	@FindBy(xpath="//a[@href=\"/view_cart\"]")
	private WebElement eleCartLink;
	
	
	
	public LoginPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver,this);	
	}

	
	public void clickCartLink() {
		clickElement(eleCartLink);
	}
}
