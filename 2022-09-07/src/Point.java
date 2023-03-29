
public class Point {
	private int x;
	private int y;
	private static int counter;
	public final int index = ++counter;
	public static final int Max = 100;
	public static final int MIN = 0;
	private String name;

	public Point() {

	}

	public Point(String name, int x, int y) {
		super();
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", index=" + index + ", name=" + name + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= MIN && x <= Max) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getCounter() {
		return counter;
	}

}
