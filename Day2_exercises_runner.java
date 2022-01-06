package com.qa.exercises;

public class Day2_exercises_runner {

	public static void main(String[] args) {
		// Calculator is locally scoped to main
		Calculator myCalculator = new Calculator();
		
		Results results = new Results();
//		System.out.println(myCalculator.addition(3, 6));
//		System.out.println(myCalculator.multiplication(2, 10));
//		System.out.println(myCalculator.division(10, 20));
//		
		
		
		results.physics = 100;
		results.biology = 75;
		results.chemistry = 60;
		

		results.percentageResults();
		
//		System.out.println(s);
//		can't access s oiutside of someMethod()
//		int i = 2;
		// i would be stored on the stackframe for main
	}
	// integer division truncates the results
	// - anything after the decimal point is removed

	public static void someMethod() {
		// 's' is scoped to someMethod
		// - it is only accesible inside this method
		// - 's' is said to have a local/method scope
		String s = "hello";
		}
}
