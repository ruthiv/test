package b;

public class Rectangle extends Shape {
	private int length;
	private int width;

	@Override
	public double getArea() {
		return length * width;
	}

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", getColor()=" + getColor() + "]";
	}

}
