package bot.controller;

import java.util.ArrayList;
import bot.model.ChatBot;
import bot.view.ChatbotFrame;

/**
 * Controls what happens and loops.
 * 
 * @author jmor9751
 * @version 1.8.1 10/23/13 Removed old popup GUI, reference to Chatbot
 */
public class StartController
{
	/**
	 * cleverBot is the chatbot object. appFrame is the JFrame that is used for
	 * our window.
	 */
	private ChatBot cleverBot;
	private ChatbotFrame appFrame;

	/**
	 * Constructor for StartController, creates GUI object.
	 */
	public StartController()
	{
		cleverBot = new ChatBot();
	}

	/**
	 * Get the object id of the Bot object
	 * 
	 * @return the object id
	 */
	public ChatBot getCleverBot()
	{
		return cleverBot;
	}

	/**
	 * Removes the string from the list.
	 * 
	 * @param conversationList
	 *            inputed arraylist
	 * @return Return the string.
	 */
	private String conversationHelper(ArrayList<String> conversationList)
	{
		String currentConversationPiece = "";

		if (conversationList.size() > 0)
		{
			currentConversationPiece = conversationList.remove(0);
		}
		return currentConversationPiece;
	}

	/**
	 * Processes a conversation, calls conversationHelper
	 * 
	 * @return a string
	 */
	public String processConversation()
	{
		String currentConversation = "";

		currentConversation = conversationHelper(cleverBot.topicConversation());

		return currentConversation;
	}

	/**
	 * Processes a random conversation, calls conversationHelper
	 * 
	 * @return Return the string that was deleted.
	 */
	public String processRandom()
	{
		String currentRandom = "";

		currentRandom = conversationHelper(cleverBot.randomConversation());

		return currentRandom;
	}

	/**
	 * Processes a meme conversation, calls conversationHelper
	 * 
	 * @return Return the deleted string.
	 */
	public String processMeme()
	{
		String currentMeme = "";

		currentMeme = conversationHelper(cleverBot.randomConversation());

		return currentMeme;
	}

	public String processFruit()
	{
		String currentFruit = "";

		currentFruit = conversationHelper(cleverBot.fruitConversation());

		return currentFruit;
	}

	public String processMusic()
	{
		String currentMusic = "";

		currentMusic = conversationHelper(cleverBot.musicConversation());

		return currentMusic;
	}

	/**
	 * Start and loop. The loop gets input and output, repeating.
	 */
	public void start()
	{
		// initialize variables for start
		// String outPutString = null;
		// String inPutString = null;
		// start by outputting something, then get input. Then output....
		// while (stillRunning == true)
		// {
		// outPutString = cleverBot.getOutput(inPutString);
		// myChatGUI.outPutMessage(outPutString);
		// inPutString = myChatGUI.inPutMessage();

		// cleverBot.addToArray(outPutString, inPutString);
		// }
		appFrame = new ChatbotFrame(this);

	}
}
