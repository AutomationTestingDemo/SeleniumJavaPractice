package generics_library;
	

	import java.util.HashMap;
	import java.util.Map;

	
	//This class used to print how many times each letter in a word was used
	public class CharOccurence {

		public static void main(String[] args) {
		
			
			String name = "periperilicious";
			
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			
			for(int i= 0; i<name.length();i++){
				
		       int k=0;
				
				if(!map.containsKey(name.charAt(i))){
					
					map.put(name.charAt(i), ++k);
					
				}
				
				else {
					
			Integer index = map.get(name.charAt(i));
			
			map.put(name.charAt(i), ++index);
			
				}
				
				
				}
			
	for(Map.Entry<Character, Integer> e1 :map.entrySet()){
				
				System.out.println("Element : " + e1.getKey()+" : Repeated "+e1.getValue()+" Times ");
			}

		}

	}
