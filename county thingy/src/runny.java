
public class runny
{
	public static void main(String[] args)
	{
		int top = 14;
		int bottom = top - 3;
		
		double fraction = top/bottom;
		
		double thisNumber = 0.5810546875;
		double prevNumber = 0.548828125;
		double beforeNumber = 0.5078125;
		
		System.out.println((prevNumber - beforeNumber + prevNumber*fraction)/fraction);


	}
}
