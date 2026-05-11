package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

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
	public void setUp() throws MalformedURLException {
		  String browser = System.getProperty("Browser");
		  if(browser == null  || browser.isEmpty() )
			  browser = BrowserUtils.prop.getProperty("Browser");
		  
		  WebDriverManager.chromedriver().setup();
		  
		  String isremote = BrowserUtils.prop.getProperty("isRemote");
		  
		  if(isremote.equals("true")) {
			  if(browser.equalsIgnoreCase("Chrome"))
				{			
					ChromeOptions opt = new ChromeOptions();
					driver = new RemoteWebDriver(new URL(BrowserUtils.prop.getProperty("RemoteURL")),opt);
				}
				else if(browser.equalsIgnoreCase("FireFox"))
				{
					 FirefoxOptions opt = new FirefoxOptions();
					 driver = new RemoteWebDriver(new URL(BrowserUtils.prop.getProperty("RemoteURL")),opt);
				}
		  }else {
			  if(browser.equalsIgnoreCase("Chrome"))
				{			
					driver = new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("FireFox"))
				{
					driver = new FirefoxDriver();
				}
			  
		  }
		
		
		objBrowserUtils.setDriver(driver);
	}

	@After
	public void tearDown() {
		objBrowserUtils.getDriver().quit();	
	}
	
}
