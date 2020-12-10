package school;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint a = new MyPoint(4, 3);
		MyPoint b = new MyPoint(3, -2);
		
		System.out.println(MyPoint.distance(a, b));
		System.out.println(a.distance(b));
		System.out.println(a.distance(3, -2));
	}

}
