package com.qa.exercises;

public class Day_1_exercise {
	public static void main(String[] args) {
// First exercise 
		int a = 2;
		int a2 = 3;
		float f = 3.14f;
		float f2 = 6.12f;
		double d = 2.13;
		double d2 = 1.23;
		short s = 5;
		short s2 = 8;
		char c = 'A';
		char c2 = 'B';
		boolean bool = true;
		boolean bool2 = false;
		byte b = 7;
		byte b2 = 4;
		long l = 82340932892L;
		long l2 = 82340932792L;
		
		System.out.println(a);
		System.out.println(a2);
		System.out.println(b);
		System.out.println(b2);
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		System.out.println(d2);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(c);
		System.out.println(c2);
		System.out.println(bool);
		System.out.println(bool2);
		System.out.println(l);
		System.out.println(l2);
		
		
// Underneath starts second exercise
		
	int x = 40;
	int y = 50;
	
	int sum = x + y;
	int product = x * y;
	System.out.println("Output: 40 + 50 = " + sum);		
	System.out.println("Output: 40 x 50 = " + product);		
	
// Third exercise
// using modulo to divide the number in half leaves us with a remainder of 1 or 0.
	int e = 32 % 2; // If the remainder of the number is 0 then the number is even 
	int o = 7 % 2; // If the remainder of the number is 1 it's an odd
  
 // fourth exercise
	Fraction myFraction = new Fraction();
	Fraction myFraction2 = new Fraction();
	
	System.out.println(myFraction.numerator);
	System.out.println(myFraction2.denominator);
	
	myFraction.denominator = 4;
	myFraction.numerator = 2;
	
	System.out.println(myFraction.numerator);
	System.out.println(myFraction.denominator);
	
			
		
	}

}
