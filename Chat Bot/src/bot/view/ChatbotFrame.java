package bot.view;

import javax.swing.JFrame;

import bot.controller.StartController;

public class ChatbotFrame extends JFrame
{
	private StartController baseController;
	private ChatBotPanel basePanel;
	
	public ChatbotFrame(StartController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatBotPanel(baseController);
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(640,480);
		this.setVisible(true);
	}
	
}
