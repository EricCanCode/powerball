/*
* File: MyPowerBall.java
* Author: Eric Haynes
* Date: February 2, 2020
* Purpose: This program demonstrates the use of Java's
* Random class
*/
// Import statements
import java.util.Random;
import java.util.Scanner;

public class MyPowerBall {
    public static void main(String[] args) {
	int maxLoop = 0;

	// Display a Welcome note
 	System.out.println("Welcome to the Powerball Lotto 6 Number Picker");

	// Use the Scanner class to read System.in
        Scanner scannerIn = new Scanner(System.in);
	
	// Prompt user for number of tickets to make numbers for
	System.out.println("How many tickets to generate");
	maxLoop = scannerIn.nextInt();

	// Variables to hold values
	boolean feelLucky = false;	

	// Construct a Random class instance
 	Random randomGen = new Random();

	// While Loop
	int cnt=0;
	int randInt = 0;
	while (cnt < maxLoop) {

	// Generate a random Int
	// but limit it between 1 and 69
	randInt = randomGen.nextInt(70);
	System.out.println("Number 1: " + randInt);

	// Generate a random Int
	// but limit it between 0 and 69
	randInt = randomGen.nextInt(70);
	System.out.println("Number 2: " + randInt);

	// Generate a random Int
	// but limit it between 0 and 69
	randInt = randomGen.nextInt(70);
	System.out.println("Number 3: " + randInt);

	// Generate a random Int
	// but limit it between 0 and 69
	randInt = randomGen.nextInt(70);
	System.out.println("Number 4: " + randInt);

	// Generate a random Int
	// but limit it between 0 and 69
	randInt = randomGen.nextInt(70);
	 System.out.println("Number 5: " + randInt);

	// Generate a random Int
	// but limit it between 0 and 26
	randInt = randomGen.nextInt(27);
	System.out.println("Powerball: " + randInt);
	
	// Increment counter
	cnt++;
	}

	//

	// Prompt user to enter answer 
	System.out.println("Do these feel like lucky numbers? (True or False):");
	// the nextBoolean() method scans the next boolean value
        feelLucky = scannerIn.nextBoolean();

	// Logic to print feel lucky status
	//if (!feelLucky) { // Place holder for logic error
	if (feelLucky) {
	  System.out.println("Good luck, send me a Million if you win :P");	
	}
	else {
	  System.out.println("Let's Start Again.");	
	}

 }
}