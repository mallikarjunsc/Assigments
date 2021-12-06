
public class PatternTest {
	
  public static void main(String[] args) {
	printPattern(4);
}
	    
	    public static void printPattern(int num){
	        for(int i=1;i<=num;i++) {
	        	for(int j=i;j<=num;j++)
	        	{
	        		System.out.print(" ");
	        	}
	        	for(int j=1;j<=i;j++)
	        	{
	        		System.out.print("*");
	        	}
	        	System.out.println();
	    }
	}
}
