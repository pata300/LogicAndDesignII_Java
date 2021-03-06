/*

	Chapter 11
	Algorithm Workbench 3
	Programmer:		P. Griffin
	Date:			11/8/2017
	Filename:		ModuleSelectionPJG.java
	Purpose:		This program displays a simple menu and allows the user to select from the menu using a case structure
					and will loop until the user decides to exit.

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class LoopSelectionPJG
{

	public static void main(String[] args)
	{

		//variable for input
		int selection;

		//will display menu while user does not chooses to close the program
		do
		{

			//displays menu each loop
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

			//validates user's input
			while(selection < 1 || selection > 4)
			{

				System.out.println("Invalid selection.");
				System.out.println("Please input 1, 2, 3, or 4.");
				System.out.print("Enter your selection: ");

				selection = input.nextInt();

			}

			//checks users selection in case structure
			switch (selection)
			{

				case 1:
					openDocument();
					break;

				case 2:
					closeDocument();
					break;

				case 3:
					printDocument();
					break;

				default:
					System.out.println("The program will now exit.");
					break;

			}

		} while (selection != 4);

	}

	//each module prints their selection
	public static void openDocument()
	{

		System.out.println("You have opened a new document.");
		System.out.println();

	}

	public static void closeDocument()
	{

		System.out.println("You have closed the document.");
		System.out.println();

	}

	public static void printDocument()
	{

		System.out.println("You have printed the document.");
		System.out.println();

	}

}