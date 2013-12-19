package controller;

import java.util.ArrayList;

import model.Looper;
import view.LoopFrame;

public class LoopController
{
	private LoopFrame myLoopFrame;
	private Looper myLooper;
	private int clickCount;

	public LoopController()
	{
		myLooper = new Looper(this);
		clickCount = 0;

	}

	public void start()
	{
		LoopFrame baseFrame = new LoopFrame(this);
	}

	public String getLoopResults()
	{
		String results = "";

		results = loopBackwardOverList();

		return results;
	}

	public String getListResults(int position)
	{
		String currentResult = "";

		if (position < myLooper.getGraveNameList().size())
		{
			currentResult = myLooper.getGraveNameList().get(position) + "\n";
		}
		return currentResult;
	}

	private String loopOverList()
	{
		String result = "";

		for (int position = 0; position < myLooper.getGraveNameList().size(); position++)
		{
			result += getListResults(position);
		}

		return result;
	}

	private String loopBackwardOverList()
	{
		String result = "";

		for (int position = myLooper.getGraveNameList().size() - 1; position >= 0; position--)
		{
			result += getListResults(position);
		}

		return result;
	}
}
