/*

	Chapter 12
	Algorithm Workbench 3
	Programmer:		P. Griffin
	Date:			11/14/2017
	Filename:		UpperCaseCounterPJG.java
	Purpose:		This program will count the amount of upper case characters in the string variable.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class UpperCaseCounterPJG
{

	public static void main(String[] args)
	{

		//string variable
		String str = "CapsLock means you are YELLING!!";

		//integer to hold count
		int upperCaseCount = 0;

		//assign return value to 'upperCaseCount'
		upperCaseCount = getCount(str);

		//print count to user
		System.out.println("The number of upper case characters in '" + str + "' is " + upperCaseCount + ".");

	}

	//function counts the amount of upper case characters
	public static int getCount(String countStr)
	{

		//variables for count and loop
		int count = 0;
		int index;

		//loops through the string
		for (index = 0; index <= countStr.length() - 1; index++)
		{

			//if character is an upper case character
			if (Character.isUpperCase(countStr.charAt(index)))
			{

				//increment count
				count++;

			}

		}

		//return count to main()
		return count;

	}

}