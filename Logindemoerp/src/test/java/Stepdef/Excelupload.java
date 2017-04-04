package Stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;






import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class Excelupload {

		@Then("^Insertdatainexcel$")
		public void insertdatainexcel() throws Throwable {
			try{
			String loc = "D:\\Fee Entry Excel (Cash).xls";
		    File file= new File(loc);
		    FileInputStream in= new FileInputStream(file);
		    Workbook wrb=null;
		    String sr= loc.substring(loc.indexOf("."));
		    if(sr.equals(".xls"))
		    {
		    	wrb=new HSSFWorkbook(in);	
		    
		    }
		    else if(sr.equals(".xlsx")) {
		    	wrb=new XSSFWorkbook(in);
		    }
		    Sheet sh= wrb.getSheetAt(0);
		    Iterator<Row> it=sh.iterator();
		    while(it.hasNext()){
		    	Row row=it.next();
		    	Iterator <Cell> ce= row.cellIterator();
		    	while(ce.hasNext()){
		    		Cell cel= ce.next();
		    		//int a = cel.getCellTypeEnum();
		    		if(cel.getCellTypeEnum() == CellType.NUMERIC)
		    		{		    		
		    			System.out.println(cel.getNumericCellValue());		    			
		    		}
		    		else if (cel.getCellTypeEnum()== CellType.STRING);
		    		{
		    			System.out.println(cel.getNumericCellValue());
		    		}
		    	}
		    }
		    
			}catch(FileNotFoundException f){
			f.printStackTrace();}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
			

		@Then("^Uploadexcel$")
		public void uploadexcel() throws Throwable {
			Mycode.Locatemanagefee();
		    Takefee.action.moveToElement(Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Feemanager.excel")))).click().build().perform();
		    Logindem.dr.switchTo().frame("Fees Excel Upload");
		    Mycode.browse();
		    Mycode.properties();
		    try
		    {Select sr= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Feemanager.uploadbutton.Headmapping.student"))));
		    sr.selectByVisibleText("Stu_Name");
		    Select sr1= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Feemanager.uploadbutton.Headmapping.admission"))));
		    sr1.selectByVisibleText("Admno");
		    Select sr2= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Feemanager.uploadbutton.Headmapping.class"))));
		    sr2.selectByVisibleText("Class");
		    Select sr3= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Feemanager.uploadbutton.Headmapping.amount"))));
		    sr3.selectByVisibleText("amount");
		    Select sr4= new Select(Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Feemanager.uploadbutton.Headmapping.date"))));
		    sr4.selectByVisibleText("Date");
		    Logindem.dr.findElement(By.id(Mycode.prop.getProperty("Feemanager.uploadbutton.Headmapping.savebutton"))).click();
		    Mycode.browse();
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    	System.out.println("Element not found");
		    }
		    
		}
		@Then("^Selectallfilter feetype\"([^\"]*)\" and adjusttype \"([^\"]*)\" and selectinstallment \"([^\"]*)\"$")
		public void selectallfilter_feetype_and_adjusttype_and_selectinstallment(String arg1, String arg2, String arg3) throws Throwable {
			 Mycode.dropdownfeetype(arg1);
			 Mycode.adjustfrom(arg2);
			 Mycode.selectinstallment(arg3);
		    
		}

		@Then("^assertdateformat$")
		public void assertdateformat() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

		@Then("^clickonverify$")
		public void clickonverify() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("^clickonsubmitfee$")
		public void clickonsubmitfee() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}

		@Then("^Verifyamountonfeeentry$")
		public void verifyamountonfeeentry() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}


	}


