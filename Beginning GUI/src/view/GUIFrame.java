package view;

import javax.swing.JFrame;

import controller.Control;

/**
 * Framework for a GUI Frame class.
 * @author Jalen Morgan
 * @version 1.3 10/22/13
 */
public class GUIFrame extends JFrame
{
	private Control baseController;
	private GUIPanel basePanel;
	
	public GUIFrame(Control baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(640,480);
		this.setVisible(true);
	}
}