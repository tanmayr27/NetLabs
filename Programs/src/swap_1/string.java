package swap_1;
import java.util.*;
public class string {

	public static void main(String[] args) {
		String s1="hello";
		revs(s1);
	}
	public static void revs(String s)
	{
		int l=s.length();
		for(int i=l-1;i>=0;i--)
			System.out.print(s.charAt(i));
	}
}
