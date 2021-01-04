package org.acme.geometry;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

	@Test
	public void testGetType() {
		//arrange
		Point p = new Point();
		
		//act
		String typeP = p.getType();
		
		//assert
		Assert.assertEquals("Point",typeP);
	}

}
