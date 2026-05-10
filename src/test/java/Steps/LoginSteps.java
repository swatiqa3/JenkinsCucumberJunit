package Steps;

import io.cucumber.java.en.*;
import pages.BasePage;
import utils.BrowserUtils;

public class LoginSteps{

    private BasePage objBasePage;
    private BrowserUtils objBrowserUtils;

    public LoginSteps(BasePage objBasePage,
                      BrowserUtils objBrowserUtils) {

        this.objBasePage = objBasePage;
        this.objBrowserUtils = objBrowserUtils;
    }


	@Given("User launch URL")
	public void user_launch_url() {		
		objBasePage.getHomePage().LaunchURL(BrowserUtils.prop.getProperty("BrowserURL"));
	}

	@When("User clicks on Home link")
	public void user_clicks_on_home_link() {
		objBasePage.getHomePage().clickHomeLink();
	}
	

	@When("User clicks Cart link")
	public void user_clicks_on_cart_link() {
		objBasePage.getLoginPage().clickCartLink();
	}
	


}
