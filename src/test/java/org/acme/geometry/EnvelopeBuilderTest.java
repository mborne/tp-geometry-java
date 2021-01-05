package org.acme.geometry;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeBuilderTest {
	
	public static final double EPSILON = 1.0e-15;

	@Test
	public void testBuild() {
		//arrange
		EnvelopeBuilder builder = new EnvelopeBuilder();
		builder.insert(new Coordinate(0.0,1.0));
		builder.insert(new Coordinate(2.0,0.0));
		builder.insert(new Coordinate(1.0,3.0));
		
		//act
		Envelope result = builder.build();
		boolean constructionEmptyness = result.isEmpty();
		double xmin = result.getXmin();
		double xmax = result.getXmax();
		double ymin = result.getYmin();
		double ymax = result.getYmax();
		
		//assert
		Assert.assertFalse(constructionEmptyness);
		Assert.assertEquals(0.0, xmin, EPSILON);
		Assert.assertEquals(0.0, ymin, EPSILON);
		Assert.assertEquals(2.0, xmax, EPSILON);
		Assert.assertEquals(3.0, ymax, EPSILON);
	}

}
