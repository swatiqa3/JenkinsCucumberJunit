package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumWrapper {
	private WebDriver driver;
	
	public SeleniumWrapper(WebDriver driver) {
		this.driver = driver;
	}

	
	public void getURL(String strURL) {
		driver.get(strURL);	
	}
	
	
	public void clickElement(WebElement ele) {
		try {
			ele.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
