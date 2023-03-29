
public class Fruit {
	private int size = 3;

	public Fruit(int size) {
		super();
		setSize(size);
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size >= 3 && size <= 5) {
			this.size = size;
		}
	}

}
