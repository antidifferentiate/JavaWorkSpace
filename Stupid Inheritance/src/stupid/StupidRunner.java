package stupid;

public class StupidRunner
{

	public static void main(String[] args)
	{
		Dumbest george = new Dumbest();
		Dumber myDummy = new Dumber();
		Dumb lloyd = new Dumb();
		
		System.out.println(myDummy.getBlerg());
		System.out.println(lloyd.getBlerg());
		myDummy.setBlerg(2);
		System.out.println(myDummy.getBlerg());
		myDummy.setBlerg(myDummy.getBlerg()+1);
		System.out.println(myDummy.getBlerg());
		System.out.println("George's thingy:  " + george.getBlerg());
	}

}
