package Stepdef;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mycode {
	
	// Global function
	
	static Actions action=null;
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
		//Validate is excel uploaded
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
	public static void submitfeebutton()
	{
		Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.submitfee"))).click();
	}
	
	public static int verifyifcheckboxselected()
	{
		WebElement table= Logindem.dr.findElement(By.cssSelector(prop.getProperty("Feemanager.excelupload.tablecss")));
		@SuppressWarnings("unchecked")
		List<WebElement> row=(List<WebElement>) table.findElement(By.tagName("tr"));
		int count=0;
		for(int i =0; i<row.size();i++)
		{
			String status=Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.status"))).getText();
			
			if(status=="Ready To Upload")
			{
				boolean attr=Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.excelupload.Checkbox"))).isSelected();
				if(attr=true)
				{
					count++;
				
				}	
				
			}
		}
		return count;
	}
	
	//Student registration
	
	 public  static void studentregistration()
	 {
		 Logindem.dr.findElement(By.xpath(Mycode.prop.getProperty("Admission.logo"))).click();
		 action = new Actions(Logindem.dr);
		    WebElement wb=Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Admission.mastersetting")));
		    action.moveToElement(wb).build().perform();
		    action.moveToElement(Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Feemanager.excelupload.studentregistration")))).click().build().perform();
	 }
	 
	 public  static void Locatetransactionreport()
	 {
		 Logindem.dr.findElement(By.xpath(Mycode.prop.getProperty("Feemanager.logo"))).click();
		 action = new Actions(Logindem.dr);
		    WebElement wb=Logindem.dr.findElement(By.linkText(Mycode.prop.getProperty("Feemanager.transactionreport")));
		    action.moveToElement(wb).build().perform();
		    
	 }
	 
	 
	 public static void registerstudent()
	 {
		 try{
				String loc = "D:\\regsitration data.xlsx";
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
			   int acrow= sh.getPhysicalNumberOfRows();
			   int accol= sh.getRow(0).getPhysicalNumberOfCells();
			   double arr[] []= new double[acrow][accol];	
			   String arr1[][]=new String[acrow][accol] ;
			   for(int i=1;i<acrow;i++)
			   {
				   for(int j =0;j<accol;j++)
				   {
					   
					   if(sh.getRow(i).getCell(j).getCellTypeEnum()==CellType.NUMERIC)
					   {
						   arr[i][j]=sh.getRow(i).getCell(j).getNumericCellValue();
						   
					   }
					   if(sh.getRow(i).getCell(j).getCellTypeEnum()==CellType.STRING)
					   {
						   
					   arr1[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				   }
					   
				   }
				   
			   }
			   /* Iterator<Row> it=sh.iterator();
			    while(it.hasNext()){	
			    		    
			    	Row row=it.next();
			    	Iterator <Cell> ce= row.cellIterator();
			    	int j=0;
			    	while(ce.hasNext()){
			    		Cell cel= ce.next();
			    		//int a = cel.getCellTypeEnum();
			    		if(cel.getCellTypeEnum() == CellType.NUMERIC)
			    		{		    		
			    			double value =cel.getNumericCellValue();		    			
			    		}
			    		else if (cel.getCellTypeEnum()== CellType.STRING);
			    		{
			    			System.out.println(cel.getNumericCellValue());
			    		}
			    		j++;
			    	}
			    }*/
			    
				}catch(FileNotFoundException f){
				f.printStackTrace();}
				catch(IOException e){
					e.printStackTrace();
				}
				
	 }
	 
	 //Report verification
	 
	 static Sheet sh1=null;
	 static int row=0;
	 static String arr3[][];
	 public static void readingreportexcel() throws IOException
	 {
		
		 String Excelpath="D:\\Report testing.xlsx";
		 File fl1= new File(Excelpath);
		 try {
			FileInputStream infl=new FileInputStream(fl1);
			Workbook wb2 =null;
			String str=Excelpath.substring(Excelpath.indexOf("."));
			if(str==".xlsx")
			{
				wb2=new XSSFWorkbook(infl);
			}
			if(str==".xls")
			{
				wb2=new HSSFWorkbook(infl);
			}
			sh1 = wb2.getSheetAt(0);
			row= sh1.getPhysicalNumberOfRows();
			int col=sh1.getRow(0).getPhysicalNumberOfCells();
			arr3=new String[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr3[i][j]=sh1.getRow(i).getCell(j).getStringCellValue();
							
				}
			}
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	 @SuppressWarnings("deprecation")
	public static void feereportverification()
	 {
		 //locate Daily Fee Collection DateWise report
		 action.moveToElement(Logindem.dr.findElement(By.linkText(prop.getProperty("Feemanager.collection")))).build().perform();
		 action.moveToElement(Logindem.dr.findElement(By.linkText(prop.getProperty("Feemanager.collection.DailyFeeCollectionDateWise")))).click().build().perform();
		 Logindem.dr.switchTo().frame("Feemanager.Daily.frame.FeeCollectionDateWise");
		 Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.dailyFeecollection.fromdate"))).click();
		 Select sr1 = new Select(Logindem.dr.findElement(By.className(prop.getProperty("Feemanager.dailyFeecollection.year"))));
		 sr1.selectByValue("2016");
		 Select sr2 = new Select(Logindem.dr.findElement(By.className(prop.getProperty("Feemanager.dailyFeecollection.Month"))));
		 sr2.selectByValue("3");
		 Logindem.dr.findElement(By.xpath(prop.getProperty("Feemanager.dailyFeecollection.Date"))).click();
		 
		 Logindem.dr.findElement(By.id(prop.getProperty("Feemanager.dailyFeecollection.todate"))).click();
		 Select sr3 = new Select(Logindem.dr.findElement(By.className(prop.getProperty("Feemanager.dailyFeecollection.yearto"))));
		 sr3.selectByValue("2017");
		 Select sr4 = new Select(Logindem.dr.findElement(By.className(prop.getProperty("Feemanager.dailyFeecollection.Monthto"))));
		 sr4.selectByValue("2");
		 Logindem.dr.findElement(By.xpath(prop.getProperty("Feemanager.dailyFeecollection.Dateto"))).click();
		 Logindem.dr.findElement(By.name(prop.getProperty("Feemanager.dailyfeecollection.showbtn"))).click();
		 WebDriverWait wb=new WebDriverWait(Logindem.dr,10);
		 wb.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("Feemanager.dailyfeecollection.Titlexpath"),"DAILY FEE COLLECTION DATE WISE"));
	 }
    
}
