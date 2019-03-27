
public enum Color 
{
	RED(255,0,0),
	GREEN(0,255,0),
	BLUE(0,0,255),
	YELLOW(255, 255, 0),
	CYAN(0, 255, 255),
	MAGENTA(255, 0, 255);
	
	private int r;
	private int g;
	private int b;
	
	
	Color(int r, int g, int b )
	{
		this.r=r;
		this.g=g;
		this.b=b;
	}
	
	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}

	/**
	 * return g
	 */
	public int getG() {
		return g;
	}

	/**
	 * return b
	 */
	public int getB() {
		return b;
	}
	
}
