/*

	Chapter 5
	Programming Exercices 1: Bug Collector
	Programmer:		P. Griffin
	Date:			9/21/2017
	Filename:		BugCollectorPJG.java
	Purpose:		This program is used to tally up a users bug collection after 7 days of collecting

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class BugCollectorPJG
{

	public static void main(String[] args)
	{

		//declare an integer to assign to our bug collection
		int bugCollection;

		//simply informs the user
		showDetails();

		//call getBugs() to ask the user for the bugs they collected during the week
		//we then assign the total sum to 'bugCollection'
		bugCollection = getBugs();

		//pass bug total sum to showBugs()
		//this module displays the total to the user
		showBugs(bugCollection);

	}

	//instructions for user
	public static void showDetails()
	{

		System.out.println("You will be collecting bugs for the next 7 days!");
		System.out.println("After each day you will input the number of bugs collected.");

	}

	//using a for loop we ask the user for the amount of bugs collectet each day for a week
	public static int getBugs()
	{

		//declare integers for bugs collected daily and the total at the end of the week
		int bugs = 0;
		int totalBugs = 0;

		//boolean for our try and catch
		boolean intInput = false;

		//construct a scanner object for input
		Scanner input = new Scanner(System.in);

		//for loop will loop until x is greater than 7, incrementing by 1 each loop
		for (int x = 1; x <= 7; x++)
		{

			//while input is not a integer this loop will proceed
			while (!intInput)
			{

				//ask user for the amount of bugs they collected
				System.out.print("How many bugs were collected on day " + x + "? ");

				try
				{
					bugs = input.nextInt();

					intInput = true;
				}
				catch(InputMismatchException exception)
				{

					intInput = false;
					input.next();

				}

			}

			//bugs are totaled here
			totalBugs = bugs + totalBugs;

			intInput = false;

		}

		//return the total back to main()
		return totalBugs;

	}

	//passing the total sum of bugs collected, we then display it to the user in this module
	public static void showBugs(int bugCount)
	{

		//display how many total bugs were collected over the week
		System.out.println("In 7 days you collected " + bugCount + " bugs!");

	}

}