package sing;

public class program {

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		if(x==y)
			System.out.println("Both are same");

	}

}
