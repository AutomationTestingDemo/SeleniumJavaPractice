package generics_library;


//this class is used to print all the letter in a string one by one using char array
public class CharactersPrint {

	public static void main(String[] args) {
		
		String sent = "what the fuck";
		
		String [] sent2=sent.split(" ");
		sent = sent.replace(" ","");
		 char[] c = sent.toCharArray();
		 
		 for(char s1 : c){
			 
			 
			 System.out.println(s1);
		 }

	}

}
