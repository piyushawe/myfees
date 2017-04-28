package Runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
features= {"src/main/resources/Verifyfeesreports.feature"}
,glue= {"Stepdef/Verifyfeesreports.java"}
,monochrome=true
   ,plugin= {"pretty","html:target/cucumber_html_report"}	
)	
public class run {

}