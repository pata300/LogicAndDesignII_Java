/*

	Chapter 6
	Programming Exercices 1: Rectangle Area
	Programmer:		P. Griffin
	Date:			9/29/2017
	Filename:		RectangleAreaPJG.java
	Purpose:		This program is used compute the area of a rectangle

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class RectangleAreaPJG
{

	public static void main(String[] args)
	{

		//declares my variables for input and output
		double rect1;

		//following module/functions inform the user how the program works, ask for the length and width of a rectangle, and prints the area to the user
		showDetails();
		System.out.println("Now input the rectangle's length and width.");
		rect1 = getRect();
		System.out.println("The area of the rectangle is " + rect1);

	}

	//this module informs the user
	public static void showDetails()
	{

		System.out.println("You will be asked to enter the");
		System.out.println("length and width of a rectangle.");
		System.out.println("Afterwards, the program will compute");
		System.out.println("the area and display.");
		System.out.println("");

	}

	//this function ask the user for the width and length of a rectangle and returns the area as a double
	public static double getRect()
	{

		//declare variables to hold length, width, and area all initiated w/ 0
		double length =0, width = 0, area = 0;
		//boolean for the while loop
		boolean dblInput = false;

		//constructs a Scanner object to allow for input
		Scanner input = new Scanner(System.in);

		//while the input is NOT a double/number
		while (!dblInput)
				{

					System.out.print("What is the length of the rectangle: ");

						//gets length input from user and checks for error
						try
						{

							length = input.nextDouble();
							System.out.println("");

							dblInput = true;
						}
						catch(InputMismatchException exception)
						{

						  dblInput = false;
						  input.next(); //clears input in try/catch
					  	}

				}

		//resets loop variable
		dblInput = false;

		//same deal as first loop but now asking user for width input
		while (!dblInput)
				{

						System.out.print("What is the width of the rectangle: ");

							try
							{

								width = input.nextDouble();
								System.out.println("");

								dblInput = true;
							}
							catch(InputMismatchException exception)
							{

							  dblInput = false;
							  input.next(); //clears input in try/catch
						  	}

				}

		//call rectArea using the length and width inputs to get the area
		area = rectArea(length, width);

		//return the area variable
		return area;

	}

	public static double rectArea(double rectLength, double rectWidth)
	{

		//returns the length times the width; which is the area
		return rectLength * rectWidth;

	}

}