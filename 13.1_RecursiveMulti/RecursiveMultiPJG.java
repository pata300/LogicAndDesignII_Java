/*

	Chapter 13
	Programming Exercise 1: Recursive Multiplication
	Programmer:		P. Griffin
	Date:			11/24/2017
	Filename:		RecursiveMultiPJG.java
	Purpose:		This program multiplies 2 int with the use of a recursive function.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class RecursiveMultiPJG
{

	public static void main(String[] args)
	{

		//declare integers for input and return values
		int num1 = 0, num2 = 0, sum;

		//boolean for while loop
		boolean intInput = false;

		//inform user on how program works
		System.out.println("This program is designed to multiply any");
		System.out.println("2 nonzero-positive whole numbers.");
		System.out.println();

		//Scanner object for input
		Scanner input = new Scanner(System.in);

		//loop for mismatch exceptions
		while(!intInput)
		{

			//ask for first input
			System.out.print("Input the number you would like to multiply: ");
			System.out.println();

			try
			{

				//get user input
				num1 = input.nextInt();

				//correct input
				intInput = true;

			} catch(InputMismatchException ex) {

				//informs user of error; tries again
				intInput = false;
				input.next();
				System.out.println("INVALID. TRY AGAIN.");

			}

		}

		//reset the loop boolean for another input mismatch check
		intInput = false;

		while(!intInput)
		{

			//ask for second input
			System.out.print("Input how much you would like to multiply it by: ");
			System.out.println();

			try
			{

				//get user input
				num2 = input.nextInt();

				//correct input
				intInput = true;

			} catch(InputMismatchException ex) {

				//informs user of error; tries again
				intInput = false;
				input.next();
				System.out.println("INVALID. TRY AGAIN.");

			}

		}

		//call the multiply() which will use recursion to multiply the number
		sum = multiply(num1, num2);

		//display the total
		System.out.println("The result is " + sum + ".");

	}

	//this function is used to multiply two positive-nonzero integers using recursion
	public static int multiply(int x, int y)
	{

		//declare an int for the return value
		int result = 0;

		//this loop is used for the recursion process
		//if y is less than zero
		if (y > 0)
		{

			//use recursion to multiply x
			//each recursion the y value is decremented
			//which will eventually end the loop
			result = multiply(x, y - 1);

			//result increments by the value of x each recursion
			result = result + x;

		}

		return result;
	}

}