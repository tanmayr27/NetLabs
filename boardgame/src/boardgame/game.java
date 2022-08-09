package boardgame;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();;
			}
		}
		
		for(int i=0;i<n;i++)
		{int c=0;
			for(int j=0;j<n;j++)
			{
				if(a[i][j]!=0)
					c++;
			}
			System.out.println(c);
		}
		
		

	}

}
