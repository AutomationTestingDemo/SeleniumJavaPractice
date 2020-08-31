package generics_library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringOccurence {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();

		l1.add("Kalyan");
		l1.add("Chakri");
		l1.add("Harry");
		l1.add("Tom");
		l1.add("Kalyan");
		l1.add("Bella");
		l1.add("Edward");
		l1.add("Kalyan");
		l1.add("Kalyan");
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String element : l1){
			
			int k=0;
			
			if(!map.containsKey(element)){
				
				map.put(element, ++k);
				
			}
			
			else {
				
		Integer index = map.get(element);
		
		map.put(element, ++index);
		
			}
			
		}

		for(Map.Entry<String, Integer> e1 :map.entrySet()){
			
			System.out.println("Element : " + e1.getKey()+" : Repeated "+e1.getValue()+" Times ");
		}
		
	}

}
