package org.acme.geometry;

import org.junit.Test;

import junit.framework.Assert;

public class GeometryWithCacheEnvelopeTest {

    @Test
    public void getEnvelopeTest(){

        Geometry g = new Point(new Coordinate(3.0,3.0));
        g = new GeometryWithCacheEnvelope(g);

        Envelope a = g.getEnvelope() ; 
        Envelope b = g.getEnvelope() ; 

        Assert.assertSame(a,b);
    }
    
}
