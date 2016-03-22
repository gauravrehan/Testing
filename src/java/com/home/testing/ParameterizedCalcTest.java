package com.home.testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParameterizedCalcTest {

	double a;
	double b;
	double expected;
	
	public ParameterizedCalcTest(double a, double b, double expected)
	{
		this.a = a;
		this.b = b;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Integer[]> getParameters(){
		return Arrays.asList(new Integer[][]{{1,2,3}, {3,4,7}});
	}
	
	@Test
	public void sum()
	{
		Calculator c = new Calculator();
		double result = c.add(a, b);
		assertEquals(expected, result, 0);
	}
}
