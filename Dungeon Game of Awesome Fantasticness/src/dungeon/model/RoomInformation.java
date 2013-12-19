package dungeon.model;

import java.util.ArrayList;

public class RoomInformation
{

	private ArrayList<String> roomName;
	private ArrayList<String> roomDescription;
	private ArrayList<String> roomOptionOne;
	private ArrayList<String> roomOptionTwo;
	private ArrayList<String> roomResultOne;
	private ArrayList<String> roomResultTwo;
	private ArrayList<Integer> roomOrderOne;
	private ArrayList<Integer> roomOrderTwo;
	private int currentRoom;

	public RoomInformation()
	{
		roomName = new ArrayList<String>();
		roomDescription = new ArrayList<String>();
		roomOptionOne = new ArrayList<String>();
		roomOptionTwo = new ArrayList<String>();
		roomResultOne = new ArrayList<String>();
		roomResultTwo = new ArrayList<String>();
		currentRoom = 0;
		roomOrderOne = new ArrayList<Integer>();
		roomOrderTwo = new ArrayList<Integer>();
		fillRoomName();
		fillRoomDescription();
		fillRoomOptionOne();
		fillRoomOptionTwo();
		fillRoomResultOne();
		fillRoomResultTwo();
		fillRoomOrderOne();
		fillRoomOrderTwo();
	}

	private void fillRoomOrderOne()
	{
		roomOrderOne.add(1);
		roomOrderOne.add(2);
		roomOrderOne.add(-1);
		roomOrderOne.add(6);
		roomOrderOne.add(5);
		roomOrderOne.add(8);
		roomOrderOne.add(10);
		roomOrderOne.add(-1);
		roomOrderOne.add(3);
		roomOrderOne.add(8);
		roomOrderOne.add(-1);
		roomOrderOne.add(12);
		roomOrderOne.add(-1);
		roomOrderOne.add(-1);
		roomOrderOne.add(-1);
	}

	private void fillRoomOrderTwo()
	{
		roomOrderTwo.add(1);  //0
		roomOrderTwo.add(3);	//1
		roomOrderTwo.add(4);
		roomOrderTwo.add(-1);
		roomOrderTwo.add(7);
		roomOrderTwo.add(9);
		roomOrderTwo.add(10);
		roomOrderTwo.add(5);
		roomOrderTwo.add(9);
		roomOrderTwo.add(6);
		roomOrderTwo.add(11); //10
		roomOrderTwo.add(13); //11
		roomOrderTwo.add(13); //12
		roomOrderTwo.add(14); //12
		roomOrderTwo.add(-1);
		


	}

	private void fillRoomName()
	{
		roomName.add("Dark Alley Way"); // room ID 0
		roomName.add("Alley Exit"); // room ID 1
		roomName.add("below trap door");// room ID 2
		roomName.add("Abandoned Street");// room ID 3
		roomName.add("Pool of sewage below magical waterfall of happiness"); // ID 4
		roomName.add("dark passage");// room ID 5
		roomName.add("Hospital room");// room ID 6
		roomName.add("Darker Passage");// room ID 7
		roomName.add("Yellow Wood");// room ID 8
		roomName.add("Limbo");// ID 9
		roomName.add("The Beach");//ID 10
		roomName.add("Bossy Yacht");//ID 11
		roomName.add(" On The Yacht");//ID 12
		roomName.add("Walk the Plank");//ID 13
		roomName.add("Home");// Room 3435

	}

