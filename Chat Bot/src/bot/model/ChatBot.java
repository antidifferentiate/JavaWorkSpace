package bot.model;

import java.util.ArrayList;

import bot.view.ChatGUI;

/**
 * Creates a chatbot that will talk to you.
 * 
 * @author Jalen Morgan
 * @version 2.01.07 10/15/13
 */
public class ChatBot
{
	/**
	 * An array to hold what the Bot says. An array to hold what the user says.
	 * A list to hold myMemes. A list to hold myConversations. A variable to
	 * tell us how many spots are filled in the array. A variable that is the
	 * max number of strings held in the array.
	 */
	private String[] botArray;
	private String[] userArray;
	private ArrayList<String> myMemes;
	private ArrayList<String> basicConversations;
	private ArrayList<String> randomList;
	private ArrayList<String> musicList;
	private ArrayList<String> fruitList;
	private int arrayCount;
	private int arrayMax;

	ChatGUI myGUI;
	
	/**
	 * get the arrayList for conversations.
	 * @return basicConversations list
	 */
	public ArrayList<String> topicConversation()
	{
		return basicConversations;
	}

	public ArrayList<String> memeConversation()
	{
		return myMemes;
	}

	public ArrayList<String> randomConversation()
	{
		return randomList;
	}

	public ArrayList<String> musicConversation()
	{
		return musicList;
	}

	public ArrayList<String> fruitConversation()
	{
		return fruitList;
	}

	/**
	 * Constructor for ChatBot
	 */
	public ChatBot()
	{
		myMemes = new ArrayList<String>();
		basicConversations = new ArrayList<String>();
		randomList = new ArrayList<String>();
		musicList = new ArrayList<String>();
		fruitList = new ArrayList<String>();
		arrayCount = 0;
		arrayMax = 20;
		botArray = new String[arrayMax];
		userArray = new String[arrayMax];

		myGUI = new ChatGUI();

		fillMemeList();
		fillConversationList();
		fillRandomList();
		fillMusicList();
		fillFruitList();
	}

	/**
	 * Search for the answer to output.
	 * 
	 * @param input
	 *            The string to check for an answer with.
	 * @return Returns whatever the chatbot says. A string.
	 */
	public String getOutput(String input)
	{
		String outPutString;
		boolean memeExists;
		boolean conversationExists;
		boolean musicExists;
		boolean fruitExists;
		String previousAnswer;

		if ((input == null) || (input.equals("")))
		{
			return "Hello, my name is ChatBot-tle.  Ask me a question.";
		}
		outPutString = input.toLowerCase();

		if (outPutString.equals("let's talk about math."))
		{
			talkAboutMath();
		}
		
		previousAnswer = answerChecker(outPutString);
		if (!previousAnswer.equals(""))
		{
			return previousAnswer;
		}
		
		fruitExists = fruitChecker(outPutString);
		if (fruitExists == true)
		{
			return "Mmmm, I love eating fruit.  " + outPutString + " is very yummy.";
		}
		
		memeExists = memeChecker(outPutString);
		if (memeExists == true) // check if it is a meme that was inputted.
		{
			return "Ahh, I see you are aware of a popular meme!  "
					+ outPutString + " is a good meme.";
		}
		musicExists = musicChecker(outPutString);
		if (musicExists == true)
		{
			return "Oh, I see you are a fan of music.  " + outPutString
					+ " is an awesome instrument!";
		}
		conversationExists = conversationChecker(outPutString);
		if (conversationExists == true) // check if it is a conversation starter
										// that was inputted.
		{
			return "I'm doing well.  How are you?";
		}
		outPutString = getRandomTopic();
		return outPutString;
	}

	/**
	 * Fill the list of questions relating to how are you.
	 */
	private void fillConversationList()
	{
		basicConversations.add("how are you?");
		basicConversations.add("how do you do?");
		basicConversations.add("how are you feeling?");
		basicConversations.add("what is your current status?");
		basicConversations.add("how are you feeling?");
		basicConversations.add("are you feeling well?");
		basicConversations.add("how's life?");
		basicConversations.add("how's it going?");
		basicConversations.add("how art thou?");
	}

