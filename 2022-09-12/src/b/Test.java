package b;

public class Test {

	public static void main(String[] args) {
		Shape s = new Rectangle("Red", 100, 30);
		System.out.println(s.getColor());
		System.out.println(s.getArea());

		// to call rectangle method - cast the reference to rectangle
		((Rectangle) s).setWidth(30);

		Rectangle rectangle = (Rectangle) s;
		rectangle.setWidth(25);

		// an array of any shape would be of type shape
		Shape[] shapes = new Shape[3];
	}

// a method for printing the area of any shape will get shape as paramet
	public static void printAnyShape(Shape s) {
		System.out.println("Area is: " + s.getArea());
	}

}
