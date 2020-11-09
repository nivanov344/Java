package school;

public class Circle {
	double radius;
	
	public Circle (double newRadius) {
		radius = newRadius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	void setRadius (double newRadius) {
		radius = newRadius;
	}
	double getRadius() {
		return radius;
	}
}
