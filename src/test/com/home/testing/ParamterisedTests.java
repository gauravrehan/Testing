package com.home.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;


import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamterisedTests {
	
	@Parameters
	public static List<Object[]> data()
	{
		return Arrays.asList(new Object[][] {
			{1,1,2},
			{3,3,6},
			{7,3, 10}
		});
	}

	private double input1;
	private double input2;
	private double expectedResult;
	
	public ParamterisedTests(double input1, double input2, double expectedResult)
	{
		this.input1 = input1;
		this.input2 = input2;
		this.expectedResult = expectedResult;
	}
	
	private static Calculator c = new Calculator();
	
	@Test
	@Ignore
	public void paramterisedCalculatorSimpleTest()
	{
		double result = c.add(input1, input2);
		assertEquals("Simple parameterized test failed.", expectedResult, result, 0);
	}
	
	@Test
	public void paramterisedHamcrestCalculatorSimpleTest()
	{
		double result = c.add(input1, input2);
		assertThat(result, is(expectedResult));
		assertThat(result, allOf(is(expectedResult), instanceOf(Double.class)));
	}
	

}
