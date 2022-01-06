package com.qa.exercises;

public class Results {
	
	//fields have a class scope
	// - they can be accessed anywhere inside this class

	int physics;
	int chemistry;
	int biology;

	int total;
	int percentage;
	
	// made for exercise 2 results, making ints here for clarity
	int physPercent;
	int chemPercent;
	int bioPercent; 
	
	// \t is a tab symbol
	// \n is a new line symbol
	// the '\' is an escape character

	public void displayResults() {
		total = physics + chemistry + biology;
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);

		System.out.println("Exam score: " + total + "/450");

	}

	public void percentageResults() {
		displayResults();
		// all needed calcs are done below
		percentage = total * 100 / 450;
		physPercent = physics * 100 / 150;
		chemPercent = chemistry * 100 / 150;
		bioPercent = biology * 100 / 150;
		// begin elif statements here
		// - below works for task 1
		if (percentage > 60) {
			System.out.println("Percentage: " + percentage + "%");
			passMessage();
		} else {
			System.out.println("Percentage: " + percentage + "%");
			failMessage();
			}
		// trying to get this to go through the percent scores and print a message
		if (physPercent < 60 || bioPercent < 60 || chemPercent < 60) {
			failMessage();
		} else {
			System.out.println("Unfortunately, you passed");
		}
		// now to get it to print message depending on what you passed/failed - I hate this, it's very bad code
		
		if (physPercent < 60) {
			System.out.println("You failed Physics");
		}
		
		if (chemPercent < 60) {
			System.out.println("You failed Chemistry");
		}
		
		if (bioPercent < 60) {
			System.out.println("You failed Biology");
		}
	
	}
	
	
	
		
	

	
	
	
	
	
	
	
	
	
	
	// Can be called to display pass message without need of repetition
	public void passMessage() {
		System.out.println("You have passed!");
	}
	
	// Same below but for fail
	public void failMessage() {
		System.out.println("You have failed!");
	}
	
}



