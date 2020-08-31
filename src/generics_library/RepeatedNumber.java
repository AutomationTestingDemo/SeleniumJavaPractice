package generics_library;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


//This class is used to find the no.of times the number was repeated in a list using hashmap
public class RepeatedNumber {
	
	public static void main(String args[]){
		
		int count=0;
		
		List<Integer> l = new ArrayList<Integer>();
		 l.add(56);
		 l.add(78);
		 l.add(87);
		 l.add(56);
		 l.add(23);
	
		 Map<Integer, Integer> num = new HashMap<>();
     	for(Integer k:l){
     	if(num.containsKey(k)){
     		
     		count= num.get(k);
     		count++;
            num.put(k,count);
	
     	}
     	else{
     		
     		num.put(k,1);
     	}
     	
     	System.out.println("In For Loop" +"  "+k.toString() + "Index Value is"+ l.indexOf(k));
     	}
     	
     	Set<Integer> keys = num.keySet();
     	for(Integer m : keys){
     		
     		if(num.get(m)>1){
     			
     			System.out.println("Duplicate Num is " + m + "----"+num.get(m));
     		}
		
     	}
     	
     	}
}