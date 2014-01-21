package model;

import java.util.ArrayList;

/**
 * Solve the equation in the format y = ax^3 + bx^2 + cx...
 * 
 * @author Jalen Morgan
 * @version 0.5
 */
public class ExponentEquation
{
	double[][] variablesArray;
	private ArrayList<Double> xValues;
	private ArrayList<Double> yValues;
	private ArrayList<Double> answers;

	/* ********************** Constructors ************** */
	public ExponentEquation()
	{
		// Nothing for now.
	}

	public ExponentEquation(ArrayList<Double> xValues, ArrayList<Double> yValues)
	{
		variablesArray = new double[xValues.size()][xValues.size() + 1];

		this.xValues = xValues;
		this.yValues = yValues;
		answers = new ArrayList<Double>();

		initializeVariables();
		findSolution();
		drawSolution();

	}

	/* ********************** Methods ******************* */
	private void initializeVariables()
	{
		for (int equation = 0; equation < xValues.size(); equation++)
		{
			for (int variableCount = 0; variableCount < xValues.size(); variableCount++)
			{
				double tempDouble = Math.pow(xValues.get(equation),
						xValues.size() - variableCount - 1);
				variablesArray[equation][variableCount] = tempDouble;
			}
			variablesArray[equation][xValues.size()] = -(yValues.get(equation));
		}
	}

	private void findSolution()
	{
		// part one
		int tempNum = 1;

		solveFor(0, 0);
		for (int i = 1; i < xValues.size(); i++) // 1 to 2
		{
			for (int i2 = 0; i2 < i; i2++) // once: 1; 0 twice: 2; 0,1
			{
				plugIn(i2, i, i2);
			}
			solveFor(i, i);

		}
		// part two
		for (int i = 1; i < xValues.size(); i++)
		{
			for (int i2 = xValues.size() - 1; i2 > xValues.size() - i - 1; i2 -= 1)
			{
				plugIn(i2, xValues.size() - i - 1, i2);
			}
		}
	}

	private void drawAllVariables()
	{
		for (int i = 0; i < xValues.size(); i++)
		{
			for (int i2 = 0; i2 < xValues.size() + 1; i2++)
			{
				System.out.println(variablesArray[i][i2]);
			}
		}
	}

	private void drawSolution()
	{
		for (int i = 0; i < xValues.size(); i++)
		{
			answers.add(-(variablesArray[i][xValues.size()]));
			System.out.println(-(variablesArray[i][xValues.size()]));
		}
	}

	private void solveFor(int currentVariable, int currentEquation)
	{
		double tempDouble = variablesArray[currentEquation][currentVariable];

		for (int count = 0; count < xValues.size() + 1; count++)
		{
			variablesArray[currentEquation][count] /= tempDouble;
		}
	}

	private void plugIn(int equationFrom, int equationTo, int currentVariable)
	{
		double tempDouble = variablesArray[equationTo][currentVariable];
		for (int count = 0; count < xValues.size() + 1; count++)
		{
			variablesArray[equationTo][count] -= (variablesArray[equationFrom][count] * tempDouble);
		}
	}

	public double getValue(double xInput)
	{
		double yReturn = 0;
		yReturn = 0;

		for (int count = 0; count < answers.size(); count++)
		{
			yReturn += answers.get(count)
					* Math.pow(xInput, answers.size() - count - 1);
		}

		return yReturn;
	}
}
