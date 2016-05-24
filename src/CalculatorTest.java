import org.junit.Test;

public class CalculatorTest {

	@Test
	public void EmptyString() {
		// GIVEN
		Calculator calcul = new Calculator();
		String str = "";
		// WHEN
		int result = calcul.add(str);
		// THEN

	}
}
