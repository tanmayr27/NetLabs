package prog;

public class pattern {

	public static void main(String[] args) {
		int no=6;
		pattern(no);
	}
	public static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=6-i;sp++)
			{
				System.out.print(" ");
			}
				for(int asc=1;asc<=i-1;asc++)
				{
					System.out.print(asc+" ");
				}
					for(int desc=i;desc>=1;desc--)
					{		System.out.print(desc+" ");
				}
					System.out.println();
			
		}

}
}
