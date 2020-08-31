package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	public static void main(String [] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
		
	}


}
