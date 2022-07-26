package swap_1;

public class swap1 {

	public static void main(String[] args) {
		int num1=5;int num2=6;
		swap(num1,num2);
	}

	public static void swap(int a,int b)
	{
		a=a+b;//a=11
		b=a-b;//b=11-6=5
		a=a-b;//a=11-5=6
		System.out.println("a="+a+", b="+b);
	}
}
