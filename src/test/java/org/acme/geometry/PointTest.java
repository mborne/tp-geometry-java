package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    public static final double EPSILON = 1.0e-15;

    @Test
    public void testDefaultConstructor(){
        Point p = new Point();
        Assert.assertEquals(Double.NaN, p.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(Double.NaN, p.getCoordinate().getY(), EPSILON);
    }
    @Test
    public void testConstructorXY(){
        Coordinate c = GeometryFactory.createCoordinate();
        Point p = new Point(c);
        Assert.assertSame(c, p.getCoordinate());

    }

    @Test
    public void testGetType(){
        Point p = new Point();
        Assert.assertEquals("Point", p.getType());
    }

    @Test
    public void testIsEmpty(){
        Point p = new Point();
        Assert.assertTrue(p.isEmpty());
    }
}
