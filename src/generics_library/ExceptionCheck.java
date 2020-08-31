package generics_library;

public class ExceptionCheck {

	public static void main(String[] args) {
		
		try{
			
			try{
				
				throw new CustomisedException("Inner Catch Block");
			}
			
			finally{
				
				System.out.println("Finally Block");
			}
		}
		 catch (CustomisedException E){
			 
			 
			 System.out.println(E.getMessage());
			 
			 
		 }

	}
}

	class CustomisedException extends Exception {
		
		public CustomisedException(String Message){
		
			super(Message);
		
	}

}
