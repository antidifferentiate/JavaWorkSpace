package arrays.view;

import arrays.model.Game;

public class GridView
{
	public void printIntInformation(int[][] currentArray)
	{
		for (int[] currentRow : currentArray)
		{
			System.out.print("[");
			for (int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println("]");
		}
	}

	public void printNameInformation(String[] currentArray)
	{
		for (String currentName : currentArray)
		{
			System.out.print("\n" + currentName);
		}
	}

	public void printGameInformation(Game[][] currentArray)
	{
		for (Game[] currentRow : currentArray)
		{
			System.out.print("[");
			for (Game currentGame : currentRow)
			{
				System.out.print(currentGame.getGameTitle() + "\t");
			}
			System.out.println("]");
		}
	}
}
