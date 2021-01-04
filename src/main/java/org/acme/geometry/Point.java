package org.acme.geometry;

public class Point implements Geometry{
	private Coordinate coordinate;
	
	public String getType() {
		return "Point";
	} 
	
	public Point() {
		this.coordinate = new Coordinate();
	}
	
	public Point(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public Coordinate getCoordinate() {
		return this.coordinate;
	}
}
