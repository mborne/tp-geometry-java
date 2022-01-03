package org.acme.geometry;

public class Point implements Geometry {
	private Coordinate coordinate;

	public Point() {
		super();
	}

	public Point(Coordinate coordinate) {
		super();
		this.coordinate = coordinate;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Point";
	}
	
	
}
