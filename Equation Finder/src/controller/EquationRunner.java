package controller;

/**
 * Equation Runner begins the program with psvm.
 * 
 * @author Jalen Morgan
 * @version 0.5
 */
public class EquationRunner
{
	/* ********************** PSVM ****************** */
	/**
	 * Psvm begins the program by creating a controller.
	 * 
	 * @param args
	 *            psvm argument.
	 */
	public static void main(String[] args)
	{
		EquationController baseController = new EquationController();
		baseController.start();
	}

}
