package generics_library;


//This class is used to replace the word in a sentence with empty space.
public class KalyanReplace {

	public static void main(String[] args) {
		String expected = "Kalyan";
		
		String statement = "My Name is Kalyan";
		
//		if(statement.contains(expected)){
//			
//			statement = statement.replace(expected,"");
//		
//		}
		
		String[] l1= statement.split(" ");
		
		for(String s1 : l1){
			
			if(expected.equals(s1)){
				
				statement = statement.replace(expected,"");
			}
		}
		
		System.out.println(statement);

	}

}
