package model;

import java.util.ArrayList;

public class SolveProblem
{
	private ArrayList<Integer> Rocks;
	
	public SolveProblem()
	{
		Rocks = new ArrayList<>();
		addRocksToList();
	}
	private void addRocksToList()
	{
		getRocks().add(186);
		getRocks().add(100);
		getRocks().add(99);
		getRocks().add(98);
		getRocks().add(97);
		getRocks().add(96);
		getRocks().add(95);
	}
	public ArrayList<Integer> getRocks()
	{
		return Rocks;
	}
	public void setRocks(ArrayList<Integer> rocks)
	{
		Rocks = rocks;
	}
}
