package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testConstructor(){
		Coordinate c = new Coordinate(0.3,1.8);
		Point p = new Point(c);
		Assert.assertEquals("Point", p.getType());
	}
}
