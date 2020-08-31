package pack1;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static void main(String[] args) throws Exception
	{
		System.out.println("main starts");
		String path="C:/kalyan/data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1 =w1.getSheet("Sheet3");
		for(int k=1; k<=4;k++){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		for(int i=1;i<=s1.getLastRowNum();i++){
			String usrname = s1.getRow(i).getCell(0).getStringCellValue();
			for(int j=1;j<=s1.getRow(i).getLastCellNum()-2;j++)
			{
		
		String pwd = s1.getRow(i).getCell(j).getStringCellValue();
	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(""+usrname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(""+pwd);
		driver.findElement(By.id("loginButtonContainer")).click();
		
		driver.findElement(By.className("logoutContainer"));
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	
			}
		}
		
	}
		}
	}




