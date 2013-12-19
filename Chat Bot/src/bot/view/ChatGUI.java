package bot.view;

import javax.swing.JOptionPane;

/**
 * Does everything input and output.
 * 
 * @author jmor9751
 * 
 */
public class ChatGUI
{
	/**
	 * Output a message (via pop-up)
	 * 
	 * @param input
	 *            This is the string being output.
	 */
	public void outPutMessage(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}

	/**
	 * Ask for an input from the user.
	 * 
	 * @return Return the string the user gave.
	 */
	public String inPutMessage()
	{
		String userString;
		userString = JOptionPane.showInputDialog("");
		return userString;
	}
}
