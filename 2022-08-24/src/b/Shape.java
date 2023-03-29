package b;

public class Shape {
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public Shape() {
		this("BLACK");
	}

	public String getColor() {
		return this.color;
	}

}
