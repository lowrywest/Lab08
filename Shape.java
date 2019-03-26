
public enum Shape 
{
	THIMBLE,
	BOOT,
	RACECAR;
	
	@Override
	public static Shape valueOf(String name)
	{	
		if(THIMBLE.name().equals(name))
		{
			return THIMBLE;
		}
		else if(BOOT.name().equals(name))
		{
			return BOOT;
		}
		else
		{
			return RACECAR;
		}
	}
	public String toString()
	{
		return null;
		
	}

}
