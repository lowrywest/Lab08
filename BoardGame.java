import java.util.LinkedHashMap;

public class BoardGame 
{
	//Initalizing the LinkedHashMaps
	protected  LinkedHashMap<String, Location> locMap;
	protected  LinkedHashMap<String, GamePiece> gameMap;
	
	
	public BoardGame()
	{
		locMap=new LinkedHashMap<String,Location>();
		gameMap=new LinkedHashMap<String,GamePiece>();  
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece,  Location intialLocation)
	{
		if(locMap.containsKey(playerName)||gameMap.containsKey(playerName))
		{
			return false;
		}
		else
		{
			locMap.put(playerName, intialLocation);
			gameMap.put(playerName, gamePiece);
			return true;
		}
		
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return gameMap.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		return null;	
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		
	}
	
}