	private void fillRoomDescription()
	{
		roomDescription
				.add("You are in a dark alleyway, at night, like a "
						+ "fool. As you move to exit the alley, a man slips out from the shadows."
						+ " He seems hungry, unfortunately he thinks that you will provide "
						+ "him with a meal, hopefully from your purse.");// Room ID 0

		roomDescription
				.add("As you begin to leave the alley way, you notice a slightly opened door.");// room
																								// 1

		roomDescription
				.add("After you recover from falling you get up " + ""
						+ "and see several giant rats coming towards you.");// room ID 2
		roomDescription
				.add("There is a car speeding towards"
						+ " you and you are about to get hit.");// room ID 3
																							
																							
		roomDescription
				.add(" Well, there’s not much to do here. " + 
						"A dark passage leads to the right, " + 
						"and a darker passage leads to the left.");// room ID 4
																																		// ID
																																		// 4
		roomDescription
				.add("This passage is completely dark, you are likely to be eaten by a " 
						+ "(censored because we can’t afford to buy the copyright). " + 
						"You can travel through this passage by feel. You find a fork in "
						+ "the road. There is a ruddy orange light coming from the "
						+ "left passage, and a cool blue light coming from the right.");// room ID 5
																																																																																		// ID
																																																																																		// 5
		roomDescription
				.add("There is nobody in the room but you and"
						+ " an almost dead-looking person.  The door"
						+ " is slightly cracked open.  There is a "
						+ "red button by your bed.");// room ID 6
																																										// ID
																																										// 6
		roomDescription.add(" It is dark in here.  You can’t see a thing. "
				+ " You’ll likely be eaten by something copyrighted.");// room ID 7
		
		roomDescription.add("Two roads diverged in a yellow wood.  There is a fork in the road.");// room ID 8
		
		roomDescription.add("You are in Limbo my friend. There is a completely black floor,"
				+ " or at least you think there is a floor, it sort of feels like a floor."
				+ " You can't discern any features, just a blackness surrounding you,"
				+ " but you can tell that it isn’t dark because you can see yourself "
				+ "as though you were standing in the full light of day, there just "
				+ "is absolutely nothing else to see.");// room ID 9
		
		roomDescription.add("As you exit the hospital room, you realize that this is no hospital."
				+ " You are standing on the beach, with a horde of cannibals that were waiting to eat you."
				+ " There is a large yacht docked nearby. What will you do?");// room ID 10
		
		roomDescription.add(" You are now on a yacht, safe from any cannibals.  "
				+ "The safety is short-lived.  A crime boss sees you and asks in a boss-like accent "
				+ "“What’re yoo doin’ on ma ship?");// room ID 11
		
		roomDescription.add("The boss accepts you as a part of his crew. "
				+ " You now wonder what you have done.");// room ID 12
		
		
		roomDescription.add(" “We’re not a crew of pirates!”  "
				+ "shouts the boss angrily.  You must walk the plank.");// room ID 13

		roomDescription
				.add(" Congratulations! You have finally reached your house! As you "
						+ "lie down to sleep, a derailed train crashes through"
						+ " your bedroom.");// Room
											// 3435
	}

	private void fillRoomOptionOne()
	{
		roomOptionOne.add("Attack Desperate Thief");// Room 0
		roomOptionOne.add("Go through Door"); // Room 1
		roomOptionOne.add("Attack the rats");// Room ID 2
		roomOptionOne.add("Stay where you are");// Room ID 3
		roomOptionOne.add(" Go right, into the dark passage");// Room ID 4
		roomOptionOne.add(" Go Left, toward the Orange Light. ");// Room ID 5
		roomOptionOne.add("Get up and leave");// Room ID 6
		roomOptionOne.add("sleep");// Room ID 7
		roomOptionOne.add("Go left");// Room ID 8
		roomOptionOne.add("Wait where you are for twelve years.");// Room ID 9
		roomOptionOne.add("Fight the cannibals");// Room ID 10
		roomOptionOne.add("“I would like to join yo cruw of gangstas”");// Room ID 11
		roomOptionOne.add("spend an eternity in servitude.");// Room ID 12
		roomOptionOne.add("beg for your life.");// Room ID 13
		roomOptionOne.add("Die");// Room 3435
	}

	private void fillRoomOptionTwo()
	{
		roomOptionTwo.add("Hand over your purse");// Room 0
		roomOptionTwo.add("Exit Alley Way"); // Room 1
		roomOptionTwo.add("Run away as fast as you can"); // Room ID 2
		roomOptionTwo.add("Run away"); // Room ID 3
		roomOptionTwo.add("Go left, into the darker passage"); // Room ID 4 
		roomOptionTwo.add("Go Right toward the Blue Light."); // Room ID 5
		roomOptionTwo.add("Press The button"); // Room ID 6
		roomOptionTwo.add("go into slightly less dark passageway"); // Room ID 7
		roomOptionTwo.add("take fork");// ID 8
		roomOptionTwo.add("Wander to looking for an exit.");// ID 9
		roomOptionTwo.add("Jump on the yacht and speed away.");// ID 10
		roomOptionTwo.add("“Aye, matey, I wish to be a part of yer crew”");// ID 11
		roomOptionTwo.add("become a pirate");// ID 12
		roomOptionTwo.add("accept your fate");// ID 13
		roomOptionTwo
				.add("Die more slowly (It REALLY doesn’t make much difference.)");// Room
																					// 3435
	}

