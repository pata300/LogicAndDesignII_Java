/*

	Chapter 3
	Programming Exercices 1: Kilometer Converter
	Programmer:		P. Griffin
	Date:			8/25/2017
	Filename:		kiloConverterPJG.java
	Purpose:		This program is used to convert kilometers input by user to miles and print results to user

*/

import java.util.Scanner;

public class kiloConverterPJG
{

	public static void main(String[] args)
	{

		//Declare variable for miles
		double miles;

		//module used to inform user of how program works
		showMessage();
		//module gets kilometers from user, converts to miles, and assigns output to miles
		miles = getKilo();
		//module is passed miles variable and prints to user
		showMiles(miles);

	}

	//module is type void, does not return a value
	public static void showMessage()
	{

		//informs user of what program does
		System.out.println("This is a program that converts kilometers to miles.");

	}

	//module is type double, returns converted kilometers
	public static double getKilo()
	{

		//declare variables to hold input and output
		double kilo;
		double totalMiles;

		//constructs a Scanner object to allow for input
		Scanner input = new Scanner(System.in);

		//ask user for input, kilometers
		System.out.print("Enter kilometers: ");
		kilo = input.nextDouble();

		//calculates kilometers to miles
		totalMiles = kilo * 0.6214;

		//returns output to main
		return totalMiles;

	}

	//module is type void, returns nothing, passed miles
	public static void showMiles(double totalMiles)
	{

		//prints converted variable to user
		System.out.printf("That is %.4f miles.", totalMiles);
		System.out.println("");

	}

}