package conversation.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import conversation.view.StringView;

/**
 * @author Jalen Morgan
 * StringController controls everything that happens.
 */
public class StringController
{
	//Declaration Section.
	//All needed models and view objects.
	private StringView myView;
	
	/**
	 * Constructor creates view
	 * @throws FileNotFoundException 
	 */
	public StringController() throws FileNotFoundException
	{
		myView = new StringView();
	}
	
	/**
	 * Starts the code
	 * @throws IOException 
	 */
	public void start()
	{
//		String response;

//		
//		response = myView.getResponse();
//		myView.outputString(response);
//		myView.showPassedValue(response);
//		myView.moreInteractive("Jalen","I have a response");
		
		myView.testStringMethods();
	}
}