	/**
	 * Fills the list of musical instruments.
	 */
	private void fillMusicList()
	{
		musicList.add("violin");
		musicList.add("viola");
		musicList.add("cello");
		musicList.add("bass");
		musicList.add("guitar");
		musicList.add("drums");
		musicList.add("tuba");
		musicList.add("flute");
		musicList.add("harp");
	}

	/**
	 * Fill the list of memes
	 */
	private void fillMemeList()
	{
		myMemes.add("nicolas cage");
		myMemes.add("arrow to the knee");
		myMemes.add("one does not simply");
		myMemes.add("y u no");
		myMemes.add("bad luck brian");
		myMemes.add("mckayla is not impressed");
		myMemes.add("skeptical baby");
		myMemes.add("i dont always");
		myMemes.add("philosoraptor");
	}

	/**
	 * Fill the list of random stuff
	 */
	private void fillRandomList()
	{
		randomList.add("I like cheese.");
		randomList.add("Tortoise can move faster than slow rodent.");
		randomList.add("I enjoy sitting on the ground.");
		randomList.add("I like cereal.");
		randomList.add("This is random.");
		randomList.add("I like typing");
		randomList.add("FLdlsjejf is my favorite word.");
		randomList.add("I have two left toes.");
		randomList.add("Sqrt(2) = 1.414213562 ...");
		randomList.add("Hi mom.");
	}

	/**
	 * Fill the list of fruityness
	 */
	private void fillFruitList()
	{
		fruitList.add("apple");
		fruitList.add("kiwi");
		fruitList.add("coconut");
		fruitList.add("orange");
		fruitList.add("pineapple");
		fruitList.add("pear");
		fruitList.add("banana");
		fruitList.add("papaya");
		fruitList.add("blueberry");
	}

	/**
	 * returns a random string.
	 * 
	 * @return our random string will return.
	 */
	private String getRandomTopic()
	{
		String randomTopic = "";
		double myRandom = Math.random();
		int myRandomListPosition = (int) (myRandom * randomList.size());

		randomTopic = randomList.get(myRandomListPosition);
		return randomTopic;
	}

	/**
	 * Check if the input is in the conversation list.
	 * 
	 * @param currentInput
	 *            Input to check in the list.
	 * @return boolean true or false if the input is in the list.
	 */
	private boolean conversationChecker(String currentInput)
	{
		boolean hasConversation = false;

		for (String currentPhrase : basicConversations)
		{
			if (currentPhrase.equals(currentInput))
			{
				hasConversation = true;
			}
		}
		return hasConversation;
	}

	/**
	 * Check if the input is in the meme list.
	 * 
	 * @param currentInput
	 *            input to check with list.
	 * @return true or false. True if it is in a meme list.
	 */
	private boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		// loop over all items in it, and look for a meme.

