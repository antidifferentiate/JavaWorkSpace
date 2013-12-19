package player.objects;

import room.information.RoomControls;

public class MainPlayer
{

	int roomNumber;
	
	
	public void initializeVariables()
	{
		
		roomNumber = 0;
		
	}
	
	public void changeRoom(int newRoomNumber)
	{
		
		roomNumber = newRoomNumber;
		RoomControls roomInstance = new RoomControls();
		roomInstance.displayRoomInformation();
		
	}
	
}
