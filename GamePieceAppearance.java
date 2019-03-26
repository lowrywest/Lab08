
public class GamePieceAppearance
{
	/*
	 * Private variables set in the constructor
	 */
	private Color color;
	private Shape shape;
	
	/*
	 * Constructor
	 */
	public GamePieceAppearance(Color color, Shape shape)
	{
		/*
		 * //Setting the global color and shape for the class equal to the parameters
		 */
		this.color=color;
		this.shape=shape;
	}
	
	/*
	 * returns the color of the gamePiece
	 */
	public Color getColor()
	{
		return color;
	}
	/*
	 * returns the shape of the game Piece
	 */
	public Shape getShape()
	{
		return shape;
	}

}
