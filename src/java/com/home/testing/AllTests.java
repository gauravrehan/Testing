package com.home.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(value=Suite.class)
@SuiteClasses(value={CalculatorTest.class, ParameterizedCalcTest.class})
public class AllTests {

}
