package first.controller;

import first.view.ConsoleView;
import first.view.FirstGUI;

public class FirstRunner 
{
	public static void main(String[] args) 
	{
		//ConsoleView newView = new ConsoleView();
		//newView.startEverything();
//		FirstGUI myFirstGUI = new FirstGUI();
//		myFirstGUI.start();
		ConsoleView myFirstConsole = new ConsoleView();
		myFirstConsole.start();
	}

}