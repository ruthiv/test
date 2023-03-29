package c.points;

public class Pixel extends Point {
	private String color;

	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void print() {
		System.out.println("(" + getX() + " ," + getY() + ")" + color);
	}

}
