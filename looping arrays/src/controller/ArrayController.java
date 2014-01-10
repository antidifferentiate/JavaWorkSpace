package controller;

import model.PotatoObject;

public class ArrayController
{

	String[][] stringArray;
	PotatoObject[][] potatoArray;
	int numberArray[][];

	public ArrayController()
	{
		stringArray = new String[4][4];
		potatoArray = new PotatoObject[6][4];
		numberArray = new int[5][3];
	}

	public void start()
	{
		fillArrays();

		outputIntegers();
		System.out.println("");
		randomizeIntegers();
		outputIntegers();
		System.out.println("");
		changeSomeIntegers();
		outputIntegers();
	}

	private void fillArrays()
	{
		// Loop over Strings;
		for (int rows = 0; rows < stringArray.length; rows++)
		{
			for (int columns = 0; columns < stringArray[0].length; columns++)
			{
				stringArray[rows][columns] = "row: " + rows + " column: "
						+ columns;
			}
		}
		// Loop over Potatos
		for (int rows = 0; rows < potatoArray.length; rows++)
		{
			for (int columns = 0; columns < potatoArray[0].length; columns++)
			{
				potatoArray[rows][columns] = new PotatoObject();
			}
		}
		numberArray[0][0] = 2;
		numberArray[0][1] = 2;
		numberArray[0][2] = 2;

		numberArray[1][0] = 2;
		numberArray[1][1] = 2;
		numberArray[1][2] = 2;

		numberArray[2][0] = 2;
		numberArray[2][1] = 2;
		numberArray[2][2] = 2;

		numberArray[3][0] = 2;
		numberArray[3][1] = 2;
		numberArray[3][2] = 2;

		numberArray[4][0] = 2;
		numberArray[4][1] = 2;
		numberArray[4][2] = 2;
	}

	private void randomizePotatoSizes()
	{
		for (int rows = 0; rows < potatoArray.length; rows++)
		{
			for (int columns = 0; columns < potatoArray[0].length; columns++)
			{
				potatoArray[rows][columns].setSize(10 * Math.random());
			}
		}
	}

	private void outputPotatoSizes()
	{
		for (int rows = 0; rows < potatoArray.length; rows++)
		{
			System.out.print("" + rows + ":  [");
			for (int columns = 0; columns < potatoArray[0].length; columns++)
			{
				System.out.print(potatoArray[rows][columns].getSize() + ", ");
			}
			System.out.println("]");
		}
	}

	private void randomizeIntegers()
	{
		for (int rows = 0; rows < numberArray.length; rows++)
		{
			for (int columns = 0; columns < numberArray[0].length; columns++)
			{
				numberArray[rows][columns] = (int) (200 * Math.random());
			}
		}
	}

	private void outputIntegers()
	{
		for (int rows = 0; rows < numberArray.length; rows++)
		{
			System.out.print(rows + ":  [");
			for (int columns = 0; columns < numberArray[0].length; columns++)
			{
				System.out.print(numberArray[rows][columns] + ", ");
			}
			System.out.println("]");
		}
	}

	private void makeStringRandom()
	{
		for (int rows = 0; rows < stringArray.length; rows++)
		{
			for (int columns = 0; columns < stringArray[0].length; columns++)
			{
				double tempNumber = Math.random();
				if (tempNumber < .1)
				{
				stringArray[rows][columns] = "Hello";
				}
				else
				if (tempNumber < .2)
				{
					stringArray[rows][columns] = "Hi";
				}
				else
				if (tempNumber < .3)
				{
					stringArray[rows][columns] = "what's up?";
				}
				else
				if (tempNumber < .4)
				{
					stringArray[rows][columns] = "How ya doin'?";
				}
				else
				if (tempNumber < .5)
				{
					stringArray[rows][columns] = "Doing well?";
				}
				else
				if (tempNumber < .6)
				{
					stringArray[rows][columns] = "Feeling great?";
				}
				else
				if (tempNumber < .7)
				{
					stringArray[rows][columns] = "Howdy";
				}
				else
				if (tempNumber < .8)
				{
					stringArray[rows][columns] = "Hiya there.";
				}
				else
				if (tempNumber < .9)
				{
					stringArray[rows][columns] = "Sup.";
				}
				else
				{
					stringArray[rows][columns] = "Hey, you.";
				}
			}
		}
	}

	private void outputStrings()
	{
		for (int rows = 0; rows < stringArray.length; rows++)
		{
			System.out.print(rows + ":  [");
			for (int columns = 0; columns < stringArray[0].length; columns++)
			{
				System.out.print(stringArray[rows][columns] + ", ");
			}
			System.out.println("]");
		}
	}
	
	private void changeSomeIntegers()
	{
		for (int rows = 0; rows < numberArray.length; rows++)
		{
			for (int columns = 0; columns < numberArray[0].length; columns++)
			{
				if (Math.random() < .5)
				{
				numberArray[rows][columns] = (int) (200 * Math.random());
				}
			}
		}
	}
}
