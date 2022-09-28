package jnuits;
import org.junit.Test;


//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTestcases {
	
		
	@Test
	public void Test1() {
		assertEquals(11,Calculators.Add(5,6));
		
		} 
	@Test
	public void Test2() {
		assertEquals(20,Calculators.Sub(40, 20));
	}
	
	
}
