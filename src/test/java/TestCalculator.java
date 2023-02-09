import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	static Calculator c;
	
	@BeforeAll
	static void setup() {
		c = new Calculator();
	}
	
	@Test 
	@DisplayName("Metodo Addizione")
	public void add(){
		float result = c.add(3,3);
		assertEquals(result,6);
		
	}
	
	@Test 
	@DisplayName("Metodo Sottrazione")
	public void sottrazione(){
		float result = c.substract(5,3);
		assertEquals(result,2);
		
	}
	
	@Test 
	@DisplayName("Metodo Divisione")
	public void divisione() {
		float result = c.divide(10,2);
		assertEquals(result,5);
		
	}
	
	@Test
	@DisplayName("Metodo Moltiplicazione")
	public void moltiplicazione() throws Exception {
		assertThrows(Exception.class, () -> c.multiply(0, 0));
	}
	
	
}