package BTC_Assigments;

public class Thirty {
	public static void main(String[] args) {
		 String ip="0201103311";
		 boolean b=ISBNnumber(ip);
		 if(b==true)
		  System.out.println("valid ISBN number");
		 else
		  System.out.println("check ur data");
		}
		public static boolean ISBNnumber(String ip) {
		 boolean b=false;
		 int sum=0;
		 for(int i=0,j=ip.length();i<ip.length();i++,j--){
		  String s=String.valueOf(ip.charAt(i));
		  int n=Integer.parseInt(s);
		  sum+=(n*j); }

		 if(sum%11==0)
		  b=true;
		 return b;
		}
}
