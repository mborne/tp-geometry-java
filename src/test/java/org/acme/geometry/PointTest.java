package org.acme.geometry;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

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

        Assert.assertEquals("POINT", p.getType());
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

    @Test
    public void testClone(){

        //TODO

        Coordinate c = new Coordinate(0.1,0.1);
        Point p = new Point(c);
        Point pClone = p.clone();

        Double dx = 1.0;
        Double dy = 1.0;

        pClone.translate(dx, dy);



        Assert.assertEquals(0.1, p.getCoordinate().getY(), EPSILON);
        Assert.assertEquals(1.1, pClone.getCoordinate().getY(), EPSILON);

    }

    @Test
    public void testGetEnvelope(){

        Double x = 0.1;
        Double y = 0.1;

        Coordinate coordinate = new Coordinate( x, y);
        Point point = new Point(coordinate);

        Envelope envelope = point.getEnvelope();

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

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(os);
        GeometryVisitor visitor = new LogGeometryVisitor(out);
        WktVisitor visitorWkt = new WktVisitor();
        WktVisitor visitorWktEmpty = new WktVisitor();

        p1.accept(visitor);
        p1.accept(visitorWkt);

        Point pEmpty = new Point();
        pEmpty.accept(visitorWktEmpty);
        

        String result = os.toString("UTF8");

        Assert.assertEquals("Je suis un point avec x=0.1 et y=0.1", result);
        Assert.assertEquals( "POINT(0.1 0.1)", visitorWkt.getResult());
        Assert.assertEquals("POINT EMPTY", visitorWktEmpty.getResult());



    }
}
