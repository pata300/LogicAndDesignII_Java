/*

	Chapter 11
	Algorithm Workbench 1
	Programmer:		P. Griffin
	Date:			11/8/2017
	Filename:		MenuSelectionPJG.java
	Purpose:		This program displays a simple menu and allows the user to select from the menu.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuSelectionPJG
{

	public static void main(String[] args)
	{

		//variable for input
		int selection;

		//prints menu to user
		System.out.println("     Main Menu");
		System.out.println("1. Open a new document.");
		System.out.println("2. Close the current document.");
		System.out.println("3. Print the current document.");
		System.out.println("4. Exit the program.");
		System.out.println();
		System.out.print("Enter your selection: ");

		Scanner input = new Scanner(System.in);

		//gets input
		selection = input.nextInt();

		//validates input from user
		//while input is outside 1 - 4 it will ask for new input
		while(selection < 1 || selection > 4)
		{

			System.out.println("Invalid selection.");
			System.out.println("Please input 1, 2, 3, or 4.");
			System.out.print("Enter your selection: ");

			selection = input.nextInt();

		}

		//informs user of validation
		System.out.println("You entered a valid selection.");

	}

}