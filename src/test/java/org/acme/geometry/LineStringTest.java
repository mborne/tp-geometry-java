package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
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
        Assert.assertEquals(0.1, l.getPointN(0).getCoordinate().getX(), EPSILON);


    }

    @Test
    public void testGetEnvelope(){

        Double x = 0.1;
        Double y = 0.1;

        Coordinate c = new Coordinate(x, y);

        Point p1 = new Point(c);
        Point p2 = new Point(c);

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(p1);
        points.add(p2);

        LineString l = new LineString(points);

        Envelope envelope = l.getEnvelope();

        Assert.assertEquals(false, envelope.isEmpty());
        Assert.assertEquals(x, envelope.getXmax());
        Assert.assertEquals(x, envelope.getXmin());
        Assert.assertEquals(y, envelope.getYmax());
        Assert.assertEquals(y, envelope.getYmin());
    }

    @Test
    public void testAccept() throws UnsupportedEncodingException{

        Double x = 0.1;
        Double y = 0.1;

        Coordinate c = new Coordinate(x, y);

        Point p1 = new Point(c);
        Point p2 = new Point(c);

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(p1);
        points.add(p2);

        LineString l = new LineString(points);

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        GeometryVisitor visitor = new LogGeometryVisitor(out);

        WktVisitor visitorWkt = new WktVisitor();
        WktVisitor visitorWktEmpty = new WktVisitor();

        l.accept(visitor);

        l.accept(visitorWkt);
        
        LineString lEmpty = new LineString();
        lEmpty.accept(visitorWktEmpty);

        String result = os.toString("UTF8");

        Assert.assertEquals("Je suis une polyligne définie par 2 point(s)", result);

        Assert.assertEquals("LINESTRING(0.1 0.1,0.1 0.1)", visitorWkt.getResult());
        Assert.assertEquals("LINESTRING EMPTY", visitorWktEmpty.getResult());


    }

    
}
