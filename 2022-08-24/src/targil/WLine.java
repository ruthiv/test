package targil;

public class WLine extends Line {
	private int width;

	public void print() {
		for (int i = 0; i < this.width; i++) {
			super.print();
			System.out.println();
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
