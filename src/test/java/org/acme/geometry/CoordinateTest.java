package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
		Coordinate c = new Coordinate();
		Assert.assertEquals(Double.NaN, c.getX(), EPSILON);
		Assert.assertEquals(Double.NaN, c.getY(), EPSILON);
	}

	@Test
	public void testConstructor(){
		// TODO
		Double x = 0.1;
		Double y = 0.2;

		Coordinate c = new Coordinate( x, y);

		Assert.assertEquals( x, c.getX(), EPSILON);
		Assert.assertEquals( y, c.getY(), EPSILON);

	}

	@Test
	public void testIsEmpty(){
		//TODO

		Coordinate cEmpty = new Coordinate();
		Coordinate cNotEmpty = new Coordinate(0.1, 0.2);

		Assert.assertEquals(true, cEmpty.isEmpty());
		Assert.assertEquals(false, cNotEmpty.isEmpty());
	}

}
