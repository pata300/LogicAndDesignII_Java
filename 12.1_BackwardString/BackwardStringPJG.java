/*

	Chapter 12
	Programming Exercises 1: Backward String
	Programmer:		P. Griffin
	Date:			11/16/2017
	Filename:		BackwardStringPJG.java
	Purpose:		This program will ask the user for a string and display it backwards

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class BackwardStringPJG
{

	public static void main(String[] args)
	{

		//declare string variables to hold return values
		String userStr;

		//get string from user; return to userStr
		userStr = getStr();

		//uses return value, reverses it, prints to user
		backwardStr(userStr);


	}

	//function get a string from the user and returns to main()
	public static String getStr()
	{

		//declare string variable for user input
		String str = "";

		//construct scanner object
		Scanner input = new Scanner(System.in);

		//ask user for input
		System.out.println("Please input a new string.");

		//user input
		str = input.nextLine();

		//return the strin to main()
		return str;

	}

	//module will reverse the string and print it to the user
	public static void backwardStr(String inputStr)
	{

		//variable for loop
		int index;

		//loop through the string and print it out backward
		for(index = inputStr.length() - 1; index >= 0; index--)
		{

			//prints each character one at a time
			//looping from the end of the string to the beginning
			System.out.print(inputStr.charAt(index));

		}

		//prints empty line
		System.out.println();

	}

}