package generics_library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.actitime.projectspecific_lib.Constants;

public class Countrys {
	
	public static void main(String [] args){
		
		List<String> l1 = new ArrayList<String>();
		System.setProperty("webdriver.gecko.driver",Constants.FF_PATH);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "https://geodata.solutions/";
				driver.get(url);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.name("country"));
		Select sel = new Select(country);
		sel.selectByIndex(4);
		List<WebElement> alloptions = sel.getOptions();
		
		for(int i=1;i<10;i++){
			
			l1.add(alloptions.get(i).getText());
			
			
		}
		
		System.out.println(l1.toString());
		
		List <String> sortedlist = new ArrayList<String>();
		sortedlist.addAll(l1);
		Collections.sort(sortedlist);
		
		System.out.println(sortedlist.toString());
		
		if(sortedlist.equals(l1)){
			
			System.out.println("Elements in DropDown are in Sorted Order");
		}
		else{
			
			System.out.println("Elements in DropDown are not in Sorted Order");
		}
		
	}

}
