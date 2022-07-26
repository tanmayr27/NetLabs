import java.util.*;
public class Program {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		System.out.println("1:");
		colors(list);
		System.out.println("\n2:");
		display(list);
		System.out.println("\n3:");
		add(list);
		System.out.println("\n4:");
		retrieve(list,2);
		System.out.println("\n5:");
		replace(list,2,"Shyam");
		System.out.println("\n6:");
		remove(list,3);
		System.out.println("\n7:");
		search(list,"Rohan");
		System.out.println("\n8:");
		sort(list);
		System.out.println("\n9:");
		copy(list,list);
		System.out.println("\n10:");
		shuffle(list);
	}
	public static void colors(ArrayList<String> l)
	{
		display(l);
	}
	public static void display(ArrayList<String> l)
	{
		Iterator<String> iter=l.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	public static void add(ArrayList<String> l)
	{
		l.add("Rohan");
		display(l);
	}
	public static void retrieve(ArrayList<String> l,int pos)
	{
		System.out.println(l.get(pos));
	}
	public static void replace(ArrayList<String> l,int pos,String s)
	{
		l.set(pos,s);
		display(l);
	}
	public static void remove(ArrayList<String> l,int pos)
	{
		l.remove(pos-1);
		display(l);
	}
	public static void search(ArrayList<String> l,String s)
	{
		if(l.indexOf(s)!=(-1))
		System.out.println("Available");
		else
		System.out.println("Not Available");
	}
	public static void sort(ArrayList<String> l)
	{
		 Collections.sort(l);
		display(l);
	}
	public static void copy(ArrayList<String> l1,ArrayList<String> l2)
	{
		l2.addAll(l1);
		display(l2);
	}
	public static void shuffle(ArrayList<String> l)
	{
		 Collections.shuffle(l);
		display(l);
	}
}
