package BTC_Assigments;

public class TwentyFour {
	public static void main(String[] args) {
		 String ip1="hello";
		 String ip2="helloworld";
		 System.out.println(removalOfCharFromLargestString(ip1,ip2));
		}
		public static String removalOfCharFromLargestString(String ip1,String ip2){
		 StringBuffer sb=new StringBuffer();
		 int n1=ip1.length();
		 int n2=ip2.length();
		 if(n1<n2)
		  sb.append(ip2.substring(n1, n2)).append(ip1);
		 return sb.toString();
		}
}
