/*

	Chapter2
	Programming Exercices 7: Miles-Per-Gallon
	Programmer:		P. Griffin
	Date:			8/23/2017
	Filename:		MilesPerGallonPJG.java
	Purpose:		This program is used to help users calculate their vehicle's MPG average

*/

import java.util.Scanner;

public class MilesPerGallonPJG 
{

	public static void main(String[] args)
	{

		//declares my variables for input and output
		double miles, gas, milesPerGallon;

		//constructs a Scanner object to allow for input
		Scanner input = new Scanner(System.in);

		//ask the user to input miles which is assigned to "miles" variable
		System.out.println("Enter the miles you have driven.");
		miles = input.nextDouble();

		//ask user to input gas which is assigned to "gas" variable
		System.out.println("Enter the gallons of gas used.");
		gas = input.nextDouble();

		//miles is then divided by gas and assigned to 'milesPerGallon'
		milesPerGallon = miles / gas;

		//milesPerGallon is then printed to user
		System.out.println("Your vehicle's MPG is " + milesPerGallon);

	}

}