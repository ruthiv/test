package johnbryce;

public class Chrome extends Browser {

	@Override
	public void surf(String url) {
		System.out.println("Surfing to: " + url);

	}

}
