package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import model.Game;
import view.Frame;

public class Controller
{
	/* ******** Declaration Section *********** */
	/**
	 * Reference to the GUI frame for the project.
	 */
	private Frame universalFrame;
	/**
	 * All the games that can be retrieved from the save file.
	 */
	private ArrayList<Game> projectGames;

	/* ******** Constructors ********* */
	/**
	 * Constructor makes default values.
	 */
	public Controller()
	{
		projectGames = new ArrayList<Game>();
	}

	/**
	 * Get the ArrayList of project games.
	 * 
	 * @return return the ArrayList.
	 */
	public ArrayList<Game> getProjectGames()
	{
		return projectGames;
	}

	/* ******** Starting the code ******* */
	/**
	 * Start begins running the code in the project.
	 */
	public void start()
	{
		universalFrame = new Frame(this);
	}

	/* ********** Reading game information ******* */
	/**
	 * Read the game information from the text file.
	 * 
	 * @return Return a game object with similar information to what was saved.
	 */
	public Game readGameInformation()
	{
		String fileName = "save file.txt";
		File currentSaveFile = new File(fileName);
		Scanner fileReader;
		Game currentGame = null;
		int gameRanking = 0;
		String gameTitle = "";
		ArrayList<String> gameRules = new ArrayList<String>();

		try
		{
			fileReader = new Scanner(currentSaveFile);
			gameTitle = fileReader.nextLine();
			gameRanking = fileReader.nextInt();
			while (fileReader.hasNext())
			{
				gameRules.add(fileReader.nextLine());
			}

			currentGame = new Game(gameRules, gameRanking, gameTitle);
			fileReader.close();
		}
		catch (FileNotFoundException currentFileDoesNotExist)
		{
			JOptionPane.showMessageDialog(universalFrame,
					currentFileDoesNotExist.getMessage());
			;
		}

		return currentGame;

	}

	/**
	 * Read the information about all the saved games.
	 */
	public String readAllGameInformation()
	{
		String fileContents = "";
		String fileName = "save file.txt";
		File currentSaveFile = new File(fileName);
		Scanner fileReader;

		try
		{
			fileReader = new Scanner(currentSaveFile);
			while (fileReader.hasNext())
			{
				fileContents += fileReader.nextLine();
			}
			fileReader.close();
		}
		catch (FileNotFoundException fileDoesNotExist)
		{
			JOptionPane.showMessageDialog(universalFrame,
					fileDoesNotExist.getMessage());
		}

		return fileContents;
	}

	/**
	 * Convert a big mess of text into seperate games and give the games their
	 * string values.
	 * 
	 * @param currentInfo
	 *            The messy string to convert into games.
	 */
	private void convertTextToGames(String currentInfo)
	{
		String[] gameChunks = currentInfo.split(";");
		for (String currentBlock : gameChunks)
		{
			int currentIndex = currentBlock.indexOf("\n");
			String title = currentBlock.substring(0, currentIndex);
			int nextIndex = currentBlock.indexOf("\n", currentIndex);
			String ranking = currentBlock
					.substring(currentIndex + 1, nextIndex);
			String rules = currentBlock.substring(nextIndex + 1);

			Game currentGame = makeGameFromInput(title, ranking, rules);
			projectGames.add(currentGame);

		}
	}

	/**
	 * Gives a random game from the save file.
	 * 
	 * @return Return the game object that was found.
	 */
	public Game loadRandomGame()
	{
		Game currentGame = null;

		String allInfo = readAllGameInformation();
		convertTextToGames(allInfo);
		int randomIndex = (int) (Math.random() * (double) projectGames.size());
		currentGame = projectGames.get(randomIndex);

		return currentGame;
	}

	/* ********* Saving game information ********** */
	/**
	 * Given a game object, save its information to a file and seperates each
	 * game with a semicolon.
	 * 
	 * @param currentGame
	 *            The game object to save.
	 */
	public void saveGameInformation(Game currentGame)
	{
		PrintWriter gameWriter;
		String saveFile = "save file.txt";
		
		try
		{
			gameWriter = new PrintWriter(saveFile); // creates the save file.

			gameWriter.append(currentGame.getGameTitle() + "\r\n");
			gameWriter.append(currentGame.getFunRanking() + "\r\n");

			for (int count = 0; count < currentGame.getGameRules().size(); count++)
			{
				gameWriter.append(currentGame.getGameRules().get(count) + "\r\n");
			}

			gameWriter.println(";\r\n"); // Used to delineate each individual game
										// in the save file.

			gameWriter.close(); // Required to prevent corruption of data.
		}
		catch (FileNotFoundException noFileExists)
		{
			JOptionPane.showMessageDialog(universalFrame,
					"Could not create the save file.");
			JOptionPane.showMessageDialog(universalFrame,
					noFileExists.getMessage());
		}
	}

	/**
	 * Make a new game using all the fields in the GUI.
	 * 
	 * @param gameTitle
	 *            The field of game title
	 * @param gameRanking
	 *            The field of game ranking
	 * @param gameRules
	 *            The field of game rules
	 * @return Return the game with all the information.
	 */
	public Game makeGameFromInput(String gameTitle, String gameRanking,
			String gameRules)
	{
		Game currentGame = new Game();
		currentGame.setGameTitle(gameTitle);

		if (checkNumberFormat(gameRanking))
		{
			currentGame.setFunRanking(Integer.parseInt(gameRanking));
		}
		else
		{
			return null;
		}

		String[] temp = gameRules.split("\n");
		ArrayList<String> tempRules = new ArrayList<String>();

		for (String tempWord : temp)
		{
			tempRules.add(tempWord);
		}
		currentGame.setGameRules(tempRules);

		return currentGame;
	}

	/**
	 * Check if the input (String) is a number.
	 * 
	 * @param toBeParsed
	 *            The string to check if it is a number.
	 * @return return true if it is a number, otherwise, false.
	 */
	private boolean checkNumberFormat(String toBeParsed)
	{
		boolean isNumber = false;

		try
		{
			int valid = Integer.parseInt(toBeParsed);
			isNumber = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(universalFrame,
					"Please try again with an actual number.");
		}

		return isNumber;
	}
}
