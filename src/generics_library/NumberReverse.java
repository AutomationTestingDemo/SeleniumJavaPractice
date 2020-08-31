package com.cucumber;

public class NumberReverse {
 
	static int fact=0;
	public static void main(String[] args) {
		int n=789;
		int rev=0;
		while(n>0){
			
			int n1=n%10;
			rev=rev*10+n1;
			n=n/10;
		}
		System.out.println(rev);
		 fact = factorial(5);
		
		System.out.println("factorial is :"+fact);
	}

	public static int factorial(int value) {
		if(value==0) {
			fact=1;
		}
		else {
		fact =value*factorial(value-1);
		}
		return fact;
		}
}