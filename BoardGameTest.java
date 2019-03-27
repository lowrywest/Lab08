import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.junit.Test;

import junit.framework.Assert;

public class BoardGameTest {

	@SuppressWarnings({ "deprecation"})
	@Test
	public void addPlayerTest() 
	{
		 BoardGame test= new BoardGame();
		 test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		 Assert.assertTrue("Addplayer is working incorrectly ",test.playerLocations.get("Clay").equals(Location.BILLIARD_ROOM));
		 Assert.assertTrue("Addplayer is working incorrectly ",test.playerLocations.containsKey("Clay"));
		 Assert.assertTrue("Addplayer is working incorrectly ",test.playerPieces.get("Clay").equals(GamePiece.BLUE_RACER));
		 Assert.assertTrue("Addplayer is working incorrectly ",test.playerPieces.containsKey("Clay"));
		 Assert.assertFalse("Addplayer is working incorrectly ",test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getPlayerGamePieceTest() 
	{
		 BoardGame test= new BoardGame();
		 test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		 test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		 Assert.assertTrue(" getPlayerGamePiece is working incorrectly ", test.getPlayerGamePiece("Clay").equals(GamePiece.BLUE_RACER));
		 Assert.assertTrue(" getPlayerGamePiece is working incorrectly ", test.getPlayerGamePiece("Brett").equals(GamePiece.BLUE_BOOT));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getPlayerWithGamePieceTest()
	{
		 BoardGame test= new BoardGame();
		 test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		 test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		 Assert.assertTrue(" getPlayerWithGamePiece is working incorrectly ", test.getPlayerWithGamePiece(GamePiece.BLUE_RACER).equals("Clay"));
		 Assert.assertTrue(" getPlayerWithGamePiece is working incorrectly ", test.getPlayerWithGamePiece(GamePiece.BLUE_BOOT).equals("Brett"));
		 Assert.assertNull(" getPlayerWithGamePiece is working incorrectly ",test.getPlayerWithGamePiece(GamePiece.RED_RACER));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void movePlayerTest()
	{
		 BoardGame test= new BoardGame();
		 test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		 test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		 test.movePlayer("Clay", Location.CONSERVATORY);
		 test.movePlayer("Brett", Location.HALL);
		 Assert.assertTrue(" movePlayer is working incorrectly ", test.playerLocations.get("Clay").equals(Location.CONSERVATORY));
		 Assert.assertTrue(" movePlayer is working incorrectly ", test.playerLocations.get("Brett").equals(Location.HALL));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void moveTwoPlayersTest()
	{
		BoardGame test= new BoardGame();
		test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		String[] expect= {"Clay","Brett"};
		String[] names= {"Brett","Clay"};
		Location[] newLoc= {Location.CONSERVATORY,Location.KITCHEN};
		Assert.assertTrue(" moveTwoPlayers is working incorrectly ", test.moveTwoPlayers(names, newLoc).equals(expect));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getPlayerLocationTest()
	{
		BoardGame test= new BoardGame();
		test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		Assert.assertTrue("getPlayersLocation is working incorrectly", test.getPlayersLocation("Clay").equals(Location.BILLIARD_ROOM));
		Assert.assertTrue("getPlayersLocation is working incorrectly", test.getPlayersLocation("Brett").equals(Location.BALLROOM));	
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getPlayersAtLocationTest()
	{
		BoardGame test= new BoardGame();
		test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		test.addPlayer("Griffin", GamePiece.GREEN_BOOT, Location.BALLROOM);
		ArrayList<String> expected= new ArrayList<String>();
		expected.add("Brett");
		expected.add("Griffin");
		Assert.assertTrue("getPlayersAtLocation is working incorrectly", test.getPlayersAtLocation(Location.BALLROOM).equals(expected));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getGamePiecesAtLocationTest()
	{
		BoardGame test= new BoardGame();
		test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		test.addPlayer("Griffin", GamePiece.GREEN_BOOT, Location.BALLROOM);
		ArrayList<GamePiece> expected= new ArrayList<GamePiece>();
		expected.add(GamePiece.BLUE_BOOT);
		expected.add(GamePiece.GREEN_BOOT);
		Assert.assertTrue("getGamePiecesAtLocation is working incorrectly", test.getGamePiecesAtLocation(Location.BALLROOM).equals(expected));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getPlayersTest() 
	{
		BoardGame test= new BoardGame();
		test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		test.addPlayer("Griffin", GamePiece.GREEN_BOOT, Location.BALLROOM);
		String[] expected= {"Brett","Clay","Griffin"};
		Assert.assertTrue("getPlayers is working incorrectly", test.getPlayers().toArray().equals(expected));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void getPlayerLocationsTest()
	{
		BoardGame test= new BoardGame();
		test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		test.addPlayer("Griffin", GamePiece.GREEN_BOOT, Location.BALLROOM);
		Location[] expected= {Location.BALLROOM,Location.BILLIARD_ROOM,Location.BALLROOM};
		Assert.assertTrue("getPlayersLocations is working incorrectly", test.getPlayerLocations().toArray().equals(expected));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void getPlayerGamePiecesTest()
	{
		BoardGame test= new BoardGame();
		test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		test.addPlayer("Griffin", GamePiece.GREEN_BOOT, Location.BALLROOM);
		GamePiece[] expected= {GamePiece.BLUE_BOOT,GamePiece.BLUE_RACER,GamePiece.GREEN_BOOT};
		Assert.assertTrue("getPlayersLocations is working incorrectly", test.getPlayerPieces().toArray().equals(expected));
	}

		
}
