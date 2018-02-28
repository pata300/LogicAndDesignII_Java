/*

	Chapter 11
	Programming Exercise: 1
	Programmer:		P. Griffin
	Date:			11/9/2017
	Filename:		LanguageMenuPJG.java
	Purpose:		This program displays a menu that will print "Good morning" in which ever language you select

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class LanguageMenuPJG
{

	public static void main(String[] args)
	{

		//variable for return value
		int selection;

		//will display menu and ask for input while user does not select to exit program
		do
		{

			//return value from displayMenu() assigned to selection
			selection = displayMenu();

			//selection is use in case structure
			switch (selection)
			{

				case 1:
					speakEnglish();
					break;

				case 2:
					speakItalian();
					break;

				case 3:
					speakSpanish();
					break;

				case 4:
					speakGerman();
					break;

				default:
					System.out.println("The program will now end.");
					break;

			}

		} while (selection != 5);

	}

	//function prints menu to user and ask for input; returns value to main()
	public static int displayMenu()
	{

		//variables for input and loop
		int choice = 0;
		boolean intInput = false;

		//prints menu
		System.out.println("   Select a Language and I Will Say Good Morning");
		System.out.println("1. English");
		System.out.println("2. Italian");
		System.out.println("3. Spanish");
		System.out.println("4. German");
		System.out.println("5. End the program.");
		System.out.println();
		System.out.print("Enter your selection: ");

		Scanner input = new Scanner(System.in);

		//checks for mismatch with while loop
		while (!intInput)
		{

			try{

				//gets input
				choice = input.nextInt();

				intInput = true;


			} catch(InputMismatchException ex) {

				//catches mismatch and ask user for input again
				//intInput set to false to continue loop
				intInput = false;
				input.next();
				System.out.println("Invalid selection.");
				System.out.println("Please input 1, 2, 3, 4, or 5.");
				System.out.print("Enter your selection: ");

			}

		}

		//once no mismatch has been determined set intInput back to false for future use
		intInput = false;

				//validates the selection from above
				//while choice is outside 1-5
				while(choice < 1 || choice > 5)
				{

					//inform user of invalid selection
					//get new input
					System.out.println("Invalid selection.");
					System.out.println("Please input 1, 2, 3, 4, or 5.");
					System.out.print("Enter your selection: ");

					//check for mismatch
					while (!intInput)
					{


						try{

							choice = input.nextInt();

							intInput = true;


						} catch(InputMismatchException ex) {

							intInput = false;
							input.next();
							System.out.println("Invalid selection.");
							System.out.println("Please input 1, 2, 3, 4, or 5.");
							System.out.print("Enter your selection: ");

						}

					} intInput = false; //set intInput back to false for further validation and mismatch check

				}

		//once a valid selection has been made we return value to main()
		return choice;

	}

	//each module prints "Good morning" in corresponding language
	public static void speakEnglish()
	{

		System.out.println("Good morning.");
		System.out.println();

	}

	public static void speakItalian()
	{

		System.out.println("Buongiorno.");
		System.out.println();

	}

	public static void speakSpanish()
	{

		System.out.println("Buenos dias.");
		System.out.println();

	}

	public static void speakGerman()
	{

		System.out.println("Guten morgen.");
		System.out.println();

	}

}