	private void fillRoomResultOne()
	{
		roomResultOne
				.add("You dive forward and jump off the wall, like a ninja, and get"
						+ " close enough to open up his jugular with your teeth.");// Room
																					// 0
		roomResultOne.add("you open the door, walk a few steps, and fall through a trap door, "
				+ "Luckily you are unhurt."); // Room ID 1 
		
		roomResultOne.add("You die, attacking giant rats is a bad idea"); // Room ID 2
		
		roomResultOne.add("The car hits you. You wake up in the hospital several hours later"); // Room ID 3 
		
		roomResultOne.add(""); // Room ID 4
		
		roomResultOne.add("You find yourself near forest."); // Room ID 5
		
		roomResultOne.add("You walk out of the room"); // Room ID 6
		
		roomResultOne.add("You sleep and wake up as you are grabbed by a large creature."
				+ "  You are eaten."); // Room ID 7
		roomResultOne.add("You go left and wander into an abandoned street."); //8
		
		roomResultOne.add("After what feels like twelve years you turn around and see a familiar shape, " 
				+ "you almost shrink away from the sight of anything existing in"
				+ " this blackness. It is a mahogany door, which looks slightly familiar.  "
				+ "You slowly walk up to it and open it. Through the door is a bright hole in the universe,"
				+ " you step carefully through the hole in the universe.");// 9

		roomResultOne.add("despite your valiant efforts to survive, you are killed right away, "
				+ "and made into a stew. Which feeds them in their"
				+ " feast of many days! You are now recognized as a national hero among them!");// 10
		roomResultOne.add("");// 11
		roomResultOne.add("");// 12
		roomResultOne.add("The gangsters decide to sell you to a pirate crew,"
				+ " you spend the rest of your life plundering the high seas. "
				+ "After ten years you become a well respected pirate captain,"
				+ " and live amongst your swagger and booty until you die in your bed "
				+ "surrounded by the many children and grandchildren you have fathered "
				+ "from your time in brothels.");// 13
		roomResultOne.add("");// 14
	}

	private void fillRoomResultTwo()
	{
		roomResultTwo.add("You hand over your purse, he motions you to pass."
				+ " You realize that you are a pansy.");// Room0
		
		roomResultTwo.add("You walk onto a seemingly abandoned street.");// ID1
		
		roomResultTwo.add("You escape from the rats, then you slip and fall "
				+ "down a magical waterfall of joy and happiness.");// ID2
		
		roomResultTwo.add("The car hits you anyway. You die because you’re a pansy.");// ID3
		
		roomResultTwo.add("");// ID4
		
		roomResultTwo.add("You go to the end of the corridor, there is a clean mahogany door,"
				+ " standing away from the wall. You open the door and see a dark hole in the fabric of the universe,"
				+ " being the adventurous type, you jump headfirst through the hole in the universe.");// ID5
		
		roomResultTwo.add("The button makes a loud buzzing noise, then the room starts filling with a toxic gas."
				+ " You have to jump up and run out of the room as fast as you can, leaving the other person to die");// ID6
		
		roomResultTwo.add("You walk towards a small amount of light.");// ID7
		
		roomResultTwo.add("You reach out and grab the fork. As you pull it upward,"
				+ " the ground comes with it, the ground stretches and strains like"
				+ " a piece of fabric as you violently try to separate it from the fork."
				+ " The ground rips open, and you see a dark featureless hole in the fabric of"
				+ " the universe. You jump headfirst through the hole in the universe.");// ID8
		
		roomResultTwo.add("After what feels like twelve years you turn "
				+ "around and see a familiar shape, you almost shrink"
				+ " away from the sight of anything existing in this b"
				+ "lackness. It is a mahogany door which looks slightly"
				+ " familiar.  You slowly walk up to it and open it. Th"
				+ "rough the door is a bright hole in the universe, you"
				+ " step carefully through the hole in the universe.");// ID9
		
		roomResultTwo.add(" You escape the cannibals, "
				+ "only to find out that you are on a crime boss’s boat.");// ID10
		
		roomResultTwo.add("");// ID11
		
		roomResultTwo.add("");// ID12
		
		roomResultTwo.add("As you walk the plank,"
				+ " expecting to drown, you are saved by a dolphin , "
				+ "who takes you to your nearby beach house.");// ID13
		roomResultTwo.add(""); // 14
	}

	public int getRoom()
	{
		return currentRoom;
	}

	public void setRoom(int newRoom)
	{
		currentRoom = newRoom;
	}

	public String getRoomName()
	{
		String roomString = "";

		roomString = roomName.get(currentRoom);

		return roomString;
	}

	public String getRoomDescription()
	{
		String roomString = "";

		roomString = roomDescription.get(currentRoom);

		return roomString;
	}

	public String getRoomOptionOne()
	{
		String roomString = "";

		roomString = roomOptionOne.get(currentRoom);

		return roomString;
	}

	public String getRoomOptionTwo()
	{
		String roomString = "";

		roomString = roomOptionTwo.get(currentRoom);

		return roomString;
	}

	public String getRoomResultOne()
	{
		String roomString = "";

		roomString = roomResultOne.get(currentRoom);

		return roomString;
	}

	public String getRoomResultTwo()
	{
		String roomString = "";

		roomString = roomResultTwo.get(currentRoom);

		return roomString;
	}

	public Integer getRoomOrderOne()
	{
		int roomInteger = 0;

		roomInteger = roomOrderOne.get(currentRoom);

		return roomInteger;
	}

	public Integer getRoomOrderTwo()
	{
		int roomInteger = 0;

		roomInteger = roomOrderTwo.get(currentRoom);

		return roomInteger;
	}
}
