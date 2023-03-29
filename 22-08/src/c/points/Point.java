package c.points;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int val) {
		this.x = val;
		this.y = val;
	}

	public Point() {

	}

	public void moveRight() {
		x++;
	}

	public void moveUp() {
		y++;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void print() {
		System.out.println("(" + x + " ," + y + ")");
	}

}
