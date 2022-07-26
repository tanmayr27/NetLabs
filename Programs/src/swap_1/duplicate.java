package swap_1;

import java.util.*;
public class duplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,5,6,8,8,9,10};
		duplicate(arr);

	}
public static void duplicate(int a[])
{
	LinkedHashSet<Integer> dup=new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		dup.add(a[i]);
	}
		System.out.print(dup);
	
}

}
