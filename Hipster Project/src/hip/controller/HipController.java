package hip.controller;

import javax.swing.JOptionPane;

import hip.model.Hipster;
import hip.view.HipFrame;

/**
 * The controller object controls the order of method calls in the code.
 * 
 * @author Jalen Morgan
 * @version 1.1 Nov 20, 2013
 */
public class HipController
{
	// Declaration Section
	private HipFrame universalFrame;
	private Hipster selfHipster;
	private Hipster[] cubicleHipsters;
	private int hipsterCount;

	/**
	 * Constructor creates selfHipster and cubicleHipsters.
	 */
	public HipController()
	{
		selfHipster = new Hipster();
		cubicleHipsters = new Hipster[4];

		for (int count = 0; count < cubicleHipsters.length; count += 1)
		{
			cubicleHipsters[count] = new Hipster();
		}
	}

	/**
	 * Start method starts building the GUI by making a frame.
	 */
	public void start()
	{
		universalFrame = new HipFrame(this);
	}

	/**
	 * Adds a hipster into the cubicleHipsters array. You can specify the
	 * variables with this method.
	 * 
	 * @param books
	 *            The books read by a hipster.
	 * @param type
	 *            The type of hipster
	 * @param name
	 *            The name of mr. Hipster
	 * @param phrase
	 *            The phrase used by the hipster.
	 */
	public void addHipster(String[] books, String name, String type,
			String phrase)
	{
		if (hipsterCount < cubicleHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			cubicleHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(universalFrame,
					"Your array of Hippie Hipsters is full.");
		}

	}
	
	/**
	 * Gets a hipster Object from the array.
	 * 
	 * @param position
	 *            The position to check for a hipster object.
	 * @return Return the object.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster hippie = null;

		if (position < cubicleHipsters.length && position >= 0)
		{
			hippie = cubicleHipsters[position];
		}

		return hippie;
	}

	/**
	 * Get the object of the selfHipster
	 * 
	 * @return Return the object.
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	/**
	 * Set the object of the selfHipster.
	 * 
	 * @param selfHipster
	 *            The new object.
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	/**
	 * Get a random hipster object from the array of hipsters.
	 * 
	 * @return return a random hipster.
	 */
	public Hipster getRandomHipster()
	{
		Hipster randomHipster = null;
		int number = 0;
		double random = Math.random();

		number = (int) (random * cubicleHipsters.length);

		randomHipster = cubicleHipsters[number];
		return randomHipster;
	}

	/**
	 * Get the array of hipsters.
	 * @return Returns the object id.
	 */
	public Hipster[] getClassHipsters()
	{
		return cubicleHipsters;
	}
}
