package generics_library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//This class is used to find the no.of times the character was repeated in a string using hashmap
public class RepeatedCharacter {
	
	static String name ="khalnayak";
	static int count=0;
	static char [] c = name.toCharArray();
	public static void main(String args[]){
		
        	Map<Character, Integer> charcterCount = new HashMap<>();
        	for(Character k: c){
        	if(charcterCount.containsKey(k)){
        		
        		count= charcterCount.get(k);
        		//System.out.println("In For Loop" +"  "+count);
        		count++;
        		charcterCount.put(k,count);
        		
        	}
        	else{
        		
        		charcterCount.put(k,1);
        	}
        	
        	}
        	Set<Character> letter = charcterCount.keySet();
        	for(Character m:letter){
        		
        		if(charcterCount.get(m)>1)
        	System.out.println("Duplicate character is " + m + "----"+charcterCount.get(m));
        	}
       }
	
}
