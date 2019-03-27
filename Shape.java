
public enum Shape 
{
	/*
	 * Creating the enum constants
	 */
	THIMBLE,
	BOOT,
	RACECAR;

	/*
	 *toString takes the Name of the enum constant and makes it lowercase 
	 */
	public String toString()
	{
		return name().toLowerCase();
		
	}
}
