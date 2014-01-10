package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.EquationController;

@SuppressWarnings("serial")
public class EquationPanel extends JPanel
{
	/* ************* Declaration Section ************* */
	/**
	 * baseController - The Control object being used to control the problem.
	 */
	EquationController baseController;

	/**
	 * baseFrame - The Frame object being used for the GUIFrame.
	 */
	EquationFrame baseFrame;

	private SpringLayout baseLayout;
	private JButton addButton;
	private JButton removeButton;
	private JButton graphButton;
	private JComboBox<String> dropDownVariables;

	/* ************* Constructors ******************** */
	/**
	 * Constructor, creating the EquationPanel and giving it the
	 * 
	 * @param baseController
	 * @param baseFrame
	 */
	public EquationPanel(EquationController baseController,
			EquationFrame baseFrame)
	{
		this.baseController = baseController;
		this.baseFrame = baseFrame;

		createParts();
		addParts();
		setupListener();
		formatParts();

	}

	/* ************* Create Methods ****************** */
	/**
	 * Create all the parts that we are adding into the gui.
	 */
	public void createParts()
	{

		addButton = new JButton("Add");
		removeButton = new JButton("Remove");
		graphButton = new JButton("Graph");
		dropDownVariables = new JComboBox<String>();
		baseLayout = new SpringLayout();
		this.setOpaque(false);
	}

	public void addParts()
	{
		this.add(addButton);
		this.add(removeButton);
		this.add(graphButton);
		this.add(dropDownVariables);
		this.setLayout(baseLayout);
	}

	public void formatParts()
	{
		baseLayout.putConstraint(SpringLayout.WEST, addButton, 40,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, addButton, -10,
				SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, removeButton, 168,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, removeButton, -160,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, graphButton, 6,
				SpringLayout.EAST, removeButton);

		baseLayout.putConstraint(SpringLayout.EAST, addButton, -6,
				SpringLayout.WEST, removeButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, dropDownVariables, -6,
				SpringLayout.NORTH, addButton);
		baseLayout.putConstraint(SpringLayout.NORTH, graphButton, 6,
				SpringLayout.SOUTH, dropDownVariables);
		baseLayout.putConstraint(SpringLayout.NORTH, removeButton, 6,
				SpringLayout.SOUTH, dropDownVariables);
		baseLayout.putConstraint(SpringLayout.EAST, graphButton, 0,
				SpringLayout.EAST, dropDownVariables);
		baseLayout.putConstraint(SpringLayout.WEST, dropDownVariables, 40,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, dropDownVariables, -37,
				SpringLayout.EAST, this);

	}

	private void setupListener()
	{
		addButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent click)
			{
				dropDownVariables.addItem(""
						+ Double.parseDouble(inputMessage("Point X:")) + ", "
						+ Double.parseDouble(inputMessage("Point Y:")));
			}
		});

		removeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if (dropDownVariables.getModel().getSize() > 0)
				{
					dropDownVariables.removeItemAt(dropDownVariables
							.getSelectedIndex());
				}
			}
		});

		graphButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				ArrayList<Double> xValues = new ArrayList<Double>();
				ArrayList<Double> yValues = new ArrayList<Double>();

				for (int i = 0; i < dropDownVariables.getModel().getSize(); i++)
				{
					String tempString = dropDownVariables.getItemAt(i);
					int tempIndex = tempString.indexOf(", ");
					xValues.add(Double.parseDouble(tempString.substring(0,
							tempIndex)));
					yValues.add(Double.parseDouble(tempString.substring(
							tempIndex + 2, tempString.length())));

				}

				repaint();
			}
		});

		dropDownVariables.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent changed)
			{
				repaint();
			}
		});
	}

	/* ************* Methods ************************* */
	/**
	 * Output a message to the user.
	 * 
	 * @param outputString
	 *            - The String that we are going to output to the user.
	 */
	public void outputMessage(String outputString)
	{
		JOptionPane.showMessageDialog(null, outputString);
	}

	/**
	 * Output a message and ask the user for input.
	 * 
	 * @param outputString
	 *            - The string we are going to output to the user.
	 * @return - The String the user has typed in.
	 */
	public String inputMessage(String outputString)
	{
		String inputString = new String();
		inputString = JOptionPane.showInputDialog(outputString);
		try
		{
			inputString = Double.toString(Double.parseDouble(inputString));
		}
		catch (Exception e)
		{
			return "0";
		}
		return inputString;
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, 100, 100);

		super.paint(g);

	}
}
