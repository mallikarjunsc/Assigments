package BTC_Assigments;
import java.io.*;
public class fifteen {
	static int getSum(int n)
	{
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;
	}

	
	public static void main(String[] args)
	{
		int n = 125;

		System.out.println(getSum(n));
	}
}
