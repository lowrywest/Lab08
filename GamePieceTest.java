import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class GamePieceTest {

	@SuppressWarnings("deprecation")
	@Test
	public void gamePieceTest() 
	{
		GamePiece tester;
		/*
		 * Testing RED_RACER
		 */
		tester=GamePiece.RED_RACER;
		Assert.assertEquals("Incorrect color value in RED_RACER ", Color.RED, tester.getColor());
		Assert.assertEquals("Incorrect shape value in RED_RACER ", Shape.RACECAR, tester.getShape());
		Assert.assertEquals("Incorrect priority value in RED_RACER ", 0, tester.getPriority());
		Assert.assertEquals("RED_RACER enum values incorrect.",GamePiece.RED_RACER , GamePiece.valueOf("RED_RACER"));
		/*
		 * Testing BLUE_RACER
		 */
		tester=GamePiece.BLUE_RACER;
		Assert.assertEquals("Incorrect color value in BLUE_RACER ", Color.BLUE, tester.getColor());
		Assert.assertEquals("Incorrect shape value in BLUE_RACER ", Shape.RACECAR, tester.getShape());
		Assert.assertEquals("Incorrect priority value in BLUE_RACER ", 2, tester.getPriority());
		Assert.assertEquals("BLUE_RACER enum values incorrect.",GamePiece.BLUE_RACER , GamePiece.valueOf("BLUE_RACER"));
		/*
		 * Testing MAGENTA_RACER
		 */
		tester=GamePiece.MAGENTA_RACER;
		Assert.assertEquals("Incorrect color value in MAGENTA_RACER ", Color.MAGENTA, tester.getColor());
		Assert.assertEquals("Incorrect shape value in MAGENTA_RACER ", Shape.RACECAR, tester.getShape());
		Assert.assertEquals("Incorrect priority value in MAGENTA_RACER ", 1, tester.getPriority());
		Assert.assertEquals("MAGENTA_RACER enum values incorrect.",GamePiece.MAGENTA_RACER , GamePiece.valueOf("MAGENTA_RACER"));
		/*
		 * Testing RED_THIMBLE
		 */
		tester=GamePiece.RED_THIMBLE;
		Assert.assertEquals("Incorrect color value in RED_THIMBLE ", Color.RED, tester.getColor());
		Assert.assertEquals("Incorrect shape value in RED_THIMBLE ", Shape.THIMBLE, tester.getShape());
		Assert.assertEquals("Incorrect priority value in RED_THIMBLE ", 10, tester.getPriority());
		Assert.assertEquals("RED_THIMBLE enum values incorrect.",GamePiece.RED_THIMBLE, GamePiece.valueOf("RED_THIMBLE"));
		/*
		 * Testing BLUE_BOOT
		 */
		tester=GamePiece.BLUE_BOOT;
		Assert.assertEquals("Incorrect color value in BLUE_BOOT ", Color.BLUE, tester.getColor());
		Assert.assertEquals("Incorrect shape value in BLUE_BOOT ", Shape.BOOT, tester.getShape());
		Assert.assertEquals("Incorrect priority value in BLUE_BOOT ", 5, tester.getPriority());
		Assert.assertEquals("BLUE_BOOT enum values incorrect.",GamePiece.BLUE_BOOT, GamePiece.valueOf("BLUE_BOOT"));
		/*
		 * Testing GREEN_BOOT
		 */
		tester=GamePiece.GREEN_BOOT;
		Assert.assertEquals("Incorrect color value in GREEN_BOOT ", Color.GREEN, tester.getColor());
		Assert.assertEquals("Incorrect shape value in GREEN_BOOT ", Shape.BOOT, tester.getShape());
		Assert.assertEquals("Incorrect priority value in GREEN_BOOT ", 8, tester.getPriority());
		Assert.assertEquals("GREEN_BOOT enum values incorrect.",GamePiece.GREEN_BOOT, GamePiece.valueOf("GREEN_BOOT"));
		/*
		 * Testing YELLOW_BOOT
		 */
		tester=GamePiece.YELLOW_BOOT;
		Assert.assertEquals("Incorrect color value in YELLOW_BOOT ", Color.YELLOW, tester.getColor());
		Assert.assertEquals("Incorrect shape value in YELLOW_BOOT ", Shape.BOOT, tester.getShape());
		Assert.assertEquals("Incorrect priority value in YELLOW_BOOT ", 7, tester.getPriority());
		Assert.assertEquals("YELLOW_BOOT enum values incorrect.",GamePiece.YELLOW_BOOT, GamePiece.valueOf("YELLOW_BOOT"));
		
	} 
	
	@SuppressWarnings("deprecation")
	@Test
	public void movesFirstTest()
	{
		GamePiece tester1= GamePiece.RED_RACER;
		GamePiece tester2= GamePiece.YELLOW_BOOT;
		GamePiece tester3=GamePiece.RED_THIMBLE;
		Assert.assertEquals("movesFirst returns the incorrect value ", tester1, GamePiece.movesFirst(tester1, tester2));
		Assert.assertEquals("movesFirst returns the incorrect value ", tester2, GamePiece.movesFirst(tester3, tester2));
		Assert.assertEquals("movesFirst returns the incorrect value ", tester1, GamePiece.movesFirst(tester1, tester3));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void toStringTest()
	{
		GamePiece tester1= GamePiece.RED_RACER;
		GamePiece tester2= GamePiece.YELLOW_BOOT;
		GamePiece tester3=GamePiece.RED_THIMBLE;
		Assert.assertTrue("GamePiece toString incorrect", tester1.toString().equalsIgnoreCase("RED_RACER: a RED RACECAR with priority 0"));
		Assert.assertTrue("GamePiece toString incorrect", tester2.toString().equalsIgnoreCase("YELLOW_BOOT: a YELLOW BOOT with priority 7"));
		Assert.assertTrue("GamePiece toString incorrect", tester3.toString().equalsIgnoreCase("RED_THIMBLE: a RED THIMBLE with priority 10"));
		
	}

}
