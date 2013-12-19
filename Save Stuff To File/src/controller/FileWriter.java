package controller;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileWriter
{
	private OutputStream myOutput;
	private PrintStream p;
	
	FileWriter()
	{
		try
		{
			File myFile = new File("%Documents%/myText.txt");
			//check if you can read the file.
			Scanner myScanner = new Scanner(myFile);
		}
		catch (Exception zed)
		{
			System.err.println(zed);
		}
		p = new PrintStream(myOutput);
	}
	public void tryIt()
	{
		
	}
	public void writeToFile(String stringToWrite)
	{
		p.print(stringToWrite);
	}
	public String readFile(int line)
	{
		
		return "";
	}
	
}
