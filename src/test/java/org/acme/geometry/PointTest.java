package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    public static final double EPSILON = 1.0e-15;

    @Test
	public void testDefaultConstructor(){

		// TODO
		Point p = new Point();
		Assert.assertEquals(true, p.getCoordinate().isEmpty());
	}

    @Test 
    public void testConstructor(){

        //TODO

        Coordinate c = new Coordinate(0.1,0.1);
        Point p = new Point(c);

        Assert.assertEquals(c, p.getCoordinate());
    }

    @Test
    public void testType(){

        //TODO

        Point p = new Point();

        Assert.assertEquals("point", p.getType());
    }

    @Test
    public void testTranslate(){

        //TODO

        Coordinate c = new Coordinate(0.1,0.1);
        Point p = new Point(c);

        Double dx = 1.0;
        Double dy = 1.0;

        p.translate(dx, dy);

        Assert.assertEquals(1.1, p.getCoordinate().getX(), EPSILON);
        Assert.assertEquals(1.1, p.getCoordinate().getY(), EPSILON);

    }
}
