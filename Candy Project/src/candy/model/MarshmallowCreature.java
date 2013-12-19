package candy.model;

public class MarshmallowCreature
{
	private String nameOfSelf;
	private int numberOfLegs;
	private int numberOfEyes;
	private int numberOfArms;
	private boolean hasButton;
	
	public MarshmallowCreature()  //creates a normal creature
	{
		nameOfSelf = "New Marshmallow";
		numberOfLegs = 2;
		numberOfEyes = 2;
		numberOfArms = 2;
		hasButton = true;
	}
	
	
	/**
	 * Creates a marshmallowCreature with specified values.
	 * @param The name of the creature.
	 * @param The number of legs the creature has.
	 * @param The number of eyes the creature has.
	 * @param The number of arms the creature has.
	 * @param Whether or not the creature has a button.
	 */
	public MarshmallowCreature(String name, int legs, int eyes, int arms, boolean hasButton)  //creates a custom creature
	{
		nameOfSelf = name;
		numberOfLegs = legs;
		numberOfEyes = eyes;
		numberOfArms = arms;
		this.hasButton = hasButton;
	}
	
	
	//getters
	public String getName()
	{
		return nameOfSelf;
	}
	
	public int getLegs()
	{
		return numberOfLegs;
	}
	
	public int getEyes()
	{
		return numberOfEyes;
	}

	public int getArms()
	{
		return numberOfArms;
	}

	public boolean getButton()
	{
		return hasButton;
	}
	

	//setters
	public void setName(String nameOfSelf)
	{
		this.nameOfSelf = nameOfSelf;
	}
	
	public void setLegs(int numberOfLegs)
	{
		this.numberOfLegs = numberOfLegs;
	}
	
	public void setEyes(int numberOfEyes)
	{
		this.numberOfEyes = numberOfEyes;
	}
	
	public void setArms(int numberOfArms)
	{
		this.numberOfArms = numberOfArms;
	}
	
	public void setButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}

	
}
