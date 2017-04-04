package Stepdef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Mycode {
	
	// Global functions
	
	static Properties prop;

    public static void sendsms()
    {
    	Logindem.dr.findElement(By.id("Feemanager.checkbox.sendsms")).click();
    }
	  public static void selectinstallment (String s2)
	    {
	    	Select sr1= new Select(Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.dropdown.installment"))));
	    	sr1.selectByValue("s2");
	    }
	public static void dropdownfeetype(String s)
    {
    	Select sr1= new Select(Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.dropdown.feetype"))));
    	sr1.selectByValue("s");
    }
    
	public static void properties() throws IOException
	{
		prop= new Properties();
		FileInputStream fl= new FileInputStream("C:\\Users\\himanshu\\workspace\\Logindemoerp\\Prop.properties");
		prop.load(fl);
	}
	public static void Locatemanagefee()
	{
		Logindem.dr.findElement(By.xpath(Mycode.prop.getProperty("Feemanager.logo")));
	    Takefee.action.moveToElement(Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Feemanager.Managefee")))).build().perform();
	}
	
	//Fee excel upload
	
	public static void browse() throws IOException
	{
		properties();
		Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.browse"))).click();
	    try {
			Runtime.getRuntime().exec("D:\\autoit.exe");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    Logindem.dr.findElement(By.name(prop.getProperty("Feemanager.uploadbutton"))).click();	
	}
	
    public static void adjustfrom(String s1)
    {
    	Select sr1= new Select(Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.dropdown.adjustfrom"))));
    	sr1.selectByValue("s1");
    }
    
    public static void verifybutton()
    {
    	Logindem.dr.findElement(By.name("Feemanager.verifybutton")).click();
    }
    
    public static void finewaiveoffcheckbox()
    {
    	Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.finewaiveoffcheckbox"))).click();
    }
    
    public static void selectfeecheckbox()
    {
    	Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.selectfeecheckbox"))).click();
    }
    
  
}
