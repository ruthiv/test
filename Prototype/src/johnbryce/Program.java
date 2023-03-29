package johnbryce;

public class Program {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = (Point) p1.clone();

		p1.display();
		p2.display();
	}
}
