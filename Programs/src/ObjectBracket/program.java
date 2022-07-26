package ObjectBracket;
import java.util.*;

public class program 
{
	public static void main(String[] args)
	{
		String bracket = "[{()}]";
		if (checkbracket(bracket))
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
	}
	
	public static boolean checkbracket(String s)
	{
		Stack<Character> stack= new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if (ch == '(' || ch == '[' || ch == '{')
			{
				stack.push(ch);
				continue;
			}

			if (stack.isEmpty())
				return false;

			char check;
			
			switch (ch) 
			{
			case ')':
					check = stack.pop();
					if (check == '{' || check == '[')
					return false;
					break;

			case '}':
					check = stack.pop();
					if (check == '(' || check == '[')
					return false;
					break;

			case ']':
					check = stack.pop();
					if (check == '(' || check == '{')
					return false;
					break;
			}
		}
		return (stack.isEmpty());
	}
}