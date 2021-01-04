package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
	}
	
	@Test
	public void testConstructor() {
		Coordinate c = new Coordinate(5.0,3.0);
		Assert.assertEquals(5.0, c.getX(), EPSILON);
		Assert.assertEquals(3.0, c.getY(), EPSILON);
	}
	
	@Test
	public void testIsEmptyTrue() {
		//arrange
		Coordinate c = new Coordinate();
		
		//act
		boolean b = c.isEmpty();
		
		//assert
		Assert.assertTrue(b);
	}
	@Test
	public void testIsEmptyFalse() {
		//arrange
		Coordinate c = new Coordinate(1.0,1.0);
		
		//act
		boolean b = c.isEmpty();
		
		//assert
		Assert.assertFalse(b);
	}
}
