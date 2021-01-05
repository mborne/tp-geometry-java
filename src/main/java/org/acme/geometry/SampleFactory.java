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
	
	public static Point createPointA() {
		return new Point(new Coordinate(2.0,2.0));
	}
	
	public static Point createPointE() {
		return new Point(new Coordinate(6.5,1.0));
	}
	
	public static LineString createLineStringOM() {
		Point O = createPointO();
		Point M = createPointM();
		List<Point> l = new ArrayList<Point>();
		l.add(O);
		l.add(M);
		return new LineString(l);
	}
	
	public static LineString createLineStringOMAE() {
		List<Point> l = new ArrayList<Point>();
		l.add(createPointO());
		l.add(createPointM());
		l.add(createPointA());
		l.add(createPointE());
		return new LineString(l);
	}
}
