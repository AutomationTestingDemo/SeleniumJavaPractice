package generics_library;

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B(10.5);

	}

}

class A

{

 int i;

	public A(int i) {
		
		this.i=i;
		
		System.out.println("Class A constructor");
		
	}
	
}


class B extends A

{
	
	 double j;

	public B(double j) {
		super(6);
		this.j=j;
		System.out.println("Class B constructor");
		
	}
	
}