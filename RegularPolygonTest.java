package school;

public class RegularPolygonTest {

	public static void main(String[] args) {
		
		RegularPolygon rp1 = new RegularPolygon (6, 4);
		RegularPolygon rp2 = new RegularPolygon (10, 4, 5.6, 7.8);
		RegularPolygon rp3 = new RegularPolygon (6, 9);
		
		System.out.println("The perimeters of the polygons are " + rp1.getPerimeter() + rp2.getPerimeter() + rp3.getPerimeter());
		System.out.println("The areas of the polygons are " + rp1.getArea() + rp2.getArea() + rp3.getArea());
		
	}

}
