package school;

public class RegularPolygon {

	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon () {}
	public RegularPolygon (int sides, double setSideLength) {
		n = sides;
		sideLength = setSideLength;
	}
	public RegularPolygon (int sides, double setSideLength, double xCoordinate, double yCoordinate) {
		n = sides;
		sideLength = setSideLength;
		x = xCoordinate;
		y = yCoordinate;		
	}
	public void setSides (int newSides) {
		n = newSides;
	}
	public void setSideLength (int newSideLength) {
		sideLength = newSideLength;
	}
	public void setX (int newX) {
		x = newX;
	}
	public double getPerimeter () {
		return n * sideLength;
	}
	public double getArea() {
		return (n * sideLength * sideLength)/(4 * Math.tan(180/n));
	}
}
