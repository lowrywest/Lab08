import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ShapeTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void shapeTest()
	{
		Assert.assertEquals("Location enum values incorrect.", Shape.BOOT , Shape.valueOf("BOOT"));
		Assert.assertEquals("Location enum values incorrect.",Shape.RACECAR , Shape.valueOf("RACECAR"));
		Assert.assertEquals("Location enum values incorrect.",Shape.THIMBLE , Shape.valueOf("THIMBLE"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void toStringTest()
	{
		Shape shap;
		/*
		 * Testing toString
		 */
		shap=Shape.BOOT;
		Assert.assertEquals("Incorrect toString value for color "+ shap.name(), shap.name().toLowerCase(), shap.toString());
		shap=Shape.RACECAR;
		Assert.assertEquals("Incorrect toString value for color "+ shap.name(), shap.name().toLowerCase(), shap.toString());
		shap=Shape.THIMBLE;
		Assert.assertEquals("Incorrect toString value for color "+ shap.name(), shap.name().toLowerCase(), shap.toString());
		
	}

}
