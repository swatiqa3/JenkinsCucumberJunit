package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Hooks {
	private BrowserUtils objBrowserUtils;
	private WebDriver driver;
	
	
	public Hooks(BrowserUtils ObjBrowserUtils){
		this.objBrowserUtils= ObjBrowserUtils;
	}
	
	@Before
	public void setUp() {
		  String browser = System.getProperty("Browser");
		  if(browser == null  || browser.isEmpty() )
			  browser = BrowserUtils.prop.getProperty("Browser");
		  
		  WebDriverManager.chromedriver().setup();
		
		if(browser.equalsIgnoreCase("Chrome"))
		{			
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		objBrowserUtils.setDriver(driver);
	}

	@After
	public void tearDown() {
		objBrowserUtils.getDriver().quit();	
	}
	
}
