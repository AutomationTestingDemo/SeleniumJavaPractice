package generics_library;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringSorting {

	public static void main(String[] args) {
		
		String[] a ={"Kalyan","Chakri","Chintu","Sanchi","Anu","Bhanu"};
		
		Set<String> s1 = new TreeSet<String>();
		
		for(String s:a){
			
			s1.add(s);
			
		}
		
		Iterator i1=s1.iterator();
		
		while(i1.hasNext()){
			
			
			Object s2 = i1.next();
			
		System.out.println(s2.toString());	
			
		}
		
		}
	}
