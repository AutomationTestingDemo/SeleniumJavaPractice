package com.infogain.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Multiple_Li {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kalyan.c\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("file:///C:/Users/Kalyan.c/Desktop/text.html");
		
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='Flipkart']//li"));
		
		int n = l1.size();
		
		for(WebElement w : l1){
			
			System.out.println(w.getText());
		}
		System.out.println("Size is : "+n);
		

	}

}
