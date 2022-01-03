package org.acme.geometry;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

    public static final double EPSILON = 1.0e-15;

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

    @Test
    public void testTranslate(){

        //TODO

        Coordinate c = new Coordinate(0.1, 0.1);

        Point p1 = new Point(c);
        Point p2 = new Point(c);

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(p1);
        points.add(p2);

        LineString l = new LineString(points);

        Double dx = 1.0;
        Double dy = 1.0;

        l.translate(dx,dy);
        
        Assert.assertEquals(1.1, l.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(1.1, l.getPointN(0).getCoordinate().getY(), EPSILON);
        Assert.assertEquals(1.1, l.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(1.1, l.getPointN(1).getCoordinate().getY(), EPSILON);
            
        

    }

    @Test
    public void testClone(){

        //TODO

        Coordinate c = new Coordinate(0.1, 0.1);

        Point p1 = new Point(c);
        Point p2 = new Point(c);

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(p1);
        points.add(p2);

        LineString l = new LineString(points);

        Double dx = 1.0;
        Double dy = 1.0;

        LineString lClone = l.clone();

        lClone.translate(dx,dy);

        Assert.assertEquals(1.1, lClone.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(0.1, l.getPointN(0).getCoordinate().getY(), EPSILON);


    }


    
}
