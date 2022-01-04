package org.acme.geometry;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {

    

    static Double xMin = 0.1;
    static Double yMin = 0.1;
    static Double xMax = 1.0;
    static Double yMax = 1.0;

    static Coordinate bottomLeft = new Coordinate(xMin, yMin);
    static Coordinate topRight = new Coordinate(xMax, yMax);

    static Envelope envelope = new Envelope(bottomLeft, topRight);

    @Test
    public void testDefaultConstructor(){

        //TODO

        Envelope envelopeDefault = new Envelope();

        Assert.assertEquals(true, envelopeDefault.isEmpty());

    }

    public void testConstructor(){

        //TODO

        
        Assert.assertEquals(false, envelope.isEmpty());
        Assert.assertEquals(xMax, envelope.getXmax());
        Assert.assertEquals(xMin, envelope.getXmin());
        Assert.assertEquals(yMax, envelope.getYmax());
        Assert.assertEquals(yMin, envelope.getYmin());


    }

    
}
