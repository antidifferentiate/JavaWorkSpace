package model;

import java.util.ArrayList;
import controller.LoopController;

public class Looper
{
	LoopController myLoopController;
	private ArrayList<String> graveNamesList;

	public Looper(LoopController myLoopController)
	{
		graveNamesList = new ArrayList();
		this.myLoopController = myLoopController;
		
		fillTheGraveNameList();
	}

	private void fillTheGraveNameList()
	{
		graveNamesList.add("Erna M. Petersen");
		graveNamesList.add("Infant Son LeFevre");
		graveNamesList.add("Mabel S. Johnson");
		graveNamesList.add("Richard Jon LeFevre");
		graveNamesList.add("John Alfred Samuelson");
		graveNamesList.add("Beth M. Nielson Samuelson");
		graveNamesList.add("Craig Hyatt");
		graveNamesList.add("Myrdle Herbert Jr.");
		graveNamesList.add("Jennie Brady Rosengreen");
		graveNamesList.add("Terry A. Petersen");
		graveNamesList.add("Joseph Bradbury");
		graveNamesList.add("Anna Carolina");
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNamesList;
	}
	
	public String loopResultsOne()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		for (int counter = 0; counter < 255; counter++)
		{
			for (int counterTwo = 0; counterTwo < 255; counterTwo++)
			{
				for (int counterThree = 0; counterThree < 255; counterThree++)
				{
					numberOfTimes++;
					System.out.println("R: " + counter + " G: " + counterTwo + " B: " + counterThree);
				}
			}
		}
		loopResult += "There are " + numberOfTimes + " colors possible when using RGB.\n";

		return loopResult;
	}

	public String loopResultsTwo()
	{
		String loopResult = "";

		int numberOfTimes = 0;
		for (int week = 0; week < 52; week++)
		{
			for (int day = 0; day < 7; day++)
			{
				for (int other = 0; other < 24; other++)
				{

					for (int count = 0; count < 60; count++)
					{
						for (int otherCount = 0; otherCount < 60; otherCount++)
						{
							numberOfTimes++;
						}
					}

				}
			}
		}
		loopResult += "The number of times is " + numberOfTimes + ".  Wow!";
		return loopResult;

	}

}
