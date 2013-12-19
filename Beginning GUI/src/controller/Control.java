package controller;

import javax.swing.JOptionPane;

import view.GUIFrame;

public class Control
{
	private GUIFrame appFrame;

	public Control()
	{

	}

	public void start()
	{
		GUIFrame baseFrame = new GUIFrame(this);
	}
}
