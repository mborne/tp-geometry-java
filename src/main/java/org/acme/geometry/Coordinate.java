package org.acme.geometry;

public class Coordinate {
	public double x = 0.0;
	public double y = 0.0;
	
	public Coordinate() {
	}
	
	public Coordinate(double X, double Y) {
		this.x=X;
		this.y=Y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
}

