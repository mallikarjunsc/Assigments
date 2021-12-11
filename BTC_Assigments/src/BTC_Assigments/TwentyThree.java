package BTC_Assigments;

import java.util.ArrayList;

public class TwentyThree {
	public static void main(String[] args) {
		 String[] ip={"100","111","10100","10","1111"};
		 gteCount(ip);
		}
		public static void gteCount(String[] ip) {
		 int op=0;
		 ArrayList<String> l1=new ArrayList<String>();
		 for(String s:ip)
		  if(s.startsWith("10") || s.startsWith("01") &&(s.length()>2))
		   l1.add(s);
		 op=l1.size();
		 System.out.println(op);
		}
}
