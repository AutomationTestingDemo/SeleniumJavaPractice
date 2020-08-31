package generics_library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//This class is used to print unique values taking a list with duplicate inputs
public class PrintUnique {

	public static void main(String[] args) {
		
		List<String> List1 = new ArrayList<String>(); 

		List1.add("A"); 
		List1.add("A"); 
		List1.add("B"); 
		List1.add("B"); 
		List1.add("B"); 
		List1.add("C"); 
		
		Set s=new TreeSet(); 
		s.addAll(List1); 
		Iterator it=s.iterator(); 
		while (it.hasNext()) 
		{ 
		System.out.println("Set :"+ it.next()); 
		} 

	}

}
