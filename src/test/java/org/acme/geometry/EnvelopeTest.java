package org.acme.geometry;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {

	@Test
	public void testIsEmptyTrue() {		
		//arrange
		Coordinate bl = new Coordinate();
		Coordinate tr = new Coordinate(5.0,8.0);
		Envelope envelope = new Envelope(bl,tr);
		
		//act
		boolean b = envelope.isEmpty();
		
		//assert
		Assert.assertTrue(b);
	}
	
	@Test
	public void testIsEmptyFalse() {
		//arrange
		Coordinate bl = new Coordinate(0.0,1.0);
		Coordinate tr = new Coordinate(5.0,8.0);
		Envelope envelope = new Envelope(bl,tr);
		
		//act
		boolean b = envelope.isEmpty();
		
		//assert
		Assert.assertFalse(b);
	}

}
