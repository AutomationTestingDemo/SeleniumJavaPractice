package generics_library;

public class LargestNumber {

	public static void main(String[] args) {
		
		int [] i= {78,2,56,34,89,20,100,2000};
		
		int large = 0;
		
		for(int k=0;k<=i.length-1;k++) {
			
			if(i[k]>large) {
				large=i[k];
			}
			}
		
		System.out.println(large);

	}

}
