package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testConstructorXY(){
		Coordinate c = new Coordinate(3.0,4.0);
		Assert.assertEquals(3.0, c.getX(), EPSILON);
		Assert.assertEquals(4.0, c.getY(), EPSILON);
	}

	@Test
	public void testConstructorEmpty(){
		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
	}

	@Test
	public void testEmpty(){
		Coordinate c = new Coordinate();
		Assert.assertTrue(c.isEmpty());

		Coordinate c2 = new Coordinate(3.4, 7.2);
		Assert.assertFalse(c2.isEmpty());

		Coordinate c3 = new Coordinate(0.0, 0.0);
		Assert.assertFalse(c3.isEmpty());

		Coordinate c4 = new Coordinate(0.0, Double.NaN);
		Assert.assertTrue(c4.isEmpty());
		
		Coordinate c5 = new Coordinate(Double.NaN, 0.0);
		Assert.assertTrue(c5.isEmpty());
}

}
