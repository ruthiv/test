package targil;

public class Line {
	private int length;
	private char c;

	public void print() {
		for (int i = 0; i < this.length; i++) {
			System.out.print(this.c);
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length, char c) {
		this.length = length;
		this.c = c;

	}

}
