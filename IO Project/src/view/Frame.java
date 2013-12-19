package view;

import javax.swing.JFrame;

import controller.Controller;

/**
 * Frame for the IO probject
 * @author Jalen Morgan
 * @version 1.0 13/12/2013
 *
 */
public class Frame extends JFrame
{
	/**
	 * Controller is the control object.
	 * universalPanel for the frame
	 */
	private Controller universalController;
	private Panel universalPanel;

	/**
	 * Constructor for the IO Frame.
	 * @param universalController The Controller passes it for MVC relationship.
	 */
	public Frame(Controller universalController)
	{
		this.universalController = universalController;
		universalPanel = new Panel(universalController);

		setupFrame();
	}

	/**
	 * Sets up the frame size and loads the content panel.
	 */
	private void setupFrame()
	{
		this.setContentPane(universalPanel);
		this.setSize(467, 300);
		this.setVisible(true);
	}
}
