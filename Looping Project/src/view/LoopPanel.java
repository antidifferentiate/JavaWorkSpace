package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import controller.LoopController;

public class LoopPanel extends JPanel
{
	private LoopController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private JTextArea loopArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private JScrollBar scrollBar;
	String computerReply;

	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;

		submitButton = new JButton("This is a button.");
		userInputField = new JTextField(30);
		loopArea = new JTextArea(10, 30);
		textPane = new JScrollPane(loopArea);
		scrollBar = textPane.createVerticalScrollBar();

		baseLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);

		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);
		this.add(scrollBar);
		this.setBackground(Color.BLACK);

		loopArea.setEditable(false);
		loopArea.setLineWrap(true);
		loopArea.setWrapStyleWord(true);

	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 28,
				SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 162,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -160,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 6,
				SpringLayout.SOUTH, submitButton);
		baseLayout.putConstraint(SpringLayout.EAST, userInputField, 0,
				SpringLayout.EAST, textPane);

		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 17,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 102,
				SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				loopArea.append(baseController.getLoopResults());
			}

		});

	}

}
