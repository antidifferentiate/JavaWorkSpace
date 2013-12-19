package bot.view;

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

import bot.controller.StartController;
import bot.model.ChatBot;

public class ChatBotPanel extends JPanel
{
	private StartController baseController;
	private JButton submitButton;
	private JTextField userInputField;
	private JTextArea chatArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	private JScrollBar scrollBar;
	private ChatBot appBot;
	private int clickCount;
	String computerReply;

	public ChatBotPanel(StartController baseController)
	{
		computerReply = "Hello, my name is chatbot-tle.  Ask me a question.";
		
		clickCount = 0;
		this.baseController = baseController;
		this.appBot = baseController.getCleverBot();

		
		submitButton = new JButton("Submit this to the Chatbot!");
		userInputField = new JTextField(30);
		chatArea = new JTextArea(10,30);
		textPane = new JScrollPane(chatArea);
		scrollBar = textPane.createVerticalScrollBar();
	
		baseLayout = new SpringLayout();


		setupPanel();
		setupLayout();
		setupListeners();

		startChat();
	}

	private void startChat()
	{
		chatArea.setText(appBot.getOutput(""));

	}

	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(userInputField);
		this.add(textPane);	
		this.add(scrollBar);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);

	}

	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 17, SpringLayout.SOUTH, textPane);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 17, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 17, SpringLayout.SOUTH, submitButton);
		baseLayout.putConstraint(SpringLayout.WEST, userInputField, 102, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 143, SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent click)
			{
				clickCount++;
				
				String currentInput = userInputField.getText();
				chatArea.append("\n" + currentInput);
				
				appBot.addToArray(computerReply, currentInput);	
				
				computerReply = appBot.getOutput(currentInput);
				chatArea.append("\n" + computerReply);
				
				if (clickCount % 7 == 0)
				{
					String currentConversation = baseController.processConversation();
					System.out.println("point reached.");
					if (currentConversation.length() != 0)
					{
						
						chatArea.append("\n" + currentConversation);
					}

				}
				scrollBar.setValue(scrollBar.getMaximum());
			}

		});

	}
}
