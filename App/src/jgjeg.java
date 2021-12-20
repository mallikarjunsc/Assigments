
public class jgjeg {
	public static void main(String[] args) {
		//	String Str="UTa!@Ayta$#@2:30";
		//	Str=Str.replaceAll("[^a-zA-Z]","");
		//	System.out.println(Str);


		//		int a=12;
		//		int b=14;
		////		int c=a+b;
		////		a=c-a;
		////		b=c-a;
		////		System.out.println(a);
		////		System.out.println(b);
		//		a=a+b;
		//		b=a-b;
		//		a=a-b;
		//		System.out.println(a);
		//		System.out.println(b);
		//		
		//	1.total number of characters
		//		int count=0;
		//		String s="AJSHGEhrguq";
		//		for(int i=0;i<=s.length()-1;i++)
		//		{
		//		  count++;	
		//		}
		//		System.out.println(count);

		//		2.Java Program to Count the Total Number of Punctuation Characters Exists in a String
		//		int count=0;
		//      String s="He said, 'The mailman loves you.' I heard it with my own ears/?.";
		//      for(int i=0;i<=s.length()-1;i++)
		//      {
		//    	  if(s.charAt(i)==','||s.charAt(i)==':'||s.charAt(i)=='.'||s.charAt(i)=='/'||s.charAt(i)=='?')
		//    	  {
		//    		 count++; 
		//    		 
		//    	  }
		//    	 
		//      }
		//      System.out.println(count); 

		//      count the number of vowels and consonants in a String
		int count1=0;
		int count2=0;
		String str="IefininityNot";
		
				for(int i=0;i<=str.length()-1;i++)
				{
					if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
						count1++;
					}
					else
					{
						count2++;
					}
				}
		System.out.println(count1);
		System.out.println(count2);
	}
}
