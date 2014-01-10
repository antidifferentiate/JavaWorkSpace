package controller;

import java.util.ArrayList;

import view.EquationFrame;
import view.EquationPanel;
import model.ExponentEquation;
import model.OtherEquation;

/**
 * Equation Controller controls the program and runs loops.
 * 
 * @author Jalen Morgan
 * @version 0.5
 */
public class EquationController
{
	/* ****************** Declaration Section ************** */
	/**
	 * equationSelection - The equation we are using to solve the problem.
	 */
	String equationSelection;

	/**
	 * basePanel - The GUIPanel in our GUI.
	 */
	EquationPanel basePanel;

	/**
	 * baseFrame - The GUIFrame in our GUI.
	 */
	EquationFrame baseFrame;
	ArrayList<Double> xValues;
	ArrayList<Double> yValues;

	/* ******************* Constructors ********************* */
	/**
	 * The default constructor, initializing everything to default values.
	 */
	public EquationController()
	{
		xValues = new ArrayList<Double>();
		yValues = new ArrayList<Double>();

		equationSelection = new String();
		equationSelection = "Exponent Equation";

		// Create view objects
		baseFrame = new EquationFrame(this);
		basePanel = baseFrame.getPanel();
	}

	/* ******************* Methods ************************** */
	/**
	 * starts the code, calling all the sub methods.
	 */
	public void start()
	{
		// Temporary code to see the formula work.
		// doSelectedEquation();
	}

	/**
	 * Use the current input values to do the selected equation.
	 */
	private void doSelectedEquation()
	{
		int points = 0;
		int maxPoints = 0;
		boolean numberChecker = false;

		String tempString = "";
		boolean stillGoing = false;

		if (equationSelection.equalsIgnoreCase("exponent equation"))
		{
			// ExponentEquation(int numberOfPoints, ArrayList<double> pointX,
			// ArrayList<double> pointY) returns "x = ..."
			points = (int) Double.parseDouble(basePanel
					.inputMessage("How many points?"));

			numberChecker = true;

			if (numberChecker == true)
			{
				stillGoing = true;

				try
				{
					maxPoints = points;
				}
				catch (NumberFormatException mustBeInt)
				{
					basePanel.outputMessage("Must be an integer value.");
					stillGoing = false;
				}

				for (int currentPoint = 0; currentPoint < maxPoints; currentPoint++)
				{
					if (stillGoing == true)
					{
						tempString = basePanel.inputMessage("value of x("
								+ currentPoint + ")");
						if (checkNumberFormat(tempString))
						{
							xValues.add(Double.parseDouble(tempString));
						}
						else
						{
							stillGoing = false;
						}
					}

					if (stillGoing == true)
					{
						tempString = basePanel.inputMessage("value of y("
								+ currentPoint + ")");
						if (checkNumberFormat(tempString))
						{
							yValues.add(Double.parseDouble(tempString));
						}
						else
						{
							stillGoing = false;
						}
					}

				}

				if (stillGoing == true)
				{
					basePanel.outputMessage("All values were added.");
				}

				ExponentEquation currentEquation = new ExponentEquation();
				// currentEquation.findSolution(xValues,yValues);
			}
		}
		else
		{
			@SuppressWarnings("unused")
			OtherEquation currentEquation = new OtherEquation();
		}
	}

	/**
	 * Check if a String can be converted into a double.
	 * 
	 * @param toBeParsed
	 *            - The String we are checking.
	 * @return - return
	 */
	private boolean checkNumberFormat(String toBeParsed)
	{
		boolean isNumber = false;

		try
		{

			@SuppressWarnings("unused")
			double valid = Double.parseDouble(toBeParsed);
			isNumber = true;
		}
		catch (Exception error)
		{
			basePanel.outputMessage("Please enter a number.");
		}

		return isNumber;
	}
}
