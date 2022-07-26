package prog;

import java.util.Scanner;

public class height {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h1ft=sc.nextInt();
		int h1inch=sc.nextInt();
		int h2ft=sc.nextInt();
		int h2inch=sc.nextInt();
		double result=convert(h1ft,h1inch,h2ft,h2inch);
		System.out.println(result);
	}
	public static double convert(int lft1,int linch1,int bft1,int binch1)
	{
		double sum=(lft1*30.48)+(linch1*2.54)+(bft1*30.48)+(binch1*2.54);
		return sum;
	}
}
