package org.acme.geometry;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

    @Test
    public void testDefaultConstructor(){

        //TODO

        LineString l = new LineString();

        Assert.assertEquals(true, l.isEmpty());

    }

    @Test
    public void testConstructor(){

        //TODO
        
        Coordinate c = new Coordinate(0.1, 0.1);

        Point p1 = new Point(c);
        Point p2 = new Point(c);

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(p1);
        points.add(p2);

        LineString l = new LineString(points);

        Assert.assertEquals(false, l.isEmpty());
        Assert.assertEquals(2, l.getNumPoints());
        Assert.assertEquals(p1, l.getPointN(0));


    }


    
}
