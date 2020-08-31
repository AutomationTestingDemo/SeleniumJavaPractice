package generics_library;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//This class is used to print the map inputs in ascending order based on key Value

public class Map1 {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(3,"Kalyan");
		m1.put(5,"chakri");
		m1.put(2,"chintu");
		m1.put(6,"sanchi");
		
	Set<Integer> s= m1.keySet();
	Collection<String> s1= m1.values();
	
	Iterator i=s.iterator();
	while(i.hasNext()){
		
		System.out.println(i.next());
	}
    for(String c: s1){
    	
    	System.out.println(c);
    }

//Iterating maps through enhanced for loop 
    
for(Map.Entry<Integer, String> f : m1.entrySet()){
	
	System.out.println("Key is  : " + f.getKey()+"...."+" Value is : " + f.getValue());
}


    Set<Map.Entry<Integer, String>> set = m1.entrySet();

    for(Map.Entry<Integer, String> s3 : set){
    	
    	System.out.println("Key  : " + s3.getKey()+"...."+" Value  : " + s3.getValue());
    	
    }
}

}
