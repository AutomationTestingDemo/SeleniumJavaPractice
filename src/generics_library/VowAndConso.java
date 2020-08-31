package com.cucumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class VowAndConso {

	public static void main(String[] args) {
		
		String s ="delicious";
		char[] a= {'a','e','i','o','u'};
		List<Character> l= new ArrayList<Character>();

		for(int i=0;i<=s.length()-1;i++) {
			
			for(char c:a) {
				
				if(c==s.charAt(i)) {
					
					System.out.println(s.charAt(i)+" is a Vowel");
					
					l.add(s.charAt(i));
					
				}
			}
			
			
		}
		
		System.out.println(l);

	}

}
