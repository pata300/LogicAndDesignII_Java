/*

	Chapter 12
	Algorithm Workbench 1
	Programmer:		P. Griffin
	Date:			11/14/2017
	Filename:		DigitCounterPJG.java
	Purpose:		This program will count the amount of digits in the string variable.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class DigitCounterPJG
{

	public static void main(String[] args)
	{

		String str = "10v3 2 c0d3";

		int digitCount = 0;

		digitCount = getCount(str);

		System.out.println("The number of digits in '" + str + "' is " + digitCount + ".");

	}

	public static int getCount(String countStr)
	{

		int count = 0;
		int index;

		for (index = 0; index <= countStr.length() - 1; index++)
		{

			if (Character.isDigit(countStr.charAt(index)))
			{

				count++;

			}

		}

		return count;

	}

}