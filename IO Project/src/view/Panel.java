package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.Game;
import controller.Controller;

public class Panel extends JPanel
{
	/* ******* Declaration Section ******** */
	private Controller universalController;
	private JButton saveButton;
	private JButton loadButton;
	private JTextField titleField;
	private JTextField rankingField;
	private JTextArea rulesArea;
	private JLabel rulesLabel;
	private JLabel rankingLabel;
	private JLabel titleLabel;
	private SpringLayout baseLayout;
	private JLabel gameCountLabel;

	/* ******* Constructors ******** */
	public Panel(Controller universalController)
	{
		this.universalController = universalController;

		createParts();

		setupPanel();
		setupLayout();
		setupListener();
	}

	/* ******* Setting up everything ******** */
	/**
	 * Create all the objects that will be displayed in the panel.
	 */
	private void createParts()
	{
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");

		rankingField = new JTextField(5);
		rankingLabel = new JLabel("Game Ranking:  ");
		titleField = new JTextField(15);
		titleLabel = new JLabel("Game Title:  ");

		rulesArea = new JTextArea(5, 20);
		rulesLabel = new JLabel("Game Rules:  ");

		gameCountLabel = new JLabel("Current game count:");

		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.SOUTH, gameCountLabel, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gameCountLabel, 0, SpringLayout.EAST, this);

	}

	/**
	 * Add all the components to the Panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(rankingField);
		this.add(rankingLabel);
		this.add(rulesArea);
		this.add(rulesLabel);
		this.add(saveButton);
		this.add(loadButton);
		this.add(titleField);
		this.add(titleLabel);
		this.add(gameCountLabel);

		this.setBackground(Color.lightGray);
	}

	/**
	 * Format all the parts of the panel
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, saveButton, 0,
				SpringLayout.NORTH, loadButton);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 6,
				SpringLayout.EAST, loadButton);
		baseLayout.putConstraint(SpringLayout.NORTH, loadButton, 2,
				SpringLayout.SOUTH, rulesArea);
		baseLayout.putConstraint(SpringLayout.WEST, loadButton, 0,
				SpringLayout.WEST, rankingField);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -12,
				SpringLayout.NORTH, rankingLabel);
		baseLayout.putConstraint(SpringLayout.WEST, titleField, 0,
				SpringLayout.WEST, rankingField);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleField, -6,
				SpringLayout.NORTH, rankingField);
		baseLayout.putConstraint(SpringLayout.NORTH, rulesLabel, 95,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, rankingLabel, -348,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, rankingLabel, -9,
				SpringLayout.NORTH, rulesLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rankingField, 6,
				SpringLayout.EAST, rankingLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, rankingField, -6,
				SpringLayout.NORTH, rulesArea);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 0,
				SpringLayout.WEST, rankingLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rulesArea, 98,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, rulesLabel, -360,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, rulesArea, 18,
				SpringLayout.EAST, rulesLabel);
	}

	private void setupListener()
	{
		saveButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent click)
			{
				Game tempGame = universalController.makeGameFromInput(
						titleField.getText(), rankingField.getText(),
						rulesArea.getText());
				if (tempGame != null)
				{
					universalController.saveGameInformation(tempGame);
					gameCountLabel.setText("Current game count:  " + universalController.getProjectGames().size());
				}
				else
				{
					JOptionPane.showMessageDialog(null,
							"Try again with a valid number");
				}
			}
		});

		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Game tempGame = universalController.readGameInformation();
				if (tempGame != null)
				{
					titleField.setText(tempGame.getGameTitle());
					rankingField.setText(Integer.toString(tempGame
							.getFunRanking()));
					String temp = "";
					for (String currentRule : tempGame.getGameRules())
					{
						temp += currentRule + "\n";
					}
					rulesArea.setText(temp);
				}
				else
				{
					JOptionPane.showMessageDialog(null,
							"Check the save file make sure it is in order.");
				}
			}
		});
	}
}
