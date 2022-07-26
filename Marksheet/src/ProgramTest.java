import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTest {

	@Test
	void test() {
		Marks m = new Marks(0,0,0,0,0);
		assertEquals("Apply next Sem",m.findmarks(10,20,30,40,50));
	}

	
	
}
