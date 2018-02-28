/*

	Chapter 4
	Programming Exercices 1: Roman Numerals
	Programmer:		P. Griffin
	Date:			9/14/2017
	Filename:		RomanNumeralsPJG.java
	Purpose:		This program is used to print to the user an integer between 1 and 10 to its roman numeral

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class RomanNumeralsPJG
{

	public static void main(String[] args)
	{

		//declares my variables to pass to each module/function
		String romanNum;

		//next few module/functions will inform user, get their input and display the roman numeral
		showDetails();
		romanNum = getNumber();
		showNumeral(romanNum);


	}

	//this module is used to inform the user of the program
	public static void showDetails()
	{

		System.out.println("User must input a number between 1 - 10");
		System.out.println("The system will print corresponding roman numeral.");

	}

	//this module gets input from the user, checks if it is valid, and returns the proper roman numeral
	public static String getNumber()
	{

		//declare variables to hold input, return string, and a boolean for a while loop
		int inputNum = 0;
		String numeral = "";
		boolean integer = false;

		//constructs a Scanner object to allow for input
		Scanner input = new Scanner(System.in);

		//while integer is not true it will loop through and ask user for valid input
		while (!integer)
		{

			System.out.print("Enter a number between 1 - 10: ");

				//checks the user input for any errors
				try
				{
					//gets user input and sets integer to true; ending while loop
					inputNum = input.nextInt();

					integer = true;
				}
				catch(InputMismatchException exception)
				{

				  integer = false;
				  input.next(); //clears input in try/catch

				}

			//using valid 'inputNum' switch assigns 'numeral' with correct roman numeral
			switch (inputNum)
			{

				case 1:
					numeral = "I";
					break;

				case 2:
					numeral = "II";
					break;

				case 3:
					numeral = "III";
					break;

				case 4:
					numeral = "IV";
					break;

				case 5:
					numeral = "V";
					break;

				case 6:
					numeral = "VI";
					break;

				case 7:
					numeral = "VII";
					break;

				case 8:
					numeral = "VIII";
					break;

				case 9:
					numeral = "IX";
					break;

				case 10:
					numeral = "X";
					break;

				//default is printed if 1-10 is not input
				default:
					System.out.println("That is not a valid input. Try again.");
					integer = false;

			}

		}


		//returns 'numeral' to main module
		return numeral;

	}

	//this function prints the roman numeral to the user using the input from the last module
	public static void showNumeral(String romanChar)
	{

			System.out.println("The roman numeral is " + romanChar + ".");

	}

}