package view;

import java.awt.Color;

import javax.swing.JFrame;

import controller.EquationController;

/**
 * Frame for the equationProject
 * 
 * @author Jalen Morgan
 * @version 1.0 13/12/2013
 * 
 */
@SuppressWarnings("serial")
public class EquationFrame extends JFrame
{
	/* ************* Declaration Section ******** */
	/**
	 * baseController is the control object.
	 */
	@SuppressWarnings("unused")
	private EquationController baseController;

	/**
	 * basePanel is the panel object.
	 */
	private EquationPanel basePanel;

	/* ************* Constructors *************** */
	/**
	 * Constructor for the Equation Frame.
	 * 
	 * @param universalController
	 *            The Controller passes it for MVC relationship.
	 */
	public EquationFrame(EquationController universalController)
	{
		this.baseController = universalController;
		basePanel = new EquationPanel(universalController, this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setupFrame();
	}

	/* ************* Methods ******************** */
	/**
	 * Returns the Panel object. Used by the controller to get the panel.
	 * 
	 * @return
	 */
	public EquationPanel getPanel()
	{
		return basePanel;
	}

	/**
	 * Sets up the frame size and loads the content panel.
	 */
	private void setupFrame()
	{
		this.setBackground(new Color(230, 230, 230));
		this.setContentPane(basePanel);
		this.setSize(467, 300);
		this.setVisible(true);

	}
}
