package model;

import java.util.ArrayList;

public class TestAll extends SolveProblem
{
	private int count;
	private int maxCount;
	private ArrayList<Integer> rocky;
	public TestAll()
	{
		super();
		rocky = getRocks();
		
		maxCount = (int) Math.pow(2,rocky.size()-1);
		System.out.println(maxCount);
	}
	public void start()
	{
		for (count = 0; count < maxCount; count += 1)
		{
			String addedNumber = "";
			int number = count;
			while (number > 0)
			{
				addedNumber = "" +number%2 + addedNumber;
				number /= 2;
			}
			System.out.println(addedNumber);
			
		}
	}
}
