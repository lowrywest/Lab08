
public class Driver 
{
	public static void main(String args[])
	{	
		/*
		 * Creating a BoardGame object and adding two player to it 
		 */
		 BoardGame test= new BoardGame();
		 test.addPlayer("Clay", GamePiece.BLUE_RACER,Location.BILLIARD_ROOM);
		 test.addPlayer("Brett", GamePiece.BLUE_BOOT, Location.BALLROOM);
		 /*
		  * Moving the players
		  */
		 test.movePlayer("Clay", Location.CONSERVATORY);
		 test.movePlayer("Brett", Location.HALL);
		 /*
		  * moving the players at the same time
		  */
		 String[] names= {"Brett","Clay"};
		 Location[] newLoc= {Location.CONSERVATORY,Location.KITCHEN};
		 test.moveTwoPlayers(names, newLoc);
		 /*
		  * Getting the location of one of the players and printing it out
		  */
		 System.out.println(test.getPlayersLocation("Brett").toString());
		 /*
		  * Getting the game piece at a location and printing it out
		  */
		 System.out.println(test.getPlayersAtLocation(Location.KITCHEN).toString());
		 /*
		  * Getting all the players and printing them out
		  */
		 System.out.println(test.getPlayers().toString());
		 /*
		  * Getting all the locations with players and printing them out
		  */
		 System.out.println(test.getPlayerLocations().toString());
		 /*
		  * Getting all the Pieces with players and printing them out
		  */
		 System.out.println(test.getPlayerPieces().toString());

	}

}
