package Steps;

import io.cucumber.java.en.*;
import utils.BrowserUtils;
import utils.TestBaseCommon;

public class LoginSteps{

    private TestBaseCommon objTestBaseCommon;
    private BrowserUtils objBrowserUtils;

    public LoginSteps(TestBaseCommon objTestBaseCommon,
                      BrowserUtils objBrowserUtils) {

        this.objTestBaseCommon = objTestBaseCommon;
        this.objBrowserUtils = objBrowserUtils;
    }


	@Given("User launch URL")
	public void user_launch_url() {		
		objTestBaseCommon.getHomePage().LaunchURL(BrowserUtils.prop.getProperty("BrowserURL"));
	}

	@When("User clicks on Home link")
	public void user_clicks_on_home_link() {
		objTestBaseCommon.getHomePage().clickHomeLink();
	}
	

	@When("User clicks Cart link")
	public void user_clicks_on_cart_link() {
		objTestBaseCommon.getLoginPage().clickCartLink();
	}
	


}
