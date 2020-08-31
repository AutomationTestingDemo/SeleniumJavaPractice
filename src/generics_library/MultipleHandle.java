package generics_library;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MultipleHandle {
	public static void main(String [] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("nav-startusingat"));
		driver.findElement(By.xpath("//a[text()='Try Free']")).click();
		driver.findElement(By.id("firstName")).sendKeys("kalyan");
		driver.findElement(By.name("sendRequest")).click();
		Alert a = driver.switchTo().alert();
		String s1= a.getText();
		System.out.println(s1);
		a.accept();
		
	}
}
