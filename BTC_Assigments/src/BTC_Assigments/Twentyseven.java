package BTC_Assigments;
import java.util.*;
public class Twentyseven {
	public static void main(String[] args) {
		 String ip1="AAA/abb/CCC";
		 char ip2='/';
		 String op[]=loweringCasenReverseofaString(ip1,ip2);
		 for(String s:op)
		 System.out.println(s);
		}
		public static String[] loweringCasenReverseofaString(String ip1, char ip2){
		 List<String> l=new ArrayList<String>();
		 StringTokenizer t=new StringTokenizer(ip1,"/");
		 while(t.hasMoreTokens()){
		  StringBuffer sb=new StringBuffer(t.nextToken().toLowerCase());
		  l.add(sb.reverse().toString()); }
		 String op[]=new String[l.size()];
		 for(int i=0;i<op.length;i++)
		  op[i]=l.get(i);
		 return op;
		}

}
