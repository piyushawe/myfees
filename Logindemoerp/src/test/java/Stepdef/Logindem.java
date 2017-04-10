package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logindem{
	
	 public static WebDriver dr=null;
	@Given("^URL$")
	public void url() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium drivers\\chromedriver_win32new\\chromedriver.exe");
	    dr=new ChromeDriver();
	    dr.manage().window().maximize();
		dr.get("http://qaerp.franciscanecare.net/Secure/");
	   
	}

	@When("^logingdetails \"([^\"]*)\" and \"([^\"]*)\"$")
	public void logingdetails_and(String arg1, String arg2) throws Throwable {
	 //arg1.trim();
	 //arg2.trim();
		//String login="admin";
		  //  String password1="Admin@987";
		   // if(login.equals(arg1) && password1.equals(arg2) )
		   // {
		    	dr.findElement(By.id("txtUserName")).sendKeys(arg1);
		    	dr.findElement(By.id("txtPassword")).sendKeys(arg2);
		    	//System.out.println("Successful");
		   // }
		   // else 
		  //  {
		    	
		    	//System.out.println("UnSuccessful");
		   // }
		    //dr.quit();
		   
	}

	@Then("^Loginbutton$")
	public void loginbutton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
