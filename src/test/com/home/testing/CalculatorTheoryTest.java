package com.home.testing;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/*
 * Theories in junit are used to prove a point with multiple set of inputs to result in single 
 * expected output. this is the main difference between Theories and the Parameterised test 
 * because in parameterised test, the all different inputs may have different expected result.
 */

@RunWith(Theories.class)
public class CalculatorTheoryTest {

	@DataPoints
	public static List<double[]> data()
	{
		return Arrays.asList(new double[][] {
			{1,2},
			{2,1}//change 1 to 4 and see your theory fail
		}) ;
	}
	
	@Theory
	public void CalculatorResultfor3(double... inputs)
	{
		Calculator c = new Calculator();
		double result = c.add(inputs[0], inputs[1]);
		double expected = 3;
		assertEquals("Result is not 3", expected, result, 0);
	}
}
