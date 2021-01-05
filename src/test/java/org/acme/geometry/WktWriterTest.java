package org.acme.geometry;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class WktWriterTest {

	@Test
	public void testWriteEmptyPoint() {
		//arrange
		WktWriter wkt = new WktWriter();
		Point p = new Point();
		
		//act
		String str = wkt.write(p);
		
		//assert
		Assert.assertEquals("POINT EMPTY", str);
	}
	
	@Test
	public void testWritePointM() {
		//arrange
		WktWriter wkt = new WktWriter();
		Point M = SampleFactory.createPointM();
		
		//act
		String str = wkt.write(M);
		
		//assert
		Assert.assertEquals("POINT(4.0 -3.0)", str);
	}
	
	@Test
	public void testWriteLineEmptyString() {
		//arrange
		WktWriter wkt = new WktWriter();
		LineString ls = new LineString();
		
		//act
		String str = wkt.write(ls);
		
		//assert
		Assert.assertEquals("LINESTRING EMPTY",str);
	}
	
	@Test
	public void testWriteLinestringOM() {
		//arrange
		WktWriter wkt = new WktWriter();
		LineString ls = SampleFactory.createLineStringOM();
		
		//act
		String str = wkt.write(ls);
				
		//assert
		Assert.assertEquals("LINESTRING (0.0 0.0,4.0 -3.0)",str);
	}

}
