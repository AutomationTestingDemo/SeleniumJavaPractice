package generics_library;

public class ReplacingCharacters {

	public static void main(String[] args) {
		
		String s = "1E34eRy#@1!sanCHI";
		
		String s2="";
		
		for(int i=0;i<s.length();i++){
			
			if(Character.isAlphabetic(s.charAt(i))){
				
				s2= s2+s.charAt(i);
			}

		}
		
         System.out.println(s2);
	}

}
