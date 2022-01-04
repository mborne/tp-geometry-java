package org.acme.geometry;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {

    @Test
    public void testWrite(){


        WktWriter writer = new WktWriter();

        Geometry gPointNotEmpty = new Point(new Coordinate(3.0,4.0));
        Geometry gPointEmpty = new Point();

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(new Coordinate(1.0,1.0)));
        points.add(new Point(new Coordinate(2.0,1.0)));
        points.add(new Point(new Coordinate(3.0,1.0)));
        Geometry lineStringEmpty = new LineString();
        Geometry lineStringNotEmpty = new LineString(points);
        
        Assert.assertEquals("POINT(3.0 4.0)", writer.write(gPointNotEmpty));
        Assert.assertEquals("POINT EMPTY", writer.write(gPointEmpty));
        Assert.assertEquals("LINESTRING EMPTY", writer.write(lineStringEmpty));
        Assert.assertEquals("LINESTRING(1.0 1.0,2.0 1.0,3.0 1.0)", writer.write(lineStringNotEmpty));
    }
    
}
