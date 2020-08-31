package generics_library;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.actitime.projectspecific_lib.Constants;

@Listeners(CustomListner.class)
public class BaseTestScript 
{
	public static WebDriver driver;
	@BeforeMethod
		public void precond()
		{

String browserType = ExcelUtil.readData(Constants.XL_PATH,"configInfo",1,0);
		
		if(browserType.equals("GC"))
		{
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
			driver= new ChromeDriver();
		}
		else if(browserType.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", Constants.CHROME_PATH);
			driver= new InternetExplorerDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}

		driver.get("http://lenovo-pc:8080/login.do");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
 @AfterMethod
public void postcond()
{
	 driver.close();
}
@AfterSuite
public void backup()
{
	Date d1= new Date();
	String currentDateAndTime = d1.toString().replace(':', '_');
	File src =new File("./test_output");
	File dest =new File("./Reports/"+currentDateAndTime+".zip");
	Zip z1= new Zip();
	try
	{
		z1.zip(dest);
	}
	
	catch(IOException rv)
	{
		
	}
}
}
