package swap_1;

public class lcm {

	public static void main(String[] args) {
		int x=4,y=10;
		int result=lcm(x,y);
		System.out.println(result);
	}
	
	public static int lcm(int a,int b)
	{
		int c=1,i=1;
		if(a>b)
			c=a;
		else
			c=b;
		for(i=c;i<=a*b;i++)
		{
			if((i%a==0)&&(i%b==0))
			break;
		}
		return i;
	}

}
