package generics_library;

public class IntArraySorting {

	public static void main(String[] args) {
		
		int [] a= {400,300,200,78,2,56,34,89,20,100};
		int temp=0;
		for(int i=1;i<a.length-1;i++) {
			
			for(int k=0;k<a.length-1;k++) {
				
				if(a[k]>a[k+1]) {
					
					temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
					
				}
			}
		}
		
		for(int i:a) {
			System.out.println(i);
		}
	}

}
