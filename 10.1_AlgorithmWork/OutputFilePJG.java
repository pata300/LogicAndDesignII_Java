/*

	Chapter 10
	Algorithm Workbench 1
	Programmer:		P. Griffin
	Date:			11/2/2017
	Filename:		OutputFilePJG.java
	Purpose:		This program creates an output file with my name saved to it.

*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.PrintWriter;

public class OutputFilePJG
{

	public static void main(String[] args)
	{

		//variable to hold my name
		String myName = "Patrick";

		//call a module to write the file to disk
		writeFile(myName);

	}

	//module take my name as a parameter
	public static void writeFile(String name)
	{


		try
		{

		//constructs and opens a file
		PrintWriter myFile = new PrintWriter("my_name.dat");

		//writes my name to the file
		myFile.write(name);

		//closes the file
		myFile.close();

		} catch (IOException ex) {

			System.out.println("Error");

		}

		//informs the user of success
		System.out.println("File was saved.");

	}
}