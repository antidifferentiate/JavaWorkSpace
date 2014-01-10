package recursion.control;

public class factorialStart
{

	public void start()
	{
			System.out.println(factorial(170));
	}
	
	private int factorialRecursively(int findThis)
	{
		if (findThis>0)
		return findThis*factorialRecursively(findThis-1);
		else
		return 1;
	}
	
	private double factorial(int findThis)
	{
		double tempNumber = findThis;
		for (int i=findThis-1; i>0; i-=1)
		{
			tempNumber *= i;
		}
		return tempNumber;
	}
}
