package generics_library;
public class Continue {

	public static void main(String[] args) {
		    for(int i=0;i<10;i++)
		    {
		        if (i==4)
		        {
		            break;
		        }
		        System.out.print(i+"\t");

		    }
		    
		    System.out.println("comes out of 1st For Loop");
		    
		    for(int i=0;i<10;i++)
		    {

		        if (i==4)
		        {
		            continue;
		        }
		        System.out.print(i+"\t");
		    }
		}
	}


