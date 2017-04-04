package Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Takefee{
	
	static Actions action=null;
@When("^Logindetails$")
public void logindetails() throws Throwable {
	Mycode.properties();
	Logindem.dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Login.username"))).sendKeys("admin");
	Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Login.password"))).sendKeys("Admin@987");                          
}

@Then("^LogintoERP$")
public void logintoerp() throws Throwable {
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Login.Button"))).click();
   
}

@Then("^Openupdateaddressandblood$")
public void openupdateaddressandblood() throws Throwable {
    Logindem.dr.findElement(By.xpath(Mycode.prop.getProperty("Admission.logo"))).click();	
     action = new Actions(Logindem.dr);
    WebElement wb=Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Admission.mastersetting")));
    action.moveToElement(wb).build().perform();
    action.moveToElement(Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Admission.updateandblood")))).click().build().perform();
  
}

@Then("^Update(\\d+)$")
public void update(int arg1) throws Throwable {
    Logindem.dr.switchTo().frame("mainiframe");
    Select sl= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Class"))));
    sl.selectByValue("31");
    Select sl2= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Section"))));
    sl2.selectByValue("2");
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Address"))).clear();
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Address"))).sendKeys("c 304 omicron2");
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.contact"))).clear();
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.contact"))).sendKeys("9540255798");
    Select sl3= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Bloodgroup"))));
    sl3.selectByValue("1");
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Admissionno"))).clear();
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Admissionno"))).sendKeys("1245566");
    Select sl4= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Gender"))));
    sl4.selectByVisibleText("Female");
    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Admission.updateandblood.Datetextbox"))).click();
    Thread.sleep(2000);
    Logindem.dr.findElement(By.xpath(Mycode.prop.getProperty("Admission.updateandblood.Datepick"))).click();
    Logindem.dr.findElement(By.name(Mycode.prop.getProperty("Admission.updateandblood.updatebutton"))).click();
    Thread.sleep(3000);
    Logindem.dr.quit();
    
}

}