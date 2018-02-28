/*

	Chapter 10
	Programming Exercise: 1
	Programmer:		P. Griffin
	Date:			11/2/2017
	Filename:		FileDisplayPJG.java
	Purpose:		This program will use a saved file to display the numbers 1-10

*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Number;
import java.lang.String;

public class FileDisplayPJG
{

	public static void main(String[] args)
	{

		//declare int for array and size of array
		final int SIZE = 10;
		String[] numbers = new String[SIZE];

		//module will write array to file
		writeFile(numbers, SIZE);

		//module will read the saved file and print
		readFile();


	}

	//this module takes a constructed array, populates and writes it to a file
	public static void writeFile(String[] array, final int NUMS)
	{

		//declare variable for loop
		int index;

		try
		{

		//constructs and opens file
		PrintWriter myFile = new PrintWriter("numbers.dat");

		for(index = 0; index <= NUMS - 1; index++){

			//populate the array with numbers 1 - 10
			array[index] = Integer.toString(index + 1);

			//writes array to file
			myFile.write(array[index] + "/");

		}

		//close file
		myFile.close();

		} catch (IOException ex) {

			System.out.println("Error");

		}

		System.out.println("File was saved.");

	}

	//this module will open the saved file and print the numbers
	public static void readFile()
	{

		try
		{


		//construct and open file
		File myFile = new File("numbers.dat");

		Scanner input = new Scanner(myFile);

		//using delimiters to print list to user
		System.out.println("The saved numbers are:");

		input.useDelimiter("/");

		while(input.hasNext()){


			System.out.println(input.next());

		}

		//close file
		input.close();

		} catch (IOException ex) {

			System.out.println("Error");

		}

	}
}