package dungeon.controller;

import dungeon.model.RoomInformation;

public class Controller
{
	public static void main(String [] args)
	{
		RoomInformation myRoom = new RoomInformation();
		
		System.out.println(myRoom.getRoomName());
		System.out.println(myRoom.getRoomDescription());
		System.out.println(myRoom.getRoomOptionOne());
		System.out.println(myRoom.getRoomOptionTwo());
		System.out.println(myRoom.getRoomResultOne());
		System.out.println(myRoom.getRoomResultTwo());
	}
}
