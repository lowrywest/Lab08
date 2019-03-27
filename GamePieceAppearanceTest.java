import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class GamePieceAppearanceTest {

	@SuppressWarnings("deprecation")
	@Test
	public void gamePieceAppearanceTest() 
	{
		GamePieceAppearance test= new GamePieceAppearance(Color.RED, Shape.RACECAR);
		GamePieceAppearance test2= new GamePieceAppearance(Color.BLUE, Shape.THIMBLE);
		Assert.assertEquals("Incorrect getColor value in RED_RACER ", Color.RED, test.getColor());
		Assert.assertEquals("Incorrect getShape value in RED_RACER ", Shape.RACECAR, test.getShape());
		Assert.assertEquals("Incorrect getColor value in BLUE_THIMBLE ", Color.BLUE, test2.getColor());
		Assert.assertEquals("Incorrect getShape value in BLUE_THIMBLE ", Shape.THIMBLE, test2.getShape());
		
	}

}
