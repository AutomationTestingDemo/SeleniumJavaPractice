package generics_library;


	import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
public class Test_01 
{
		public static void main(String[] args) throws Exception
		{
			System.out.println("main starts");
			String path="C:/kalyan/data.xlsx";
			FileInputStream fis = new FileInputStream(path);
			Workbook w1= WorkbookFactory.create(fis);
			Sheet s1 =w1.getSheet("Sheet4");
			
			WebDriver driver = new FirefoxDriver();
			driver.get("http://lenovo-pc:8080/login.do");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			String epec=s1.getRow(1).getCell(2).getStringCellValue();
			
		String usrname = s1.getRow(1).getCell(0).getStringCellValue();
			String pwd = s1.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.name("username")).sendKeys(usrname);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
			driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
			driver.findElement(By.name("name")).sendKeys("banni");
			driver.findElement(By.xpath("//input[@value='Create Customer']")).click();
			String actual = driver.findElement(By.className("successmsg")).getText();
			System.out.println(actual);
			Cell c1= s1.getRow(1).createCell(3);
			c1.setCellValue(actual);
			Cell c= s1.getRow(1).createCell(4);
			if(epec.equals(actual))	
			{
			c.setCellValue("pass");
			}
			else{
				c.setCellValue("fail");
				
			}
				
			FileOutputStream fos= new FileOutputStream(path);
			w1.write(fos);
			driver.findElement(By.className("logoutImg")).click();
			fis.close();
			fos.close();
			}
			}


