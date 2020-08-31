package generics_library;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		String num = "5432";
		
		int count = 0;
		
		Set<Integer> s1 = new TreeSet<Integer>();
		
		char c[] = num.toCharArray();
			
		for(int i=1;i<=16;i++)
		
		{
			
			for(int k=0;k<num.length()-1;k++){
					
					char temp =c[k];
					
					c[k]=c[k+1];
					
					c[k+1]= temp;
					
					num = String.valueOf(c);
					
					count++;
					
					System.out.println("Count is :"+count);
					
				
					s1.add(Integer.valueOf(num));
					
					
				 }
					
			}
			
      for(Integer i : s1){
	
	    System.out.println(i);

       }

   }

}
