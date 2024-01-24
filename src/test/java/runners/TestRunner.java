package runners;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import Utils.ItestListenerClass;

@CucumberOptions(
    features = "src/test/java/Feature",
    glue =  "Stepdefinition",
    dryRun = false,
    plugin = {
        "html:target/Firstcry_Findstore_report.html",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:test-output-thread/"
    },
    
    tags="@firstcry"
   // monochrome = true
    
    
     
)


@Listeners(ItestListenerClass.class)
public class TestRunner extends  AbstractTestNGCucumberTests  {
	
	
	
	

}