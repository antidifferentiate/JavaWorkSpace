package hip.model;

/**
 * Creates a Hipster object.
 * 
 * @author Jalen Morgan
 * @version 1.3 11/20/13 Added getter/setters
 */
public class Hipster
{
	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String[] hipsterBooks;

	/**
	 * Constructor to create default hipsters.
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Cody";
		hipsterType = "Teacher Hipster";
		hipsterPhrase = "Cheezy";

		fillTheBooks();
	}

	/**
	 * Constructor for a hipster without default variable values.
	 * 
	 * @param name
	 *            Name of hipster
	 * @param hipsterType
	 *            Type of hipster
	 * @param hipsterPhrase
	 *            Phrase used by hipster
	 * @param hipsterBooks
	 *            Books read by hipster
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase,
			String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterType = hipsterType;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterBooks = hipsterBooks;
	}

	// Getters
	/**
	 * Get the name of the Hipster.
	 * 
	 * @return Return the name as a string.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Get the Hipster type as a String
	 * 
	 * @return Returns the String.
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * Get the Hipster's phrase.
	 * 
	 * @return Returns the phrase as a String.
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/**
	 * Get the hipster's array of books.
	 * 
	 * @return Return the Array.
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	// Setters
	/**
	 * Set the Hipster's name
	 * 
	 * @param name
	 *            Set the name to this String.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Set the Hipster type to a string
	 * 
	 * @param hipsterType
	 *            The String to set it to.
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * Change the hipster's phrase
	 * 
	 * @param hipsterPhrase
	 *            Change it into this String.
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * Set the hipster's Book array
	 * 
	 * @param hipsterBooks
	 *            Change the book array to this.
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	/**
	 * Fill the hipster's book array with information.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "The Bible";
		hipsterBooks[2] = "AP Computer Science";
		hipsterBooks[3] = "HTML 5 for dummies";
		hipsterBooks[4] = "Calculus";

	}

}
