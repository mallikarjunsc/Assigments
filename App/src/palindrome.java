
public class palindrome {
public static void main(String[] args) {
	String  a,b="";
	a="neveroddoreven";
	b=a;
//	for(int i=a.length()-1;i>=0;i--)
//	{
//		b=b+a.charAt(i);
//	}
//	if(a.equalsIgnoreCase(b))
//	{
//		System.out.println("palindrome");
//		
//	}
//	else
//	{
//		System.out.println("Not a palindrome");
//	}
	
//	
//	b=a.replace('e', 's');
//	System.out.println(b);
//}
//	int pos=0;
//	char rep='S';
//	b=rep+a.substring(pos+1);
//	System.out.println(b);
	
	
	int count=0,count2=0;
	for(int i=0;i<a.length()-1;i++)
	{
		if(a.charAt(i)=='e'||a.charAt(i)=='a'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
		{
			count++;
		}
		else
		{
			count2++;
		}
	}
	System.out.println("vowels count = "+count);
	System.out.println("consonets count = "+count2);
//	
//	
//	
}
}