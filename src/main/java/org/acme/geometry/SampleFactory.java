package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class SampleFactory {
	
	public static Point createPointO() {
		return new Point(new Coordinate(0.0,0.0));
	}
	
	public static Point createPointM() {
		return new Point(new Coordinate(4.0,-3.0));
	}
	
	public static LineString createLineStringOM() {
		Point O = createPointO();
		Point M = createPointM();
		List<Point> l = new ArrayList<Point>();
		l.add(O);
		l.add(M);
		return new LineString(l);
	}
}
