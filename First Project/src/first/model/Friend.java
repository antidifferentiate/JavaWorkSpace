package first.model;

public class Friend
{
	private String name;
	private String humorStyle;
	private int age;
	private String interest;
	private boolean likesPineapple;
	private double weight;
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHumor(String humorStyle)
	{
		this.humorStyle = humorStyle;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setInterest(String interest)
	{
		this.interest = interest;
	}
	
	public void setPineapple(boolean likesPineapple)
	{
		this.likesPineapple = likesPineapple;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	//getters
	
	public String getName()
	{
		return name;
	}
	
	public String getHumorStyle()
	{
		return humorStyle;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getInterest()
	{
		return interest;
	}
	
	public boolean getPineapple()
	{
		return likesPineapple;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	/**
	 * Creates a default Friend!
	 */
	public Friend()
	{
		name = "nameless";
		humorStyle = "lessthannone";
		age = 12;
		interest = "sleeping";
		likesPineapple = true;
		weight = 142.9;
	}
	
	public Friend(String name, String humorStyle, int age, String interest, boolean likesPineapple, double weight)
	{
		
		this.name = name;
		this.humorStyle = humorStyle;
		this.age = age;
		this.interest = interest;
		this.likesPineapple = likesPineapple;
		this.weight = weight;
		
	}
}
