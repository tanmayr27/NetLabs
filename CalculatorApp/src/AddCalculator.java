import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddCalculator {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(30,calc.add(10, 20));
	}

	@Test
	void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(10,calc.subtract(20, 10));
	}
	
	

}






