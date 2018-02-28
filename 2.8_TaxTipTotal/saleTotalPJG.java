/*

	Chapter2
	Programming Exercices 8: Tax, Tip, and Total
	Programmer:		P. Griffin
	Date:			8/23/2017
	Filename:		saleTotalPJG.java
	Purpose:		This program is used to inform customer of the amount of tax and tip they are being charged
					and what the total of their order is

*/

import java.util.Scanner;

public class saleTotalPJG
{

	public static void main(String[] args)
	{

		//declares my variables for input and output
		double foodCharge;
		double tip;
		double tax;
		double total;

		//constructs a Scanner object to allow for input
		Scanner input = new Scanner(System.in);

		//ask the user to input how much they were charged which is assigned to 'foodCharge'
		System.out.print("Enter the charge for your food: $");
		foodCharge = input.nextDouble();

		//calculate the amount charged for tip and tax and assign accordingly
		tip = foodCharge * 0.15;
		tax = foodCharge * 0.07;

		//print out newly calculated variables to user
		System.out.printf("The tip charge is $%.2f and the tax is $%.2f.", tip, tax);
		System.out.println("");

		//calculate the total amount for the order
		total = foodCharge + tip + tax;

		//total is then printed to user
		System.out.printf("Your total is: $%.2f", total);
		System.out.println("");

	}

}