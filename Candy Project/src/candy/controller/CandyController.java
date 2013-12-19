package candy.controller;

import candy.model.MarshmallowCreature;
import candy.view.DefaultView;

public class CandyController
{
	private MarshmallowCreature myCreature;
	
	public CandyController()
	{
		//normally where you would put your view object.
		
	}
	
	public void startMethod()
	{
		promptForInfo();
		makeMonster();
		displayMonsterInfo();
	}
	
	private void promptForInfo()
	{
		DefaultView myView = new DefaultView();
		
		System.out.println("We're going to create a monster!");
		System.out.println("What should be the monster's name?");

		//decide what to put on the MarshmallowCreature.
	}
	
	private void makeMonster()
	{
		myCreature = new MarshmallowCreature(myCreature.getName(),myCreature.getLegs(),
				      myCreature.getArms(),myCreature.getEyes(),myCreature.getButton());
	}
	
	private void displayMonsterInfo()
	{
		System.out.println("Your monster's name is" + myCreature.getName());
		System.out.println("Your monster has " + myCreature.getArms() + " arms.");
		System.out.println("Your monster has " + myCreature.getLegs() + " legs.");
		System.out.println("Your monster has " + myCreature.getEyes() + " eyes.");
	}
}
