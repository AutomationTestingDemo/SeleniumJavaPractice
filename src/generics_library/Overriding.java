package generics_library;

 class Parent {

	 void color() {
		
		System.out.println("Static Color Method Parant");
		
	}
	
	void Shape(){
		
		System.out.println("Non Static shape Method");
	}

}
 
 class Child extends Parent{
	 
	 
	  void color() {
			
			System.out.println("Static Color  Child Method");
			
		}
		
		void Shape(){
			
			System.out.println("Non Static Child shape Method child method");
		} 
	 
 }

 public class Overriding {
	 
	 public static void main(String [] args){
		 
//		 Parent p = new Parent();
//		 
//		 p.color();
//		 
//		 p.Shape();
//			 
//		 Child c = new Child();
//		 
//          c.color();
//		 
//		 c.Shape();
		 
		 Parent p1 = new Child();
		 
           p1.color();
		 
		   p1.Shape();
		 
	 }
	 
	 
 }