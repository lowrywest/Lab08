import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class BoardGame 
{
	/*
	 * Initalizing the LinkedHashMaps
	 */
	protected  LinkedHashMap<String, Location> playerLocations;
	protected  LinkedHashMap<String, GamePiece> playerPieces;
	
	/*
	 * Creating the constructor for the Board
	 */
	public BoardGame()
	{
		playerLocations=new LinkedHashMap<String,Location>();
		playerPieces=new LinkedHashMap<String,GamePiece>();  
	}
	
	/*
	 * adding the players to linkedHashMaps
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece,  Location intialLocation)
	{
		/*
		 * IF the player name is already in the maps then return false
		 */
		if(playerLocations.containsKey(playerName) || playerPieces.containsKey(playerName))
		{
			return false;
		}
		else
		{
			/*
			 * putting the playerName and the location or the gamePiece to the maps
			 */
			playerLocations.put(playerName, intialLocation);
			playerPieces.put(playerName, gamePiece);
			return true;
		}
		
	}
	/*
	 * getPlayerGamePiece method
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
		/*
		 * returning the GamePiece with the corresponding name
		 */
		return playerPieces.get(playerName);
	}
	/*
	 * returning the name of the player from the gamepiece
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{ 
		/*
		 * if the game piece is not found return null
		 */
		if(!playerPieces.containsValue(gamePiece))
		{
			return null;
		}
		/*
		 * looping through the names in the keyset
		 */
		for(String player: playerPieces.keySet())
		{
			/*
			 * if the piece any name in the keylist is equal to the expected piece return it
			 */
			if(playerPieces.get(player).equals(gamePiece))
			{
				return player;
			}
		}
		return null;
	}
	
	/*
	 * Changing the value of the location of the player 
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
		/*
		 * removing the player with the matching name and then adding it back with the new location
		 */
		playerLocations.remove(playerName);
		playerLocations.put(playerName, newLocation);
	}
	/*
	 * moving two players baised on the moveOrder method
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		/*
		 * getting the gamePieces for the Player names
		 */
		GamePiece a= getPlayerGamePiece(playerNames[0]);
		GamePiece b= getPlayerGamePiece(playerNames[1]);
		/*
		 * calling the movesFirst method and saving which piece moves first
		 */
		GamePiece firstMove= GamePiece.movesFirst(a,b);
		String[] moveOrder= new String[2];
		/*
		 * if the first Piece moves call the move player method and then  add the name to the blank Array in the same order
		 */
			if(firstMove.equals(a))
			{
				movePlayer(playerNames[0],newLocations[0]);
				movePlayer(playerNames[1],newLocations[1]);
				moveOrder[0]=playerNames[0];
				moveOrder[1]=playerNames[1];
			}
			/*
			 * else the second Piece moves call the move player method and then add the names to the blank Array in the same order
			 */
			else
			{
				movePlayer(playerNames[1],newLocations[1]);
				movePlayer(playerNames[0],newLocations[0]);
				moveOrder[1]=playerNames[1];
				moveOrder[0]=playerNames[0];
			}
		
		return moveOrder;
		
	}
	
	/*
	 * Returning the location of the matching player name
	 */
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
		
	}
	/*
	 * Returning an ArayList of the players at a location
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		/*
		 * Creating a blank arrayList
		 */
		ArrayList<String> namesAtLoc= new ArrayList<String>();
		/*
		 * looping through the names in the map
		 */
		for(String names: playerLocations.keySet())
		{
			/*
			 * if the location of any of the names is equal to the specified location add it to the arrayList
			 */
			if(playerLocations.get(names).equals(loc))
			{
				namesAtLoc.add(names);
			}
		}
		return namesAtLoc;
		
	}
	/*
	 * Returning an ArayList of the pieces at a location
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		/*
		 * Creating a blank arrayList
		 */
		ArrayList<GamePiece> piecesAtLoc= new ArrayList<GamePiece>();
		/*
		 * looping through the names in the map
		 */
		for(String names: playerPieces.keySet())
		{
			/*
			 * if the piece any of the names is equal to the specified piece add it to the arrayList
			 */
			if(playerLocations.get(names).equals(loc))
			{
				piecesAtLoc.add(playerPieces.get(names));
			}
		}
		
		return piecesAtLoc;
		
	}
	
	public Set<String> getPlayers()
	{
		return playerLocations.keySet();
	}
	
	@SuppressWarnings("null")
	/*
	 * Returning an ArayList of the all the locations
	 */
	public Set<Location> getPlayerLocations()
	{
		/*
		 * Creating a blank arrayList
		 */
		Set<Location> locations= null;
		/*
		 * looping through the names in the map
		 */
		for(String names: playerLocations.keySet())
		{
			/*
			 * if the location of any of the names is equal to the specified location add the name it to the arrayList
			 */
			if(playerLocations.get(names).equals(locations))
			{
				locations.add(playerLocations.get(names));
			}
		}
		return locations;
	}
	
	@SuppressWarnings("null")
	/*
	 * Returning an ArayList of the all the pieces
	 */
	public Set<GamePiece> getPlayerPieces()
	{
		/*
		 * Creating a blank arrayList
		 */
		Set<GamePiece> pieces= null;
		/*
		 * looping through the names in the map
		 */
		for(String names: playerPieces.keySet())
		{
			/*
			 * if the piece of any of the names is equal to the specified location add the name to the arrayList
			 */
			if(playerPieces.get(names).equals(pieces))
			{
				pieces.add(playerPieces.get(names));
			}
		}
		return pieces;
	}
}
