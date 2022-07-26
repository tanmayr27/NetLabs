package swap_1;

public class reverse {

	public static void main(String[] args) {
		int num=1234;
		int result=rever(num);
		System.out.println(result);
	}
	
	public static int rever(int n)
	{
		int d=0,rev=0;
		while(n>0)
		{
		d=n%10;
		rev=rev*10+d;
		n=n/10;
		}
		return rev;
	}

}
