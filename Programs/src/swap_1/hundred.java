package swap_1;

public class hundred {

	public static void main(String[] args) {
		int num=100;
		prime(num);
	}
	public static void prime(int num1)
	{
		int n=2,no=1;
		while(no!=num1)
		{
		int c=0;int i=2;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			{System.out.println(n+" ");
			no++;}
		n++;
	}
	}

}
