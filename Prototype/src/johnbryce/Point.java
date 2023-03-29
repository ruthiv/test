package johnbryce;

public class Point implements Cloneable {
	private int x;
	private int y;

	@Override
	public Object clone() {
		return new Point(x, y);
	}

	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	public void display() {
		System.out.println("X: " + x + "  Y:" + y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
