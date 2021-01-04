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
		List<Point> p = new ArrayList<Point>();
		p.add(new Point(new Coordinate(2.0,2.0)));
		p.add(new Point(new Coordinate(1.0,6.0)));
		LineString ls = new LineString(p);
		
		//act
		int num = ls.getNumPoints();
		
		//assert
		Assert.assertEquals(2,num,EPSILON);
	}
	
	@Test
	public void testGetPointNHappyPath() {
		//arrange
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(new Coordinate(2.0,2.0)));
		points.add(new Point(new Coordinate(1.0,6.0)));
		LineString ls = new LineString(points);
		
		//act
		Point p = ls.getPointN(1);
		double px = p.getCoordinate().getX();
		double py = p.getCoordinate().getY();
		
		//assert
		Assert.assertEquals(1.0,px,EPSILON);
		Assert.assertEquals(6.0,py,EPSILON);
	}
	
	@Test
	public void testGetType() {
		//arrange
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(new Coordinate(2.0,2.0)));
		points.add(new Point(new Coordinate(1.0,6.0)));
		LineString ls = new LineString(points);
		
		//act
		String typeLs = ls.getType();
		
		//assert
		Assert.assertEquals("LineString", typeLs);
	}

}
