package generics_library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class ReverseUsingIterator {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		String[] s= {"k","a","l","y","a","n"};
		
		List<String> list = Arrays.asList(s); 
		List<String> list2 = new ArrayList<String>(); 
	      System.out.println(list);
		
		ListIterator i=list.listIterator();
		
        while(i.hasNext()) {
			
		      i.next();
			}
		
		while(i.hasPrevious()) {
			list2.add((String)i.previous());
			}
		
		System.out.println(list2);
	}

}
