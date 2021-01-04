package org.acme.geometry;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

	@Test
	public void testGetType() {
		//arrange
		Point p = new Point();
		
		//act
		String typeP = p.getType();
		
		//assert
		Assert.assertEquals("Point",typeP);
	}
	
	@Test
	public void testIsEmptyWithoutCoordinate() {
		//arrange
		Point p = new Point();
		
		//act
		boolean b = p.isEmpty();
		
		//arrange
		Assert.assertTrue(b);
	}
	
	@Test
	public void testIsEmptyWithCoordinate() {
		//arrange
		Point p = new Point(new Coordinate(1.0,1.0));
		
		//act
		boolean b = p.isEmpty();
		
		//arrange
		Assert.assertFalse(b);
	}

}
