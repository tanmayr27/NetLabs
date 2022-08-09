
public class VendingMachine {

	private Builder builder;
	private int beverageType;
	
	pubic VendingMachine(Builder builder) {
		this.builder=builder;
	}
	public void prepare(int beverageType) {
		if(beverageType == 1) {
			builder.addCoffeePowder(null);
			builder.addMilk(null);
			builder.addWater(null);
			builder.addSugar(null);
		}
		else if(beverageType == 2)
		{

			builder.addTeaPowder(null);
			builder.addMilk(null);
			builder.addWater(null);
			builder.addSugar(null);
			
		}
	}
}
