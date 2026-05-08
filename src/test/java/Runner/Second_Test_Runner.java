package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Swati\\eclipse-workspace\\FirstProject\\src\\test\\resources\\features\\Login.feature",
		glue = {"Steps","utils"},
		tags = "@secondTest",
		plugin= {
		"html:target/cucumber.html",
		"json:target/cucumber.json"
		}
		
		
)

public class Second_Test_Runner {
	

}
