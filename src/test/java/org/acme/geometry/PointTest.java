package org.acme.geometry;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
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
	
	@Test
	public void testTranslateHappyPath() {
		//arrange
		Point p = new Point(new Coordinate(1.0,1.0));
		
		//act
		p.translate(4.0,-5.0);
		double px = p.getCoordinate().getX();
		double py = p.getCoordinate().getY();
		
		//arrange
		Assert.assertEquals(5.0,px,EPSILON);
		Assert.assertEquals(-4.0,py,EPSILON);
	}
	
	@Test
	public void testClone() {
		//arrange 
		Point firstPoint = new Point(new Coordinate(1.0,3.0));
		
		//act
		Point secondPoint = firstPoint.clone();
		double px = secondPoint.getCoordinate().getX();
		double py = secondPoint.getCoordinate().getY();
		
		//assert
		Assert.assertEquals(1.0,px,EPSILON);
		Assert.assertEquals(3.0,py,EPSILON);
		
	}
	
	@Test
	public void testCloneWithTranslate() {
		//arrange 
		Point firstPoint = new Point(new Coordinate(1.0,3.0));
		
		//act
		Point secondPoint = firstPoint.clone();
		secondPoint.translate(10.0,5.0);
		double px = firstPoint.getCoordinate().getX();
		double py = firstPoint.getCoordinate().getY();
		
		//assert
		Assert.assertEquals(1.0,px,EPSILON);
		Assert.assertEquals(3.0,py,EPSILON);
		
	}
	

}
