package com.cucumber;
import java.util.regex.*;

public class RegexNumber {

	public static void main(String[] args) {
		
		String s="235,spiceFarden,5thBlock,PIN:560037";
		String regexPattern = "\\d+";
	      Pattern pattern = Pattern.compile(regexPattern);
	      Matcher matcher = pattern.matcher(s);
	      System.out.println("Digits in the given string are: ");
	      while(matcher.find()) {
	         System.out.print(matcher.group()+" ");
	    	  
	}
}
}