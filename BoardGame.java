import java.util.LinkedHashMap;

public class BoardGame 
{
	protected  LinkedHashMap<String, Location> locMap;
	protected  LinkedHashMap<String, GamePiece> gameMap;
	
	public BoardGame()
	{
		locMap=new LinkedHashMap<String,Location>();
		gameMap=new LinkedHashMap<String,GamePiece>();  
	}
}
