package Verifyfeesreports;

import Stepdef.Mycode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Verifyfeesreports{
	
	@Given("^URLL$")
	public void urll() throws Throwable {
		   Mycode.properties();
				Mycode.url();   
	}
	
	@When("^Locatereports$")
	public void locatereports() throws Throwable {
		Mycode.locatetransactionreport();
	    
	}
	@Then("^verifyreport$")
	public void verifyreport() throws Throwable {
		Mycode.feereportverification();
	}

	
}