import java.util.*;
public class Program {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Hello ");
		list.add(" How ");
		list.add(" Are ");
		list.add(" You ");
		list.add(" !");
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next());
		}

	}

}

