import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calcul;

	@Before
	public void setup() {
	//Initialization of test parameters
		calcul = new Calculator();
	}

	@Test
	public void EmptyString() {
		// GIVEN
		// Calculator calcul = new Calculator();
		String str = "";
		// WHEN
		int result = calcul.add(str);
		// THEN
		assertEquals(0, result);
	}
	
	@Test
	public void OneNumber() {
		//Second test with a number
		
		// GIVEN
		// Calculator calcul = new Calculator();
		String str = "1";
		// WHEN
		int result = calcul.add(str);
		// THEN
		assertEquals(1, result);
	}
}
