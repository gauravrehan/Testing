package com.home.testing;

public class Calculator {

	public double add(double number1, double number2) {
		if(number1 < 0 || number2 < 0)
			throw new IllegalArgumentException("Passed argument cannot be less than 0.");
		return number1 + number2;
	}
}
