package conversation.view;

import javax.swing.JOptionPane;

/**
 * @author Jalen Morgan StringView deals with output and input.
 */
public class StringView
{
	// Declaration Section
	//
	
	/**
	 * outputString displays a message to the screen.
	 * 
	 * @param message
	 *            : The message to be displayed is put in as a parameter.
	 */
	public void outputString(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}

	public String getResponse()
	{
		String response = null; // A variable must have a value assigned in a
								// method, or you cannot use it.

		return response;
	}

	public void moreInteractive(String yourName, String response)
	{
		System.out.println("This is your name: " + yourName);
		System.out.println("this is your response: " + response);
	}

	public void testStringMethods()
	{
		fixSpaces("HelLo,       This      iS  A      sTRIng.");
		makeLowerCase("HelLo, This iS A sTRIng.");
		getCharacter("hello, this is a string", 12);
		testSubString(12);
	}

	private String fixSpaces(String inputString)
	{

		JOptionPane.showMessageDialog(null, "we are going to fix spaces in "
				+ inputString);
		String stringToReturn = inputString;
		stringToReturn = " " + stringToReturn + " ";
		for (int i = 0; i < 4; i++)
		{
			stringToReturn = stringToReturn.replaceAll("  ", " ");
		}

		JOptionPane.showMessageDialog(null, "Spaces were fixed!");
		JOptionPane.showMessageDialog(null, stringToReturn);
		return stringToReturn;
	}

	private String makeLowerCase(String inputString)
	{
		JOptionPane.showMessageDialog(null, "we are going to make "
				+ inputString + " lower case");
		String stringToReturn = inputString;
		stringToReturn = stringToReturn.toLowerCase();
		JOptionPane.showMessageDialog(null, "The string was made lower case.");
		JOptionPane.showMessageDialog(null, stringToReturn);
		return stringToReturn;
	}

	private void getCharacter(String inputString, int position)
	{
		JOptionPane.showMessageDialog(null, "we are going to get character "
				+ position + "of " + inputString);
		char character;
		character = inputString.charAt(position);
		JOptionPane.showMessageDialog(null, "the " + position
				+ " character is " + character);
	}

	private void testSubString(int startPosition)
	{
		String testString = "Floccinaucinihilipilification";
		JOptionPane.showMessageDialog(null, "The substring method test!");
		JOptionPane.showMessageDialog(null,
				"The testString.substring(7) call gives us:  " + "\n"
						+ testString.substring(startPosition));
	}

}
