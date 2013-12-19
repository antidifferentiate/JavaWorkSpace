package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import controller.Control;

/**
 * 
 * @author Jalen Morgan
 * @version 1.2
 */
public class GUIPanel extends JPanel
{

	private Control baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	
	public GUIPanel(Control baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		firstButton = new JButton("my first button!!!!");
		secondButton = new JButton("second one");
		thirdButton = new JButton("Here's another");
		baseLayout.putConstraint(SpringLayout.NORTH, thirdButton, 6, SpringLayout.SOUTH, secondButton);
		baseLayout.putConstraint(SpringLayout.WEST, thirdButton, 0, SpringLayout.WEST, firstButton);
		
		setupPanel();
		setupLayout();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
		this.add(thirdButton);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 61, SpringLayout.NORTH, this);
	}
}
