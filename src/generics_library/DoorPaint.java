package pack1;

public class DoorPaint {

	public static void main(String[] args) {
		
		int i;
		int j=100;
		for(i=1;i<=j;i++){
			
			for(;;){
				
				if(i==j){
					
					System.out.println("They met at this Door"+" "+i);
					return;
				}
				else {
					
					break;
				}
				
				}
			
			j-=3;
			
			
			System.out.println("Value of J in I Loop"+" "+j+" i value"+i);
			
		}

	}

}
