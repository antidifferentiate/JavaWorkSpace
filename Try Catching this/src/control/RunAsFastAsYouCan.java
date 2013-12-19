package control;

public class RunAsFastAsYouCan
{
	public static void main(String[] args)
	{
		outputThing("Hello");
		outputThing("Goodbye");
		outputThing("1234");
		outputThing("1");
	}

	private static void outputThing(String input)
	{
		System.out.println("The string " + input + " is a number is "
				+ isNumeric(input));
	}

	private static boolean isNumeric(String str)
	{
		try
		{
			double d = Double.parseDouble(str);
		}
		catch (NumberFormatException nfe)
		{
			System.out.println(nfe.getMessage());
			return false;
		}
		return true;
	}
}
