package org.acme.geometry;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class LineStringTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testGetNumPointsEmptyPoints() {
		//arrange
		LineString ls = new LineString();
		
		//act
		int num = ls.getNumPoints();
		
		//assert
		Assert.assertEquals(0,num,EPSILON);
	}
	
	@Test
	public void testGetNumPointsNoEmptyPoints() {
		//arrange
		LineString ls = SampleFactory.createLineStringOM();
		
		//act
		int num = ls.getNumPoints();
		
		//assert
		Assert.assertEquals(2,num,EPSILON);
	}
	
	@Test
	public void testGetPointNHappyPath() {
		//arrange
		LineString ls = SampleFactory.createLineStringOM();
		
		//act
		Point p = ls.getPointN(1);
		double px = p.getCoordinate().getX();
		double py = p.getCoordinate().getY();
		
		//assert
		Assert.assertEquals(4.0,px,EPSILON);
		Assert.assertEquals(-3.0,py,EPSILON);
	}
	
	@Test
	public void testGetType() {
		//arrange
		LineString ls = SampleFactory.createLineStringOM();
		
		//act
		String typeLs = ls.getType();
		
		//assert
		Assert.assertEquals("LineString", typeLs);
	}
	
	@Test
	public void testIsEmptyWithoutPoint() {
		//arrange
		LineString ls = new LineString();
		
		//act
		boolean b = ls.isEmpty();
		
		//assert
		Assert.assertTrue(b);
	}
	
	@Test
	public void testIsEmptyWithPoint() {
		//arrange
		LineString ls = SampleFactory.createLineStringOM();
		
		//act
		boolean b = ls.isEmpty();
		
		//assert
		Assert.assertFalse(b);
	}
	
	@Test
	public void testTranslateHappyPath() {
		//arrange
		LineString ls = SampleFactory.createLineStringOM();
		
		//act
		ls.translate(4.0,-5.0);
		Point p = ls.getPointN(1);
		double px = p.getCoordinate().getX();
		double py = p.getCoordinate().getY();
		
		//assert
		Assert.assertEquals(8.0,px,EPSILON);
		Assert.assertEquals(-8.0,py,EPSILON);
	}
	
	@Test
	public void testClone() {
		//arrange
		LineString ls = SampleFactory.createLineStringOM();
		
		//act
		LineString lsClone = ls.clone();
		lsClone.translate(1.0, 2.0);
		Point o1 = ls.getPointN(0);
		Point m1 = ls.getPointN(1);
		Point o2 = lsClone.getPointN(0);
		Point m2 = lsClone.getPointN(1);
		
		//assert
		Assert.assertNotSame(ls,lsClone);
		Assert.assertNotSame(o1.getCoordinate(),o2.getCoordinate());
		Assert.assertNotSame(m1.getCoordinate(),m2.getCoordinate());
	}

}
