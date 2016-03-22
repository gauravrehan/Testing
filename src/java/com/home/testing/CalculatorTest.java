package com.home.testing;

import static org.junit.Assert.*;


import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void addTest()
	{
		Calculator c = new Calculator();
		double d = c.add(1,  2);
		assertEquals(3, d, 0);
		
		
	}

}
