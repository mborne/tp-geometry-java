package org.acme.geometry;
import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{
	
	private List<Point> points;
	
	public LineString() {
		this.points = new ArrayList<Point>();
	}
	
	public LineString(List<Point> points) {
		this.points = points;
	}
	
	public int getNumPoints() {
		return this.points.size();
	}
	
	public Point getPointN(int n) {
		return this.points.get(n);
	}
	
	public String getType() {
		return "LineString";
	}
	
	public boolean isEmpty() {
		return this.getNumPoints() == 0;
	}
	
	public void translate(double dx, double dy) {
		
		for(Point point : points) {
			point.translate(dx, dy);
		}
		
		return;
	}
	
	public Geometry clone() {
		return null;
	}
	
}
