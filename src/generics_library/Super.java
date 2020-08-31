package com.infogain.automation;

class Person
{

String name;
 String name2;

Person(String name2, String name)

{ 
	
this.name = name; 
this.name2 = name2;

} 

}

class Emp extends Person{ 
	
float salary; 

Emp(String name,String name2 ,float salary){ 
	
super(name2, name);
//reusing parent constructor 
this.salary=salary; 

} 
void display(){
	
System.out.println(name+" "+salary+"..."+name2);
} 

} 


public class Super {

public static void main(String[] args) {
Emp e1=new Emp("Vikram","Mahesh",45000f); 
e1.display(); 
}
} 