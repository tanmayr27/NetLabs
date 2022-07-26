
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello...");
		OuterClass outer=new OuterClass();
		OuterClass.Inner inner=outer.new Inner();
		inner.sayHi();
		
		InnerInterface innerInterface=new InnerAdaptor() {
			public void sayA() {
				System.out.println("anonymous inner class");
			}
		}
	}

}
