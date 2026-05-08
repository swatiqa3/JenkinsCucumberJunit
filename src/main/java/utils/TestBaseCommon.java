package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import pages.HomePage;
import pages.LoginPage;

public class TestBaseCommon {
	
	private BrowserUtils ObjBrowserUtils;
	public HomePage ObjHomePage;
	public LoginPage ObjLoginPage;
	
	public TestBaseCommon(BrowserUtils objBrowserUtils){
		this.ObjBrowserUtils = objBrowserUtils;
	}
	

	public void initializePages() {		
		ObjLoginPage = new LoginPage(ObjBrowserUtils.getDriver());
	}
	

	public HomePage getHomePage() {
		if(ObjHomePage == null)
			ObjHomePage = new HomePage(ObjBrowserUtils.getDriver());
		return ObjHomePage;
	}
	
	public LoginPage getLoginPage() {
		if(ObjLoginPage == null)
			ObjLoginPage = new LoginPage(ObjBrowserUtils.getDriver());
		return ObjLoginPage;
	}

}
