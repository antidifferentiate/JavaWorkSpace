package pi.solver;

import java.util.Scanner;

public class SolvePi
{
	
private Scanner myScanner;
public boolean adding;
private double piNumber;
private double denominator;

public SolvePi()
{
	adding = false;
	piNumber = 4;
	denominator = 3;
	
	myScanner = new Scanner(System.in);
}
public void runPiScript()
{
	while (1==1)
	{
	if (adding == false)
	{
		piNumber -= (4/denominator);
		denominator += 2;
		adding = true;
	}
	else
	{
		piNumber += (4/denominator);
		denominator += 2;
		adding = false;
		System.out.println("PI = " + piNumber);
		
	}
	}
}

}
