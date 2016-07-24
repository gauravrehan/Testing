package com.home.testing;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PluralsightTests {

	private Calculator c;

	/*
	Following are common annotations in junit:
		@Test
		@Before (Called before every test method)
		@After (Called after every test method)
		@BeforeClass (Called once at the start. needs to be static)
		@AfterClass (Called once at the end. needs to be static)
		@Ignore (if you want to not delete but skip a particular test)
		@Test(expected=Exception.class) (test method has to throw this exception class for test to pass. otherwise it fails.
		@Test(timeout=100) (Specify the time in milli seconds for the method to finish in otherwise the test fails.
		
		
	Following are the common type of assertions:
	assertEquals (checks for object equality using equals method)
	assertArrayEquals (compare arrays)
	assertTrue (boolean true check)
	assertFalse (boolean false)
	assertNull(null test)
	assertNotNull(not null test)
	assertSame (check for objects are same using ==)
	assertNotSame (check for object are not same using !=)
	fail (fails a test explicitely) 
		
*/

	@Before
	public void setup()
	{
		c = new Calculator();
		System.out.println("setup");
	}
	

	@Test
	public void simpleTest()
	{
		double result = c.add(1, 1);
		assertEquals("Calcuator is not able to add 1 to 1", 2, result, 0);
		
	}
	
	@Test
	public void anotherTest()
	{
		double result = c.add(121, 1323);
		assertEquals("Calcuator is not able to add 121 to 1323", 1444, result, 0);
		
	}
	
	@Test
	@Ignore
	public void skipTest()
	{
		double result = c.add(12, 1);
		assertEquals("Calcuator is not able to add 12 to 1", 132, result, 0);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void exceptionTest()
	{
		double result = c.add(12, -1);
		assertEquals("Calcuator is not able to add 12 to -1", 11, result, 0);
		
	}
	
	@Test(timeout = 100)
	public void timeoutTest()
	{
		for(int i=0; i< 1000000; i ++)
			c.add(1,i);
	}
	
	@Test
	@Ignore
	public void failTest()
	{
		fail();
		System.out.println("fail test");
	}
	
	@Test
	public void trueTest()
	{
		boolean b = true;
		assertTrue("b is not set to true", b);
	}
	
	@Test
	public void arrayTest()
	{
		int[] a = new int[] {1,3,5};
		int[] b = new int[] {1,3,5};
		assertArrayEquals("Arrays are not equal", a, b);
		
	}
	
	@After
	public void tearDown()
	{
		c = null;
		System.out.println("teardown");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
}
