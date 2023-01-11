package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		// TODO
		Coordinate c = new Coordinate();
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getY(), EPSILON);
	}
	@Test
	public void testConstructorXY(){
		// TODO
		Coordinate c = new Coordinate(1.2,3.5);
		Assert.assertEquals(1.2, c.getX(), EPSILON);
		Assert.assertEquals(3.5, c.getY(), EPSILON);
	}


}
