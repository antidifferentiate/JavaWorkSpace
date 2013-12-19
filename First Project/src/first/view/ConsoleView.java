package first.view;

import java.util.Scanner;
import first.model.StupidThingyClass;


public class ConsoleView
{
	private Scanner wordScanner; 	
	private StupidThingyClass testThing;
	
	int someNumber = 10;
	int location = 1;
	boolean mailboxIsOpen = false;
	
	
	String firstPlace = "";
	String secondPlace = "";
	String thirdPlace = "";
	
	String testString = "Hi";
	
	public ConsoleView()  //CONSTRUCTORS
	{
		wordScanner = new Scanner(System.in);
		testThing = new StupidThingyClass();
	}
	
	private void meetTheThingy()
	{
		
		System.out.println("Here is a Thingy:  " + testThing.getName());
		System.out.println("What do you want to change my name to?");
		System.out.print(">_ ");
		
		String newName = wordScanner.nextLine();
		
		System.out.print("Are you really sure you want my name to be:  ");
		System.out.println(newName + "?  (yes/no)");
		
		System.out.print(">_ ");
		String yesNo = wordScanner.nextLine().toLowerCase();
		
		if (yesNo.equals("yes"))
		{
			testThing.setName(newName);
			meetTheThingy();
		}
		else if (yesNo.equals("no"))
		{
			System.out.println("I never liked the name " + newName + "anyway.");
			meetTheThingy();
		}
		else
		{
		
			System.out.println("I don't understand " + yesNo);
			meetTheThingy();
			
		}
				
	}

	private void reallyMeetTheThingy()
	{
		System.out.println("Hello, "+ testThing.getName() + ".  I hear you like eating "+ testThing.getFood() + ", and your favorite movie is " + testThing.getMovie() + ".");
		System.out.println("Is this information correct?  (yes/no)");
		String yesNo = wordScanner.nextLine().toLowerCase();
		
		if (yesNo.equals("no"))
		{
			System.out.println("What do I need to change?  (movie, name, or food)");
			String changingThing = wordScanner.nextLine().toLowerCase();
			
			if (changingThing.equals("movie"))
			{
				System.out.println("What is your favorite movie?");
				String newValue = wordScanner.nextLine();
				System.out.println("Are you sure your favorite movie is " + newValue + "?  (yes/no)");
				String answer = wordScanner.nextLine().toLowerCase();
				if (answer.equals("yes"))
				{
					testThing.setMovie(newValue);
					reallyMeetTheThingy();
				}
				else
				{
					reallyMeetTheThingy();
				}
			}
			else if (changingThing.equals("name"))
			{
				System.out.println("What is your name?");
				String newValue = wordScanner.nextLine();
				System.out.println("Are you sure? (yes/no)");
				String answer = wordScanner.nextLine().toLowerCase();
				if (answer.equals("yes"))
				{
					testThing.setName(newValue);
					reallyMeetTheThingy();
				}
				else
				{
					reallyMeetTheThingy();
				}
			}
			else if (changingThing.equals("food"))
			{
				System.out.println("What is your favorite food?");
				String newValue = wordScanner.nextLine();
				System.out.println("Are you sure your favorite food is " + newValue + "? (yes/no)");
				String answer = wordScanner.nextLine().toLowerCase();
				if (answer.equals("yes"))
				{
					testThing.setFood(newValue);
					reallyMeetTheThingy();
				}
				else
				{
					reallyMeetTheThingy();
				}
			}
			else
			{
				System.out.println("I don't understand " + changingThing);
				reallyMeetTheThingy();
			}
		}
		else if (yesNo.equals("yes"))
		{
			System.out.println("Ok, great!  Would you like to play zork or try running meetTheThingy?  (zork/thingy)");
			String newScript = wordScanner.nextLine().toLowerCase();
			if (newScript.equals("zork"))
			{
				start();
			}
			else if (newScript.equals("thingy"))
			{
				meetTheThingy();
			}
		}
		else
		{
			System.out.println("Huh?  I don't understand what " + yesNo + " means.");
			reallyMeetTheThingy();
		}
	}
	
	public void checkForAnswer()
	{
		if (location == 1)
		{
			
			if (testString.equals("open mailbox"))
			{
				if (mailboxIsOpen == false)
				{
					System.out.println("Opening the mailbox reveals:");
					System.out.println("A leaflet.");
					mailboxIsOpen = true;
					getWords();
				}
				else
				{
					System.out.println("It is already open.");
					getWords();		
				}
			}
			else
			if (testString.equals("close mailbox"))
			{
				if (mailboxIsOpen == false)
				{
					System.out.println("It is already closed");
					getWords();
				}
				else
				{
					System.out.println("Closed.");
					mailboxIsOpen = false;
					getWords();
				}				
			}
			else
			if (testString.equals("read leaflet"))
			{
				if (mailboxIsOpen == true)
				{
				System.out.println("Welcome to Zork (originally Dungeon) !\n");
				System.out.println("Dungeon is a game of adventure, danger, and low cunning!\n");
				start();
				}
				else
				{
				System.out.println("What leaflet? \n");
				start();
				}
			}
			else
			if (testString.equals("w"))
			{
				location = 2;
				start();
			}
			else
			if (testString.equals("e"))
			{
				System.out.println("The door is locked, and there is evidently no key");
				getWords();
			}
			else
			{
				System.out.println("I don't understand that.");
				start();
			}
		}
		else
		if (location == 2)
		{
			if (testString.equals("e"))
			{
				location = 1;
				start();
			}
		}
	}
	
	public void start()
	{
		showLocation();
		getWords(); 
		//meetTheThingy();
		
	}
	public void startEverything()
	{
		reallyMeetTheThingy();
	}

	public void showLocation()
	{
		
		if (location == 1)
		{
			firstPlace = "West of House";
			secondPlace = "You are standing in an open field west of a white house, with a boarded front door.";
			thirdPlace = "There is a small mailbox here.";
		}
		else
		if (location == 2)
		{
			firstPlace = "";
			secondPlace = "Forest";
			thirdPlace = "You are in a forest, with trees in all directions around you.";
		}
		System.out.println(firstPlace);
		System.out.println(secondPlace);
		System.out.println(thirdPlace);
		
	}
	
	public void getWords() 
	{ 
		System.out.print(">_ ");
		testString = wordScanner.nextLine();
		checkForAnswer();
	}
	
	public void show()
	{
		//shows something...
		System.out.println("Hello World!");			//says hello world with a new line.
		System.out.println("You Are In A Field");
		System.out.print("Say something");	
		System.out.println("  Welcome to Zork II");
		System.out.println(someNumber + " is your number");	
	}
	
}
