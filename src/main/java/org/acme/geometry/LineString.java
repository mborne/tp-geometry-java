package org.acme.geometry;

import java.util.List;

public class LineString implements Geometry {
	private List<Point> points;

	public LineString() {
		super();
	}

	public LineString(List<Point> points) {
		super();
		this.points = points;
	}
	
	public int getNumPoints() {
		return points.size();
	}
	
	public Point getPointN(int n) {
		return points.get(n);
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "LineString";
	}
	
}
