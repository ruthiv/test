package b;

public class Circle extends Shape {
	private int radius;

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		int area = (int) (Math.PI * Math.pow(radius, 2));
		return area;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
