/*

	Chapter 8
	Programming Exercices 1: Total Sales
	Programmer:		P. Griffin
	Date:			10/21/2017
	Filename:		TotalSalesPJG.java
	Purpose:		This program uses arrays to ask the user for the sales during a week.
					Then computes the total of all the days for the user.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class TotalSalesPJG
{

	public static void main(String[] args)
	{

		//declare constant for array
		final int DAYS = 7;
		//construct array using DAYS
		double[] salesWeek = new double[DAYS];
		//used for return value
		double salesTotal;

		//inform user of program
		System.out.println("User will be prompt to enter the store's sales");
		System.out.println("for each day of the week. The program will then");
		System.out.println("calculate the total of the week's sales");
		System.out.println("and print to the user.");
		System.out.println("");

		//call getSales using the array and constant to populate the array
		getSales(DAYS, salesWeek);

		//call getTotal() to find the sum of th week's sales
		salesTotal = getTotal(DAYS, salesWeek);

		//display the total to the user
		System.out.printf("The total sales for the week is: $%.2f", salesTotal);
		System.out.println("");

	}

	//getSales() ask the user to for the sales of the week
	public static void getSales(final int WEEK, double[] salesDay)
	{

		//declare variables to use in loops
		int index;
		boolean dblInput;

		//construct Scanner object for input
		Scanner input = new Scanner(System.in);

		//loops through salesWeek[] constructed in main()
		for(index = 0; index <= WEEK -1; index++)
		{

			//sets 'dblInput' to false
			dblInput = false;

			//while the input is NOT a double the user will receive an error message
			while (!dblInput)
			{

				//ask the user for the corresponding day's sales
				System.out.print("The sales for day " + (index + 1) + " is: ");

				try
				{

					//sets user's input to index in array
					salesDay[index] = input.nextDouble();
					System.out.println("");

					//set dblInput to true; loop ends
					dblInput = true;

				}

				catch(InputMismatchException exception)
				{

					//informs user of error; tries again
					dblInput = false;
					input.next();
					System.out.println("INVALID. TRY AGAIN.");

				}

			}

		}

	}

	//using the newly populated array getTotal() now adds all the values into a total and returns to main
	public static double getTotal(final int WORKWEEK, double[] dayTotal)
	{

		//variable to use in for loop
		int index;
		double totalSales = 0;


		//loops through the array and add's each slot into a total
		for(index = 0; index <= WORKWEEK -1; index++)
		{

			totalSales = totalSales + dayTotal[index];

		}

		//returns the total to main()
		return totalSales;

	}

}