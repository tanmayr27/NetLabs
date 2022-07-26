package swap_1;

public class Fibo2 {

	public static void main(String[] args) {
		int num=10;
		fibo(num);
	}
	
	public static void fibo(int n)
	{
		int a=0,b=1,c=1;
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(int i=0;i<10;i++)
		{
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}
}



