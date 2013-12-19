package controller;

import model.TestAll;

public class MillenniumController
{
	TestAll myTester;
	public MillenniumController()
	{
		myTester = new TestAll();
	}
	public void start()
	{
		myTester.start();
	}
}
