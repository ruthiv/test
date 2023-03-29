package johnbryce;

public class Sun {
	public final long diameter = 1391400000;

	public static final Sun instance = new Sun();

	// Block object creation from outside of this class
	private Sun() {

	}

}