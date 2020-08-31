package generics_library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.projectspecific_lib.Constants;

public class Amazon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",Constants.FF_PATH);
		WebDriver driver = new FirefoxDriver();
		String url ="https://www.amazon.in/";
				driver.get(url);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike Men's Navy Blue/White Downshifter 7 Running Shoes");
        driver.findElement(By.className("nav-input")).click();
      
        String Expected = "Nike Men's Navy Blue/White Downshifter 7 Running Shoes";
        	
        String Actual1 = driver.findElement(By.linkText("Nike Men's Navy Blue/White Downshifter 7 Running Shoes")).getText();
        
        if(Actual1.equalsIgnoreCase(Expected)){
        	
        	System.out.println("Validation Pass : "+" "+Actual1);
        	
        	Expected = driver.findElement(By.tagName("a")).getText();
        	
        	System.out.println(Expected);
        	
        	driver.findElement(By.xpath("//a[contains(@href,'https://www.amazon.in/Nike-Downshifter-Running-Shoes-White/dp/B071Z3DFVC')]")).click();
        	
            }    
        
       String parent = driver.getWindowHandle();
       Set<String> windows = driver.getWindowHandles();
       
       //Iterator<String> i1=windows.iterator();
       
       //while(i1.hasNext()){
    	   
    	  // String cb =i1.next();
       
       for(String cb : windows){
    	   
    	   System.out.println("Parent Window: "+ parent);
    	   System.out.println("Child Window: "+ cb );
    	   
    	   if(!parent.equals(cb)){
    		 
    		   driver.switchTo().window(cb);
    		   
    	  String Actual2 = driver.findElement(By.id("productTitle")).getText();
    	  
    	  System.out.println("While Loop Actual2 :"+" "+Actual2);
          	
          	driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
          	
					Thread.sleep(5000);
					
                 driver.close();
    	   } 
       }
       
       driver.switchTo().window(parent);
       
     driver.navigate().refresh();
    
     
   driver.findElement(By.xpath("//span[text()='Amazon']")).click();
   
   File f1 =  new File("Cookies.data");
   
   try{
	   
	   f1.delete();
	   f1.createNewFile();
	   
	   FileWriter fw = new FileWriter(f1);
	   
	   BufferedWriter bw =  new BufferedWriter (fw);
	   
	   for(Cookie ck : driver.manage().getCookies()){
		   
		   bw.write(ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure());
		   
		   bw.newLine();
	   }
	   
	   bw.close();
	   fw.close();
	   
   }
   
   catch(Exception e){
	   
	   
	   e.printStackTrace();
   }
     
    driver.close();
 
     System.setProperty("webdriver.gecko.driver",Constants.FF_PATH);
		driver = new FirefoxDriver();

		try{
			
			File f2 =  new File("Cookies.data");
			
			FileReader fr = new FileReader(f2);
			BufferedReader br = new BufferedReader(fr);
			String strline;
			
			while((strline=br.readLine())!=null){
				
				
				StringTokenizer token = new StringTokenizer(strline,";");
                while(token.hasMoreTokens()){
                	
				String name = token.nextToken();
				String value = token.nextToken();
				String domain = token.nextToken();
				String path = token.nextToken();
				Date expiry=null;
				String val;
				
				if(!(val=token.nextToken()).equals(null)){
					
					SimpleDateFormat sdf=new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
					System.out.println(val);
			        expiry =sdf.parse(val);
			        SimpleDateFormat sdf2=new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
			        System.out.println(sdf2.format(expiry));
				}
				
				Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
				
				
				System.out.println(name);
				System.out.println(value);
				System.out.println(domain);
				System.out.println(path);
				System.out.println(expiry);
				System.out.println(isSecure);
				
				Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
				System.out.println(ck);
				
				driver.manage().addCookie(ck);
	
				}
			}
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kalyanthechakravarthi@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kaju19@M");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
	    }

    }
