package generics_library;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//This class is used to sort the string inputs of an array using treemap

public class MapStringSorting {

	public static void main(String[] args) {
		
		String[] a ={"Kalyan","Chakri","Chintu","Sanchi","Anu","Bhanu"};
		
		Map<String, String> m1 = new TreeMap<String, String>();
		
		for(String s : a){
			
			m1.put(s,"Kalyan");
		}
		
		for(Map.Entry<String,String> e : m1.entrySet()){
			
			System.out.println(e.getKey());
		}
	}
}