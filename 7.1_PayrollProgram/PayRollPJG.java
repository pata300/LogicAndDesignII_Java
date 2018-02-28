/*

	Chapter 7
	Programming Exercices 1: Payroll Program with Input Validation
	Programmer:		P. Griffin
	Date:			10/6/2017
	Filename:		PayRollPJG.java
	Purpose:		This program validates the input of the employee's pay rate and hours worked, then calculates the gross pay.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class PayRollPJG
{

	public static void main(String[] args)
	{

		//declare variabled to hold the return value
		double employeePay;

		//informs the user of limitations and rules
		System.out.println("User will be prompt to enter an employee's");
		System.out.println("hourly pay rate and the number of hours worked.");
		System.out.println("Pay rate MUST be between $7.50 and $18.25.");
		System.out.println("Hours worked MUST be between 0 and 40.");
		System.out.println("");

		//calls PayRoll function and assigns return to 'employeePay'
		employeePay = payRoll();

		//prints formatted version of employee's gross pay
		System.out.printf("The employee's gross pay is: $%.2f", employeePay);
		System.out.println("");

	}

	//this function ask the user for pay rate and hours worked and returns a gross pay total
	public static double payRoll()
	{

		//two doubles to hold the pay rate and hours worked variables
		double payRate = 0, hoursWorked = 0;

		//boolean for try/catch while loop
		boolean dblInput = false;

		//construct a scanner object to listen for the keyboard
		Scanner input = new Scanner(System.in);

		//first try/catch (mismatch exception) loop
		while (!dblInput)
		{
			System.out.print("What is the employee's hourly pay rate? $");

			//gets input from user and checks for error
			try
			{

				payRate = input.nextDouble();
				System.out.println("");

				dblInput = true;

			}
			catch(InputMismatchException exception)
			{

			  dblInput = false;
			  input.next(); //clears input in try/catch
			  System.out.println("INVALID. TRY AGAIN.");

		  	}

		}

		//if data isn't a mismatch, we now check for validation
		//while the data isn't between the standards given it will ask for a new variables and check for mismatch
		while (payRate < 7.50 || payRate > 18.25)
		{

			System.out.println("ERROR: The value must be between $7.50 and $18.25");

			//reset boolean
			dblInput = false;

			while (!dblInput)
			{
				System.out.print("What is the employee's hourly pay rate? $");

				//gets feet input from user and checks for error
				try
				{

					payRate = input.nextDouble();
					System.out.println("");

					dblInput = true;

				}
				catch(InputMismatchException exception)
				{

				  dblInput = false;
				  input.next(); //clears input in try/catch
				  System.out.println("INVALID. TRY AGAIN.");

			  	}

			}

		}

		//reset while loop boolean once more
		dblInput = false;

		//same test as above but now asking for employee hours worked
		while (!dblInput)
		{
			System.out.print("How many hours did the employee work? ");

			//gets input from user and checks for error
			try
			{

				hoursWorked = input.nextDouble();
				System.out.println("");

				dblInput = true;

			}
			catch(InputMismatchException exception)
			{

			  dblInput = false;
			  input.next(); //clears input in try/catch
			  System.out.println("INVALID. TRY AGAIN.");

		  	}

		}

		//while hours aren't between standards, ask for new input and check for mismatch
		while (hoursWorked < 0 || hoursWorked > 40)
		{

			System.out.println("ERROR: The value must be between 0 and 40");

			//reset boolean one last time
			dblInput = false;

			while (!dblInput)
			{
				System.out.print("How many hours did the employee work? ");

				//gets feet input from user and checks for error
				try
				{

					hoursWorked = input.nextDouble();
					System.out.println("");

					dblInput = true;

				}
				catch(InputMismatchException exception)
				{

				  dblInput = false;
				  input.next(); //clears input in try/catch
				  System.out.println("INVALID. TRY AGAIN.");

			  	}

			}

		}

		//return the gross pay to main()
		return payRate * hoursWorked;

	}

}