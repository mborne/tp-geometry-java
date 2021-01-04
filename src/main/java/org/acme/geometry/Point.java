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
	
	public boolean isEmpty() {
		return this.coordinate.isEmpty();
	}
	
	public void translate(double dx, double dy) {
		
		this.coordinate = new Coordinate(this.getCoordinate().getX()+dx,this.getCoordinate().getY()+dy);
		
		return;
	}
}
