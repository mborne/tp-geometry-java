package org.acme.geometry;



import org.junit.Assert;
import org.junit.Test;

public class EnvelopeBuilderTest {


    @Test
    public void testBuild(){

        Double xMin = 0.1;
        Double yMin = 0.1;

        Double xMax = 1.0;
        Double yMax = 1.0;

        Coordinate coordinateB = new Coordinate(xMax, yMax);
        Coordinate coordinateC = new Coordinate(xMin, yMin);
        Coordinate coordinateD = new Coordinate(xMax, yMin);
        Coordinate coordinateE = new Coordinate(xMin, yMin);

        EnvelopeBuilder envelopeBuilder = new EnvelopeBuilder();

        envelopeBuilder.insert(coordinateB);
        envelopeBuilder.insert(coordinateC);
        envelopeBuilder.insert(coordinateD);
        envelopeBuilder.insert(coordinateE);

        Envelope envelope = envelopeBuilder.build();

        Assert.assertEquals(false, envelope.isEmpty());
        Assert.assertEquals(xMax, envelope.getXmax());
        Assert.assertEquals(xMin, envelope.getXmin());
        Assert.assertEquals(yMax, envelope.getYmax());
        Assert.assertEquals(yMin, envelope.getYmin());




    }



    
    
}
