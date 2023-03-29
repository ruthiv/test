package d.shape;

public class Circle extends Shape {
	private double radius;

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);

	}

	public Circle(double radius) {
		this.radius = radius;
	}

}
