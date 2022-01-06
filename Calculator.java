package com.qa.exercises;

public class Calculator {
	
	public int addition(int a, int b) {
		int result = a + b;
		return result;
			}

	public int multiplication(int a, int b) {
		int result = a * b;
		return result;
	}

	public String division(double a, double b) {
		 double result = 0;
		if (a > b ) {
			result = a / b;
			return String.valueOf(result); 
			} else {
				return "Division can't be performed";
			}
	}
}
	

	
	
	

