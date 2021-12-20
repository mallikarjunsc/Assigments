package pattern;

public class onh {
	public static void main(String[] args) {
		
	
    for(int i=1;i<=6;i++)
    {
    	for(int j=5;j>=i-1;j--)
    	{
    		System.out.print("M");
    	}
    	for(int k=1;k<=i;k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
}
}