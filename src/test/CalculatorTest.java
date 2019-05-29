package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;


import logic.Calculator;

public class CalculatorTest {
	Calculator c;
	
	
	@Before
	public void setUp() {
		c = new Calculator();
	}
	
	@Test
	public void addTest() {
		assertEquals("Numbers did not add up correctly"
				,7
				,c.add(5,2));
	}
	
	
	
	

}
