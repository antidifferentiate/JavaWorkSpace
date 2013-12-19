package view;

import javax.swing.JFrame;

import controller.LoopController;

public class LoopFrame extends JFrame
{

	private LoopController baseController;
	private LoopPanel basePanel;

	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(this.baseController);

		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(546, 480);
		this.setVisible(true);
	}

}
