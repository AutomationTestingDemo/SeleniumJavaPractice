package generics_library;

public class NumberSortingBubble {
	
	public static void main(String[] args) {
		
		int [] a ={9,8,7,0,1,6,5,3};
		int temp;
		for(int i=0;i<=a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]>a[j]){
				temp = a[i];
				 a[i]=a[j];
				 a[j]= temp;
				 
				}
			}
		}
		
		System.out.println(a.toString());
		
	for(int k : a){
	System.out.println(k);
	}
}
}
