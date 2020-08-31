package generics_library;
import java.io.*;
class CheckedExceptionBaseAndChildClass {  
	void color()
	{
		  System.out.println("Blue");
	}  
}
class Room extends CheckedExceptionBaseAndChildClass{
	  void color() throws NullPointerException //Unchecked Exception
	  {
		  System.out.println("White");
	  }  
	  public static void main(String args[]){  
		  CheckedExceptionBaseAndChildClass obj = new Room();  
		   try{
		   obj.color();
		   }catch(Exception e){
			   System.out.println(e);
		   }
	  } 
}