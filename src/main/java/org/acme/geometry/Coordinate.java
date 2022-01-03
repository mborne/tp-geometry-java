package org.acme.geometry;

public class Coordinate {
	private double x = 0;
	private double y = 0;
	
	
	public Coordinate() {
		super();
		this.x = Double.NaN;
		this.y = Double.NaN;
	}


	public Coordinate(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


	public double getX() {
		return x;
	}


	public double getY() {
		return y;
	}
	
	public boolean isEmpty() {
		if (Double.isNaN(x)) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
