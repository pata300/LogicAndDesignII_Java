/*

	Chapter 4
	Programming Exercices 2: Areas of Rectangles
	Programmer:		P. Griffin
	Date:			9/14/2017
	Filename:		RectangleAreasPJG.java
	Purpose:		This program is used to compare the area of 2 rectangles

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class RectangleAreasPJG
{

	public static void main(String[] args)
	{

		//declares my variables for input and output
		double rec1, rec2;

		//following module/functions inform the user how the program works, ask for the length and width of a rectangle twice, and compares the area of the two
		showDetails();
		System.out.println("First we get rectangle 1's length and width.");
		rec1 = recArea();
		System.out.println("The area of rectangle 1 is " + rec1);
		System.out.println("Now we get rectangle 2's length and width.");
		rec2 = recArea();
		System.out.println("The area of rectangle 2 is " + rec2);
		compareArea(rec1, rec2);

	}

	//this module informs the user
	public static void showDetails()
	{

		System.out.println("You will be asked to enter the length and width");
		System.out.println("of two separate rectangles.");
		System.out.println("Afterwards, the program determines which is greater.");
		System.out.println("");

	}

	//this function ask the user for the width and length of a rectangle and returns the area as a double
	public static double recArea()
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

		//multiplies the legth by the width to get the area
		area = length * width;
		//returns the area to main()
		return area;

	}

	//this function takes the area of two seperate rectangles (in this case) and informs the user which is greater
	public static void compareArea(double area1, double area2)
	{

		//simple nested if/else statement
		if (area1 > area2) { //rect 1 area is greater

			System.out.println("Rectangle 1 has a greater area than 2.");

			} else if (area1 < area2) { //rect 2 area is greater

				System.out.println("Rectangle 2 has a greater area than 1.");

				} else { //if the area of rect 1 is not greater than 2 and the same vice versa then they must be the same

						System.out.println("The area of the two rectangles are the same!");

					}
	}

}