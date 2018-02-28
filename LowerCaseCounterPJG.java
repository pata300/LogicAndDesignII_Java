/*

	Chapter 12
	Algorithm Workbench 2
	Programmer:		P. Griffin
	Date:			11/14/2017
	Filename:		LowerCaseCounterPJG.java
	Purpose:		This program will count the amount of lower case characters in the string variable.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class LowerCaseCounterPJG
{

	public static void main(String[] args)
	{

		//declare string
		String str = "CamelCase is the Best Ever";

		//declare integer for count
		int lowerCaseCount = 0;

		//assign return value from function
		lowerCaseCount = getCount(str);

		//print amount of lower case char to user
		System.out.println("The number of lower case characters in '" + str + "' is " + lowerCaseCount + ".");

	}

	//gets the count from the string
	public static int getCount(String countStr)
	{

		//declare variable for count and loop
		int count = 0;
		int index;

		//loops through the string
		for (index = 0; index <= countStr.length() - 1; index++)
		{

			//if the character is lower case
			if (Character.isLowerCase(countStr.charAt(index)))
			{

				//increment count
				count++;

			}

		}

		//return count to main()
		return count;

	}

}