/*

	Chapter 5
	Programming Exercices 6: Distance Traveled
	Programmer:		P. Griffin
	Date:			9/21/2017
	Filename:		DistanceTraveledPJG.java
	Purpose:		This program is used to chart out the distnace a vehicle will travel over time

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class DistanceTraveledPJG
{

	public static void main(String[] args)
	{

		//doubles to pass the speed and travel time to showDistance()
		double travelSpeed, travelTime;

		//simply displays instructions to user
		showDetails();

		//here call functions to get the speed and time
		travelSpeed = getSpeed();
		travelTime = getTime();

		//user input is then passed to showDistance()
		showDistance(travelSpeed, travelTime);

	}

	//informs user
	public static void showDetails()
	{

		System.out.println("User will input the speed in MPH and the");
		System.out.println("time that a vehicle has traveled.");
		System.out.println("The program will then display a chart of how");
		System.out.println("much distance the vehicle has covered.");
		System.out.println("");

	}

	//ask user for the speed in miles per hour
	public static double getSpeed()
	{

		//double for the speed traveled, initiated to 0
		double speed = 0;

		//boolean for while loop
		boolean dblInput = false;

		//construct scanner object for input
		Scanner input = new Scanner(System.in);

		//while the input is not in double format the loop continues
		while (!dblInput)
		{

			//ask user for the speed in miles per hour
			System.out.print("What is the speed of the vehicle in MPH? ");

			//try/catch statement to check for errors
			try
			{

				speed = input.nextDouble();

				dblInput = true;

			}
			catch(InputMismatchException exception)
			{

				dblInput = false;
				input.next();

			}

		}

		//return speed to main()
		return speed;

	}

	//ask user for the time that has been traveled in hours
	public static double getTime()
		{

			//declare double for hours, initiated to 0
			double time = 0;

			//declare boolean for while loop
			boolean dblInput = false;

			//construct scanner for input
			Scanner input = new Scanner(System.in);

			//while input is not a double loop will continue
			while (!dblInput)
			{

				//ask user for hours traveled
				System.out.print("How many hours has it traveled? ");

				//try/catch statement that checks for errors
				try
				{

					time = input.nextDouble();

					dblInput = true;

				}
				catch(InputMismatchException exception)
				{

					dblInput = false;
					input.next();

				}

			}

			//returns time to main()
			return time;

	}

	//displays a chart for the user showing the distance traveled over the amount of hours
	public static void showDistance(double mph, double hours)
	{

		//organized header for the chart
		System.out.println("");
		System.out.println("Hours			Distance Traveled");
		System.out.println("---------------------------------");

		//for loop loops thru each hour, display the distanced covered each hour
		for (int x = 1; x <= hours; x++)
		{

			System.out.println(x + "			" + x * mph);

		}

	}
}