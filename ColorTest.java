import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ColorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void colorValuesTest() {
		Color col;
		/*
		 * Testing RED
		 */
		col= Color.RED;
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getB());
		
		/*
		 * Testing GREEN
		 */
		col=Color.GREEN; 
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getB());
		
		/*
		 * Testing BLUE
		 */
		col=Color.BLUE;
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getB());
		
		/*
		 * Testing YELLOW
		 */
		col=Color.YELLOW;
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getB());
		
		/*
		 * Testing CYAN
		 */
		col=Color.CYAN;
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getB());
		
		/*
		 * Testing MAGENTA
		 */
		col=Color.MAGENTA;
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color "+ col.name(), 255, col.getB());
	}
}
