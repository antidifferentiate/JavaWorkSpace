package first.view;

import javax.swing.JOptionPane;
import first.model.StupidThingyClass;
import first.model.Friend;

public class FirstGUI
{
	//Declaration section;  Data members go here.
	private StupidThingyClass myGUIThingy;
	private Friend davidFriend;
	private Friend tristenFriend;
	private Friend jalenFriend;
	private Friend imaginaryFriend;
	
	String name;
	String interest;
	String humorStyle;
	double weight;
	int age;
	boolean likesPineapple;
	String pineappleAnswer;
	String myAnswer;
	
	public FirstGUI()
	{
		myGUIThingy = new StupidThingyClass();
		
	}
	
	public void start()
	{		
		makeFriends();
		showAndTell();	
	}
	
	private void setTristenValues()
	{
		name = JOptionPane.showInputDialog("What is Tristan's name?");
		interest = JOptionPane.showInputDialog("What is Tristan's Interest?");
		humorStyle = JOptionPane.showInputDialog("What is Tristan's Humor Style?");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("What is Tristan's Weight?"));
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is Tristan's age?"));
		pineappleAnswer = JOptionPane.showInputDialog("Does Tristan like pineapple?");
		if (pineappleAnswer.equals("yes"))
			likesPineapple = true;
		else
			likesPineapple = false;
		
