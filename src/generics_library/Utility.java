package generics_library;

import java.io.File;

import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.actitime.projectspecific_lib.Constants;

public class Utility
{
	public static void acceptAlert()
	{
		BaseTestScript.driver.switchTo().alert().accept();
	}
	public static void dismissAlert()
	{
		BaseTestScript.driver.switchTo().alert().dismiss();
	}
	public static String getTextAlert()
	{
		String text = BaseTestScript.driver.switchTo().alert().getText();
		return text;
	}
public static void takeScreenShot(String methodName)
{
	EventFiringWebDriver ef = new EventFiringWebDriver(BaseTestScript.driver);
	File src = ef.getScreenshotAs(OutputType.FILE);
	File dest = new File (Constants.IMG_PATH+methodName+".png");
	try
	{
		FileHandler.copy(src, dest);
	}
	catch (IOException rv)
	{
		
	}
}
}
