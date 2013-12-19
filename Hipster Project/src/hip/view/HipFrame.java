package hip.view;

import javax.swing.JFrame;

import hip.controller.HipController;

/**
 * Makes the frame that later makes a panel.
 * 
 * @author Jalen Morgan
 * @version 1.0
 */
public class HipFrame extends JFrame
{

	private HipController baseController;
	private HipPanel basePanel;

	/**
	 * Constructor makes a panel object to use inside the frame.
	 * 
	 * @param baseController
	 *            The control object used in the Hipster project.
	 */
	public HipFrame(HipController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipPanel(baseController);

		setupFrame();
	}

	/**
	 * Sets up the frame by setting size, adding the panel, and making it
	 * visible.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(640, 480);
		this.setVisible(true);
	}

}
