package jnuits;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;

public class JunitStringTest {
	@Test
	public void Test1() {
		assertTrue(JunitString.isPalindrome("MADAM"));
		
	}
	@Test
	public void Test2() {
		assertFalse(JunitString.isPalindrome("IMRAN"));
		
	}
	
}
