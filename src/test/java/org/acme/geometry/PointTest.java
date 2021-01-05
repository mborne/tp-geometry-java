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
		Point p = SampleFactory.createPointM();
		
		//act
		boolean b = p.isEmpty();
		
		//arrange
		Assert.assertFalse(b);
	}
	
	@Test
	public void testTranslateHappyPath() {
		//arrange
		Point p = SampleFactory.createPointM();
		
		//act
		p.translate(4.0,-5.0);
		double px = p.getCoordinate().getX();
		double py = p.getCoordinate().getY();
		
		//arrange
		Assert.assertEquals(8.0,px,EPSILON);
		Assert.assertEquals(-8.0,py,EPSILON);
	}
	
	@Test
	public void testClone() {
		//arrange 
		Point firstPoint = SampleFactory.createPointM();
		
		//act
		Point secondPoint = firstPoint.clone();
		double px = secondPoint.getCoordinate().getX();
		double py = secondPoint.getCoordinate().getY();
		
		//assert
		Assert.assertNotSame(firstPoint,secondPoint);
		Assert.assertEquals(4.0,px,EPSILON);
		Assert.assertEquals(-3.0,py,EPSILON);
		
	}
	
	@Test
	public void testCloneWithTranslate() {
		//arrange 
		Point firstPoint = SampleFactory.createPointM();
		
		//act
		Point secondPoint = firstPoint.clone();
		secondPoint.translate(10.0,5.0);
		double px = firstPoint.getCoordinate().getX();
		double py = firstPoint.getCoordinate().getY();
		
		//assert
		Assert.assertNotSame(firstPoint,secondPoint);
		Assert.assertEquals(4.0,px,EPSILON);
		Assert.assertEquals(-3.0,py,EPSILON);
		
	}
	
	@Test
	public void testGetEnvelope() {
		//arrange
		Point p = SampleFactory.createPointM();
		
		//act
		Envelope e = p.getEnvelope();
		
		//assert
		Assert.assertFalse(e.isEmpty());
		Assert.assertEquals(4.0, e.getXmin(),EPSILON);
		Assert.assertEquals(4.0, e.getXmax(),EPSILON);
		Assert.assertEquals(-3.0, e.getYmin(),EPSILON);
		Assert.assertEquals(-3.0, e.getYmax(),EPSILON);
	}

}
