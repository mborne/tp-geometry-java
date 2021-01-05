package org.acme.geometry;

public class Envelope {
	
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Envelope() {
		
	}
	
	public Envelope(Coordinate bottomLeft, Coordinate topRight) {
		
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public double getXmin() {
		return Double.NaN;
	}
	
	public double getXmax() {
		return Double.NaN;
	}
	
	public double getYmin() {
		return Double.NaN;
	}
	
	public double getYmax() {
		return Double.NaN;
	}
}
