package Stepdef;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert; 

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Mycode {
	
	// Global function
	
	
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
	    Takefee.action.moveToElement(Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Feemanager.excel")))).click().build().perform();
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
    
	public static void validationinexcelupload()
    {
    	Logindem.dr.findElement(By.name(prop.getProperty("Feemanager.excelupload.uploadbutton"))).click();
    	if(Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.uploadbutton.validation"))).isEnabled())
    	{
    		String error=Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.uploadbutton.validation"))).getText();
    		System.out.println(error);
    		if("Please select file to upload.".equals(error))
    		{
    			System.out.println("Validation message as expected!!");
    		}
    		else
    		{
    			System.out.println("Validation message not as expected!!");
    		}
    	}
    	else{
    		System.out.println("Please check!! no validation is showing");
    	}
    
    //Validating date format
    Select s1 = new Select(Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.Dateformat"))));
    String option= s1.getFirstSelectedOption().getText();
   //Assert.assertEquals("dd-MM-yyyy", option);
    Assert.assertSame("Date Format is incorrect", "dd-MM-yyyy", option);
    
    //Validating Select installment 
    Select s2= new Select(Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.selectinstallment"))));
    s2.selectByValue("0");
    String installment= Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.installmentvalidation"))).getText();
    if("Please select Installment".equals(installment))
    {
    	System.out.println("Proper installment validation is showing!!");
    }
    else
    {
    	System.out.println("Either No or wrong validation is showing!!");
    }
    
    }
    
}