		for (String currentPhrase : myMemes)
		{
			if (currentPhrase.equals(currentInput))
			{
				hasMeme = true;
			}
		}
		return hasMeme;
	}
	
	/**
	 * Check if the input is in the fruit list.
	 * @param currentInput The inputed string to check
	 * @return true if it is there, else false.
	 */
	private boolean fruitChecker(String currentInput)
	{
		boolean hasFruit = false;
		// loop over all items in it, and look for a meme.

		for (String currentPhrase : fruitList)
		{
			if (currentPhrase.equals(currentInput))
			{
				hasFruit = true;
			}
		}
		return hasFruit;
	}

	/**
	 * Check if the input is musical.
	 * 
	 * @param currentInput
	 *            The string to check
	 * @return True if there is music, else false.
	 */
	private boolean musicChecker(String currentInput)
	{
		boolean hasMusic = false;
		// loop, look for music.

		for (String currentPhrase : musicList)
		{
			if (currentPhrase.equals(currentInput))
			{
				hasMusic = true;
			}
		}
		return hasMusic;
	}

	/**
	 * Check to see if the input is in the recorded array or previous text.
	 * 
	 * @param currentInput
	 *            The input to check in the array.
	 * @return The string that was replied previously.
	 */
	private String answerChecker(String currentInput)
	{
		for (int i = 0; i < arrayCount; i += 1)
		{
			if (botArray[i].equals(currentInput.toLowerCase()))
			{
				return userArray[i];
			}
		}
		return "";
	}

	/**
	 * Adds some text to the array of saved text.
	 * 
	 * @param computerOutput
	 *            What the computer said.
	 * @param userOutput
	 *            What the user said after.
	 */
	public void addToArray(String computerOutput, String userOutput)
	{
		if ((userOutput != null) && (!userOutput.equals(""))
				&& (arrayCount != arrayMax))
		{
			botArray[arrayCount] = computerOutput.toLowerCase();
			userArray[arrayCount] = userOutput;
			arrayCount++;
		}

	}

	/**
	 * Starts a math conversation with a few different things to say.
	 */
	public void talkAboutMath()
	{

		String answer = "";

		while (!answer.equals("quit"))
		{
			if (answer.equals(""))
			{
				myGUI.outPutMessage("We're going to talk about math.  To stop, say 'quit'.");
			}
			else if (answer.equals("what do you like about math?")
					|| answer.equals("what is your favorite thing about math?"))
			{
				myGUI.outPutMessage("I love everything about math!");
			}
			else if (answer.equals("what is one plus one?")
					|| answer.equals("what is 1+1?") || answer.equals("1+1"))
			{
				myGUI.outPutMessage("Dude, it's 2.");
			}
			else
			{
				answer = answer.replaceAll("solve ", "");
				answer = answer.replaceAll(" ", "");
				answer = solveProblem(answer);
				System.out.println(answer);

				myGUI.outPutMessage("I don't understand.");
			}

			answer = myGUI.inPutMessage().toLowerCase();
		}
	}

	/**
	 * Solve the problem inside the string
	 * 
	 * @param answer
	 *            The string inputed to be solved
	 * @return Return the solved string.
	 */
	private String solveProblem(String answer)
	{
		int signSpot;
		String stringToDelete;
		int parenthesisCount = 0;
		int i = 0;
		String stringToSolve;

		while (answer.contains("("))
		{
			signSpot = answer.indexOf("(");
			for (i = signSpot; i < answer.length(); i += 1)
			{
				if (answer.charAt(i) == '(')
					parenthesisCount += 1;
				else if (answer.charAt(i) == ')')
					parenthesisCount -= 1;
				if (parenthesisCount == 0)
					break;
			}
			if (parenthesisCount == 0)
			{
				stringToDelete = answer.substring(signSpot, i + 1);
				stringToSolve = answer.substring(signSpot + 1, i);
				answer = answer.replace(stringToDelete,
						solveProblem(stringToSolve));
			}
			else
				break;
		}
		answer = doExponent(answer);
		answer = doMultiplication(answer);
		answer = doDivision(answer);
		answer = doAddition(answer);
		answer = doSubtraction(answer);
		return answer;
	}

	/**
	 * Solve all the multiplication inside a string
	 * 
	 * @param answer
	 *            The string to solve
	 * @return Return the solved string.
	 */
	private String doMultiplication(String answer)
	{
		int signSpot;
		String stringToDelete;
		double number1;
		double number2;
		int minValue = 0;
		int maxValue = 0;

		while (answer.contains("*"))
		{
			signSpot = answer.indexOf("*");

			// start
			for (int count = signSpot - 1; count >= 0; count -= 1)
			{
				if (isNumeric(answer.substring(count, count + 1)) == true
						|| answer.substring(count, count + 1).equals("."))
				{
					minValue = count;
				}
				else
				{
					break;
				}
			}
			// finish
			for (int count = signSpot + 2; count <= answer.length(); count += 1)
			{
				if (isNumeric(answer.substring(count - 1, count)) == true
						|| answer.substring(count - 1, count).equals("."))
				{
					maxValue = count;
				}
				else
				{
					break;
				}
			}

			stringToDelete = answer.substring(minValue, maxValue);
			String myString = answer.substring(minValue, signSpot);
			number1 = Double.parseDouble(myString);
			myString = answer.substring(signSpot + 1, maxValue);
			number2 = Double.parseDouble(myString);
			Double numberAnswer1 = number1 * number2;
			answer = answer.replace(stringToDelete, "" + numberAnswer1);
			System.out.println(answer);
		}
		return answer;
	}

	/**
	 * Solve all the division inside a string.
	 * 
	 * @param answer
	 *            The string to solve
	 * @return Return the solved string.
	 */
	private String doDivision(String answer)
	{
		int signSpot;
		String stringToDelete;
		double number1;
		double number2;
		int minValue = 0;
		int maxValue = 0;

		while (answer.contains("/"))
		{
			signSpot = answer.indexOf("/");

			// start
			for (int count = signSpot - 1; count >= 0; count -= 1)
			{
				if (isNumeric(answer.substring(count, count + 1)) == true
						|| answer.substring(count, count + 1).equals("."))
				{
					minValue = count;
				}
				else
				{
					break;
				}
			}
			// finish
			for (int count = signSpot + 2; count <= answer.length(); count += 1)
			{
				if (isNumeric(answer.substring(count - 1, count)) == true
						|| answer.substring(count - 1, count).equals("."))
				{
					maxValue = count;
				}
				else
				{
					break;
				}
			}

			stringToDelete = answer.substring(minValue, maxValue);
			String myString = answer.substring(minValue, signSpot);
			number1 = Double.parseDouble(myString);
			myString = answer.substring(signSpot + 1, maxValue);
			number2 = Double.parseDouble(myString);
			Double numberAnswer1 = number1 / number2;
			answer = answer.replace(stringToDelete, "" + numberAnswer1);
			System.out.println(answer);
		}
		return answer;
	}

	/**
	 * Check the string for "+" and add the number before and after.
	 * 
	 * @param answer
	 *            Input is a string that may have "+" in it.
	 * @return Return the string, with all numbers by "+" added together.
	 */
	private String doAddition(String answer)
	{
		int signSpot;
		String stringToDelete;
		double number1;
		double number2;
		int minValue = 0;
		int maxValue = 0;

		while (answer.contains("+"))
		{
			signSpot = answer.indexOf("+");

			// start
			for (int count = signSpot - 1; count >= 0; count -= 1)
			{
				if (isNumeric(answer.substring(count, count + 1)) == true
						|| answer.substring(count, count + 1).equals("."))
				{
					minValue = count;
				}
				else
				{
					break;
				}
			}
			// finish
			for (int count = signSpot + 2; count <= answer.length(); count += 1)
			{
				if (isNumeric(answer.substring(count - 1, count)) == true
						|| answer.substring(count - 1, count).equals("."))
				{
					maxValue = count;
				}
				else
				{
					break;
				}
			}

			stringToDelete = answer.substring(minValue, maxValue);
			String myString = answer.substring(minValue, signSpot);
			number1 = Double.parseDouble(myString);
			myString = answer.substring(signSpot + 1, maxValue);
			number2 = Double.parseDouble(myString);
			Double numberAnswer1 = number1 + number2;
			answer = answer.replace(stringToDelete, "" + numberAnswer1);
			System.out.println(answer);
		}
		return answer;
	}

	/**
	 * Check the string for "-" and subtract the number after from the number
	 * before.
	 * 
	 * @param answer
	 *            The string inputed that we check for "-".
	 * @return Return the solved answer string.
	 */
	private String doSubtraction(String answer)
	{
		int signSpot;
		String stringToDelete;
		double number1;
		double number2;
		int minValue = 0;
		int maxValue = 0;

		while (answer.contains("-"))
		{
			signSpot = answer.indexOf("-");

			// start
			for (int count = signSpot - 1; count >= 0; count -= 1)
			{
				if (isNumeric(answer.substring(count, count + 1)) == true
						|| answer.substring(count, count + 1).equals("."))
				{
					minValue = count;
				}
				else
				{
					break;
				}
			}
			// finish
			for (int count = signSpot + 2; count <= answer.length(); count += 1)
			{
				if (isNumeric(answer.substring(count - 1, count)) == true
						|| answer.substring(count - 1, count).equals("."))
				{
					maxValue = count;
				}
				else
				{
					break;
				}
			}

			stringToDelete = answer.substring(minValue, maxValue);
			String myString = answer.substring(minValue, signSpot);
			number1 = Double.parseDouble(myString);
			myString = answer.substring(signSpot + 1, maxValue);
			number2 = Double.parseDouble(myString);
			Double numberAnswer1 = number1 - number2;
			answer = answer.replace(stringToDelete, "" + numberAnswer1);
			System.out.println(answer);
		}
		return answer;
	}

	/**
	 * Check the string for "^" and set on to the power of another.
	 * 
	 * @param answer
	 *            The string inputed and checked for "^"
	 * @return Return the solved string.
	 */
	private String doExponent(String answer)
	{
		int signSpot;
		String stringToDelete;
		double number1;
		double number2;
		int minValue = 0;
		int maxValue = 0;

		while (answer.contains("^"))
		{
			signSpot = answer.indexOf("^");

			// start
			for (int count = signSpot - 1; count >= 0; count -= 1)
			{
				if (isNumeric(answer.substring(count, count + 1)) == true
						|| answer.substring(count, count + 1).equals("."))
				{
					minValue = count;
				}
				else
				{
					break;
				}
			}
			// finish
			for (int count = signSpot + 2; count <= answer.length(); count += 1)
			{
				if (isNumeric(answer.substring(count - 1, count)) == true
						|| answer.substring(count - 1, count).equals("."))
				{
					maxValue = count;
				}
				else
				{
					break;
				}
			}

			stringToDelete = answer.substring(minValue, maxValue);
			String myString = answer.substring(minValue, signSpot);
			number1 = Double.parseDouble(myString);
			myString = answer.substring(signSpot + 1, maxValue);
			number2 = Double.parseDouble(myString);
			Double numberAnswer1 = Math.pow(number1, number2);

			answer = answer.replace(stringToDelete, "" + numberAnswer1);
			System.out.println(answer);
		}
		return answer;
	}

	/**
	 * Check if the inputed string is a number.
	 * 
	 * @param str
	 *            The inputed string.
	 * @return True if the string is a number, false if the string is not a
	 *         number.
	 */
	private static boolean isNumeric(String str)
	{
		try
		{
			double d = Double.parseDouble(str);
		}
		catch (NumberFormatException nfe)
		{
			return false;
		}
		return true;
	}

	/**
	 * This alphabetizes the inputed strings.
	 * 
	 * @param first
	 *            The first name
	 * @param middle
	 *            The middle name
	 * @param last
	 *            The last name
	 * @return The alphabetized string
	 */
	public String alphabetizeYourName(String first, String middle, String last)
	{
		String nameInOrder = "";

		if (first.compareTo(middle) < 0)
		{
			if (first.compareTo(last) < 0)
			{
				if (middle.compareTo(last) < 0)
				{
					nameInOrder = first + ", " + middle + ", " + last;
				}
				else
				{
					nameInOrder = first + ", " + last + ", " + middle;
				}
			}
			else
			{
				nameInOrder = last + ", " + first + ", " + middle;
			}
		}
		else
		{
			if (middle.compareTo(last) < 0)
			{
				if (first.compareTo(last) < 0)
				{
					nameInOrder = middle + ", " + first + ", " + last;
				}
				else
				{
					nameInOrder = middle + ", " + last + ", " + first;
				}
			}
			else
			{
				nameInOrder = last + ", " + middle + ", " + first;
			}
		}
		return nameInOrder;
	}
}