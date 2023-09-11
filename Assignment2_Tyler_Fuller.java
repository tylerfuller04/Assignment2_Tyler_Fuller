/*
 * Assignment2_Tyler_Fuller,java
 * Tyler Fuller
 * 01261802
 * 09/11/2023
 */

import java.util.Scanner; // Get Scanner for user input

public class Assignment2_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Declare variables
		double amountOfWater, initialTemp, finalTemp, energyNeeded;
		
		// Prompt user to input amount of water in kg, initial temp and final temp in degrees C
		System.out.print("Enter the amount of water in kilograms: ");
		Scanner input = new Scanner(System.in);
		amountOfWater = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		initialTemp = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		finalTemp = input.nextDouble();
		input.close();
		
		// Calculate the energy needed to heat the water
		energyNeeded = amountOfWater * (finalTemp - initialTemp) * 4184;
		
		// Print the result to the console
		System.out.print("Energy needed is " + energyNeeded + " joules");

	}

}
