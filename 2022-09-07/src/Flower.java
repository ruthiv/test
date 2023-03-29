
public class Flower {

	private static int counter;
	public final static int MAX_HEIGHT = 20;
	public final String color = "red";
	private int height;
	private int numberOfPetals;

	public Flower() {
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getNumberOfPetals() {
		return numberOfPetals;
	}

	public void setNumberOfPetals(int numberOfPetals) {
		this.numberOfPetals = numberOfPetals;
	}

}
