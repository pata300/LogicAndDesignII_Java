/*

	Chapter 10
	Algorithm Workbench 2
	Programmer:		P. Griffin
	Date:			11/2/2017
	Filename:		InputFilePJG.java
	Purpose:		This program opens the file 'my_name.dat' created in the last program and print my name

*/

import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class InputFilePJG
{

	public static void main(String[] args)
	{

		String myName;

		myName = readFile();

		System.out.println("Hello, my name is " + myName);

	}

	public static String readFile()
	{

		String name = "null";

		try
		{

		
		File myFile = new File("my_name.dat");

		Scanner input = new Scanner(myFile);

		name = input.nextLine();

		input.close();

		} catch (IOException ex) {

			System.out.println("Error");

		}

		return name;

	}
}