		tristenFriend = new Friend(name,humorStyle,age,interest,likesPineapple,weight);
		
	}
	
	private void setJalenValues()
	{
		name = JOptionPane.showInputDialog("What is Jalen's name?");
		interest = JOptionPane.showInputDialog("What is Jalen's Interest?");
		humorStyle = JOptionPane.showInputDialog("What is Jalen's Humor Style?");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("What is Jalen's Weight?"));
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is Jalen's age?"));
		pineappleAnswer = JOptionPane.showInputDialog("Does Jalen like pineapple?");
		if (pineappleAnswer.equals("yes"))
			likesPineapple = true;
		else
			likesPineapple = false;
		
		jalenFriend = new Friend(name,humorStyle,age,interest,likesPineapple,weight);
	}
	
	private void setDavidValues()
	{
		name = JOptionPane.showInputDialog("What is David's name?");
		interest = JOptionPane.showInputDialog("What is David's Interest?");
		humorStyle = JOptionPane.showInputDialog("What is David's Humor Style?");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("What is David's Weight?"));
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is David's age?"));
		pineappleAnswer = JOptionPane.showInputDialog("Does David like pineapple?");
		if (pineappleAnswer.equals("yes"))
			likesPineapple = true;
		else
			likesPineapple = false;
		
		davidFriend = new Friend(name,humorStyle,age,interest,likesPineapple,weight);
	}
	
	private void setImaginaryValues()
	{
		name = JOptionPane.showInputDialog("What is Imaginary Friend's name?");
		interest = JOptionPane.showInputDialog("What is Imaginary Friend's Interest?");
		humorStyle = JOptionPane.showInputDialog("What is Imaginary Friend's Humor Style?");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("What is Imaginary Friend's Weight?"));
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is Imaginary Friend's age?"));
		pineappleAnswer = JOptionPane.showInputDialog("Does Imaginary Friend like pineapple?");
		if (pineappleAnswer.equals("yes"))
			likesPineapple = true;
		else
			likesPineapple = false;
		
		davidFriend = new Friend(name,humorStyle,age,interest,likesPineapple,weight);
	}

	
	private void makeFriends()
	{
	davidFriend = new Friend("David","Sarcasm",16,"making friend; pina coladas; programming friends #yoloswag #swag",true,147.6928);
	tristenFriend = new Friend("Tristan","Funny",16,"pina colada, getting caught in the rain.  Not into health foods.",true,145);
	jalenFriend = new Friend("Jalen","Not funny",17,"pina colada and getting caught in the rain. And sleeping too.",true,140.32);
	imaginaryFriend = new Friend("Imaginary Friend","hilarious",0, "being real",true,0);
	}
	
	private void showAndTell()
	{
		
		JOptionPane.showMessageDialog(null,
		jalenFriend.getName() + " is " + 
		jalenFriend.getAge() + " years old and weighs " + 
		jalenFriend.getWeight() + ".\n  He likes " + 
		jalenFriend.getInterest() + ".\n  The fact, I like pineapple, is " +
		jalenFriend.getPineapple() + ".\n  His humor style is " + 
		jalenFriend.getHumorStyle() + ".");
		
		JOptionPane.showMessageDialog(null,
		imaginaryFriend.getName() + " is " + 
		imaginaryFriend.getAge() + " years old and weighs " + 
		imaginaryFriend.getWeight() + ".\n  He likes " + 
		imaginaryFriend.getInterest() + ".\n  The fact, I like pineapple, is " +
		imaginaryFriend.getPineapple() + ".\n  His humor style is " + 
		imaginaryFriend.getHumorStyle() + ".");
		
		JOptionPane.showMessageDialog(null,
		davidFriend.getName() + " is " + 
		davidFriend.getAge() + " years old and weighs " + 
		davidFriend.getWeight() + ".\n  He likes " + 
		davidFriend.getInterest() + ".\n  The fact, I like pineapple, is " +
		davidFriend.getPineapple() + ".\n  His humor style is " + 
		davidFriend.getHumorStyle() + ".");
		
		JOptionPane.showMessageDialog(null,
		tristenFriend.getName() + " is " + 
		tristenFriend.getAge() + " years old and weighs " + 
		tristenFriend.getWeight() + ".\n  He likes " + 
		tristenFriend.getInterest() + ".\n  The fact, I like pineapple, is " +
		tristenFriend.getPineapple() + ".\n  His humor style is " + 
		tristenFriend.getHumorStyle() + ".");
	
		askForChanges();
	}
	
	private void askForChanges()
	{
		String myStringAnswer = JOptionPane.showInputDialog("Who do you want to change?  (tristan, david, imaginary, or jalen)");
		if (myStringAnswer.equalsIgnoreCase("tristan"))
		{
			setTristenValues();
			showAndTell();
		}
		else
		if (myStringAnswer.equalsIgnoreCase("david"))
		{
			setDavidValues();
			showAndTell();
		}
		else
		if (myStringAnswer.equalsIgnoreCase("jalen"))
		{
			setJalenValues();
			showAndTell();
		}
		else
		if (myStringAnswer.equalsIgnoreCase("imaginary"))
		{
			setImaginaryValues();
			showAndTell();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I don't get it.");
		}
	}
	
	
	private void interact()
	{
		String answer;
		JOptionPane.showMessageDialog(null, "Let's chat");
		answer = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "hi there " + answer);
		//If I click the x, null is my name.
		//cancel is the same as pressing red x.
	}
	
	private void meetTheThingyGUI()
	{
		JOptionPane.showMessageDialog(null, "Here is a Thingy:  " + myGUIThingy.getName());
		JOptionPane.showMessageDialog(null, "What do you want to change my name to?");
		
		String newName = JOptionPane.showInputDialog(">_ ");
		
		JOptionPane.showMessageDialog(null, "Are you really sure you want my name to be:  " + newName + "?  (yes/no)");
		
		String yesNo = JOptionPane.showInputDialog(">_ ");
		
		if (yesNo.equals("yes"))
		{
			myGUIThingy.setName(newName);
			meetTheThingyGUI();
		}
		else if (yesNo.equals("no"))
		{
			JOptionPane.showMessageDialog(null, "I never liked the name " + newName + " anyway.");
			meetTheThingyGUI();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I don't understand " + yesNo);
			meetTheThingyGUI();
			
		}
	}
	
	private void checkWrapper()
	{
		int age;
		
		JOptionPane.showMessageDialog(null, "Hi, lets try something new.");
		String temp = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(temp);
		
		JOptionPane.showMessageDialog(null, "In 3 years, you will be " + (3 + age) + " years old!");
	//parseInt reads a number from a parameter.
	}
	
}

