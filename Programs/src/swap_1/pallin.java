package swap_1;

public class pallin {

	public static void main(String[] args) {
		int num=121;
		boolean result=pallin(num);
		System.out.println(result);
	}
	
	public static boolean pallin(int n)
	{
		int n1=n;
		int d=0,rev=0;
		while(n>0)
		{
		d=n%10;
		rev=rev*10+d;
		n=n/10;
		}
		if(n1==rev)
		return true;
		else
		return false;
	}

}
