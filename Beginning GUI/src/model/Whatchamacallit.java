package model;

public class Whatchamacallit
{
	private String description;
	private int classCounter;
	
	public Whatchamacallit()
	{
		this.description = "";
		this.classCounter = -10;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getClassCounter()
	{
		return classCounter;
	}

	public void setClassCounter(int classCounter)
	{
		this.classCounter = classCounter;
	}
	
	
}
