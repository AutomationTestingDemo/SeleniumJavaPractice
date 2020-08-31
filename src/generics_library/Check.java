package pack1;


	import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Check 
{
		public static void main(String[] args) throws Exception
		{
			
			System.out.println("main starts");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://lenovo-pc:8080/login.do");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			String path="C:/kalyan/data.xlsx";
			FileInputStream fis = new FileInputStream(path);
			Workbook w1= WorkbookFactory.create(fis);
			Sheet s1 =w1.getSheet("TC_01");
			int lr = s1.getLastRowNum();
	       for(int i=1; i<= lr; i++)
	       {
	    	   Row r1= s1.getRow(i);
	       driver.findElement(By.name("username")).sendKeys(r1.getCell(0).getStringCellValue());
			driver.findElement(By.name("pwd")).sendKeys(r1.getCell(1).getStringCellValue());
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			String actual = driver.getTitle();
			Cell c1= r1.createCell(3);
			c1.setCellValue(actual);
			String epec=s1.getRow(1).getCell(2).getStringCellValue();
			c1 = r1.createCell(4);
			if(epec.equals(actual))	
			{
			c1.setCellValue("pass");
			}
			else{
				c1.setCellValue("fail");
				
			}
				
			FileOutputStream fos= new FileOutputStream(path);
			w1.write(fos);
			if(epec.equals(actual))
			{
			driver.findElement(By.className("logoutImg")).click();
			}
			WebElement un = driver.findElement(By.name("username"));
			un.clear();	
	       }
			fis.close();
			
			driver.close();
			}
		
}