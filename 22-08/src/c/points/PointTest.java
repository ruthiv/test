package c.points;

public class PointTest {

	public static void main(String[] args) {
		Point p1 = new Point(3, 7);
		Point p2 = new Point(5);
		Point p3 = new Point();

		p1.print();
		p2.print();
		p3.print();

		System.out.println("===============");
		p1.moveRight();
		p2.moveUp();
		p2.print();
		p3.print();
	}

}
