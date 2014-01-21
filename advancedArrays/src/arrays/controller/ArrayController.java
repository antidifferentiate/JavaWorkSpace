package arrays.controller;

import arrays.model.Game;
import arrays.view.GridView;

public class ArrayController
{
	/* **************** Declaration Section ************ */
	private int[][] timesTable;
	private Game[][] gameArray;
	private String[] friendNames;
	private GridView consoleView;

	/* ***************** Constructors ***************** */
	/**
	 * Default Constructor, begins by creating a times table, list of names, and
	 * gridView.
	 */
	public ArrayController()
	{
		timesTable = new int[10][10];
		friendNames = new String[16];
		gameArray = new Game[3][3];
		consoleView = new GridView();
	}

	/* *************** Getters **************** */
	/**
	 * Get the times table array of ints.
	 * 
	 * @return returns timesTable, the two dimensional array.
	 */
	public int[][] getTimesTable()
	{
		return timesTable;
	}

	/**
	 * Get the array of Names.
	 * 
	 * @return Returns friendNames, the array of Strings.
	 */
	public String[] getNames()
	{
		return friendNames;
	}

	public Game[][] getGames()
	{
		return gameArray;
	}

	/* *************** Setters ***************** */
	/**
	 * Sets the times table to the argument.
	 * 
	 * @param timesTable
	 *            The timestable array will now be set to this argument.
	 */
	public void setTimesTable(int[][] timesTable)
	{
		this.timesTable = timesTable;
	}

	/**
	 * Sets the names array to the argument.
	 * 
	 * @param friendNames
	 *            The array of names will be set to this argument.
	 */
	public void setNames(String[] friendNames)
	{
		this.friendNames = friendNames;
	}

	public void setGames(Game[][] newGame)
	{
		gameArray = newGame;
	}

	/* *************** Methods *********************** */
	public void start()
	{
		addIntsToArray(timesTable);
		addNamesToArray();
		addGamesToArray();
		consoleView.printGameInformation(gameArray);
		consoleView.printIntInformation(timesTable);
	}

	private void addIntsToArray(int[][] intArray)
	{
		for (int rowCount = 0; rowCount < intArray.length; rowCount++)
		{
			for (int columnCount = 0; columnCount < intArray[0].length; columnCount++)
			{
				intArray[rowCount][columnCount] = (rowCount + 1)
						* (columnCount + 1);
			}
		}
	}

	private void addNamesToArray()
	{
		friendNames[0] = "David";
		friendNames[1] = "Tristan";
		friendNames[2] = "Spencer";
		friendNames[3] = "Taylor";
		friendNames[4] = "Cody";
		friendNames[5] = "Zeus";
		friendNames[6] = "Spike";
		friendNames[7] = "Champ";
		friendNames[8] = "Fido";
		friendNames[9] = "Toto";
		friendNames[10] = "Max";
		friendNames[11] = "Bolt";
		friendNames[12] = "Jack";
		friendNames[13] = "Snoopie";
		friendNames[14] = "Goldy";
		friendNames[15] = "Lucille";
	}

	private void addGamesToArray()
	{
		for (int rows = 0; rows < gameArray.length; rows++)
		{
			for (int cols = 0; cols < gameArray[0].length; cols++)
			{
				gameArray[rows][cols] = new Game();
			}
		}
	}
}
