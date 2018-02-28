/*

	Chapter 6
	Programming Exercices 2: Feet to Inches
	Programmer:		P. Griffin
	Date:			9/29/2017
	Filename:		FeetConverterPJG.java
	Purpose:		This program is used to convert feet to inches.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class FeetConverterPJG
{

	public static void main(String[] args)
	{

		//integers to hold the return values
		int userFeet, inches;

		//call getFeet to get the amount of feet to be converted; assigned to userFeet
		userFeet = getFeet();

		//call feetToInches using userFeet as an argument to convert to inches; assigned to inches
		inches = feetToInches(userFeet);

		//prints the conversion to the user
		System.out.println(userFeet + " feet is " + inches + " inches.");

	}

	//this function is used to ask the user for input amount of feet
	public static int getFeet()
	{

		//variable to hold input
		int feet = 0;

		//boolean for the while loop
		boolean intInput = false;

		//constructs a Scanner object to allow for input
		Scanner input = new Scanner(System.in);

		//while the input is NOT a double/number
		while (!intInput)
				{

					System.out.println("Please enter the amount of feet you");
					System.out.println("would like to convert to inches.");

						//gets feet input from user and checks for error
						try
						{

							feet = input.nextInt();
							System.out.println("");

							intInput = true;
						}
						catch(InputMismatchException exception)
						{

						  intInput = false;
						  input.next(); //clears input in try/catch
					  	}

				}

		//returns input to main()
		return feet;

	}

	//this function computes the conversion of feet to inches
	public static int feetToInches(int inputFeet)
	{

		return inputFeet * 12;

	}

}