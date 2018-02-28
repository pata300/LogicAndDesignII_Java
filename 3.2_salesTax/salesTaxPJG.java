/*

	Chapter 3
	Programming Exercices 2: Sales Tax Program Refactoring
	Programmer:		P. Griffin
	Date:			8/25/2017
	Filename:		salesTaxPJG.java
	Purpose:		This program is used to show the taxes and total of a purchase

*/

import java.util.Scanner;

public class salesTaxPJG
{

	public static void main(String[] args)
	{

		double purchase;

		//constructs a Scanner object to allow for input
		Scanner input = new Scanner(System.in);

		//module used to inform user of how program works
		showMessage();

		System.out.print("What is the cost of your purchase? $");
		purchase = input.nextDouble();

		showTax(purchase);

	}

	//module is type void, does not return a value
	public static void showMessage()
	{

		//informs user of what program does
		System.out.println("This is a program that computes the different taxes and the total of a purchase.");

	}

	//module takes the purchase cost and prints the taxes and total to the user
	public static void showTax(double purchase)
	{

		//variables for tax and total calculations
		double stateTax;
		double countyTax;
		double totalTax;
		double purchaseTotal;

		//calculations of all taxes and totals
		stateTax = purchase * 0.02;
		countyTax = purchase * 0.04;
		totalTax = stateTax + countyTax;
		purchaseTotal = purchase + totalTax;

		//print taxes and totals to user
		System.out.printf("The item you purchased cost $%.2f", purchase);
		System.out.println("");
		System.out.printf("The state tax is $%.2f", stateTax);
		System.out.println("");
		System.out.printf("The county tax is $%.2f", countyTax);
		System.out.println("");
		System.out.printf("The total tax is $%.2f", totalTax);
		System.out.println("");
		System.out.printf("The total of your purchase is $%.2f", purchaseTotal);
		System.out.println("");

	}

}