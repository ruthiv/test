package d.shape;

public class Rectangle extends Shape {
	private double lengt;
	private double width;

	public double getArea() {
		return lengt * width;
	}

	public Rectangle(double lengt, double width) {
		this.lengt = lengt;
		this.width = width;
	}
}
