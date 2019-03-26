import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class BoardGame 
{
	//Initalizing the LinkedHashMaps
	protected  LinkedHashMap<String, Location> playerLocations;
	protected  LinkedHashMap<String, GamePiece> playerPieces;
	
	
	public BoardGame()
	{
		playerLocations=new LinkedHashMap<String,Location>();
		playerPieces=new LinkedHashMap<String,GamePiece>();  
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece,  Location intialLocation)
	{
		if(playerLocations.containsKey(playerName) || playerPieces.containsKey(playerName))
		{
			return false;
		}
		else
		{
			playerLocations.put(playerName, intialLocation);
			playerPieces.put(playerName, gamePiece);
			return true;
		}
		
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		String name=gamePiece.name();
		for(int i=0; i<playerPieces.size();i++)
		{
			if(playerPieces.get(i).name().equals(name))
			{
				return playerPieces.get(i).name();
			}
		}
		return null;	
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.remove(playerName);
		playerLocations.put(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		GamePiece a= getPlayerGamePiece(playerNames[0]);
		GamePiece b= getPlayerGamePiece(playerNames[1]);
		GamePiece firstMove= GamePiece.movesFirst(a,b);
		String[] moveOrder= new String[2];
			if(firstMove.equals(a))
			{
				movePlayer(playerNames[0],newLocations[0]);
				movePlayer(playerNames[1],newLocations[1]);
				moveOrder[0]=playerNames[0];
				moveOrder[1]=playerNames[1];
			}
			else
			{
				movePlayer(playerNames[1],newLocations[1]);
				movePlayer(playerNames[0],newLocations[0]);
				moveOrder[1]=playerNames[1];
				moveOrder[0]=playerNames[0];
			}
		
		return moveOrder;
		
	}
	
	public Location getPlayersLocation(String player)
	{
		return Location.valueOf(player);
		
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> namesAtLoc= new ArrayList<String>();
		for(int i=0; i<playerLocations.size(); i++)
		{
			if(playerLocations.get(i).equals(loc))
			{
				namesAtLoc.add(playerLocations.get(i).name());
			}
		
		}
		return namesAtLoc;
		
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> piecesAtLoc= new ArrayList<GamePiece>();
		ArrayList<String> namesAtLoc=getPlayersAtLocation(loc);
		for(int i=0; i<namesAtLoc.size();i++)
		{
			piecesAtLoc.add(getPlayerGamePiece(namesAtLoc.get(i)));
		}
		
		return piecesAtLoc;
		
	}
	
	public Set<String> getPlayers()
	{
		Set<String> players= new LinkedHashSet<String>();
		for(int i=0; i< playerLocations.size();i++)
		{
			players.add(playerLocations.get(i).name());
		}
		
		return players;
	}
	
	public Set<Location> getPlayerLocations()
	{
		Set<Location> playerLoc= new LinkedHashSet<Location>();
		for(int i=0; i< playerLocations.size();i++)
		{
			playerLoc.add(playerLocations.get(i));
		}
		return playerLoc;
		
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> playersPeic= new LinkedHashSet<GamePiece>();
		for(int i=0; i< playerPieces.size();i++)
		{
			playersPeic.add(playerPieces.get(i));
		}
		return playersPeic;
	}
}
