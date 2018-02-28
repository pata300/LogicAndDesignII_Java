/*

	Chapter 11
	Algorithm Workbench 4
	Programmer:		P. Griffin
	Date:			11/8/2017
	Filename:		ModuleSelectionPJG.java
	Purpose:		This program displays a simple menu and allows the user to select from the menu using a case structure
					and will loop until the user decides to exit. Now with modules!!

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ModuleSelectionPJG
{

	public static void main(String[] args)
	{

		//varible for return value
		int selection;

		//menu will be printed while selection is not 4
		do
		{

			//return value from displayMenu is assigned to selection
			selection = displayMenu();

			//selection is used in case structure
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

	//prints the menu and gets the user's input; returns the value to main()
	public static int displayMenu()
	{

		//variable for input
		int choice;

		//prints menu
		System.out.println("     Main Menu");
		System.out.println("1. Open a new document.");
		System.out.println("2. Close the current document.");
		System.out.println("3. Print the current document.");
		System.out.println("4. Exit the program.");
		System.out.println();
		System.out.print("Enter your selection: ");

		Scanner input = new Scanner(System.in);

		//gets input
		choice = input.nextInt();

		//validates input
		while(choice < 1 || choice > 4)
		{

			System.out.println("Invalid selection.");
			System.out.println("Please input 1, 2, 3, or 4.");
			System.out.print("Enter your selection: ");

			choice = input.nextInt();

		}

		//returns value
		return choice;

	}

	//each module prints user's selection
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