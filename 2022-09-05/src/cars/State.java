package cars;

public class State {
	private String name;
	private Highway[] highways = new Highway[5];
	private int i;

	public State(String name) {
		super();
		this.name = name;
	}

	public void addHighway(Highway highway) {
		highways[i++] = highway;
	}

	public String getName() {
		return name;
	}

	public Highway[] getHighways() {
		return highways;
	}

	public int getNumberOfCars(int road) {
		int counter = 0;
		for (int i = 0; i < highways[road].getCars().length; i++) {
			if (highways[road].getCars()[i] != null) {
				counter++;
			}
		}
		return counter;
	}

	public String getRoadHighway() {
		int numberMax = 0, max = 0;
		String nameMax = "";
		for (int i = 0; i < highways.length; i++) {
			if (highways[i] != null) {
				for (int j = 0; j < highways[i].getCars().length; j++) {
					if (highways[i].getCars()[j] != null) {
						max += highways[i].getCars()[j].getSpeed();
					}
				}
				max /= highways[i].getCars().length;
			}
			if (numberMax < max) {
				numberMax = max;
				nameMax = highways[i].getName();
			}

		}
		return nameMax;
	}

	public String getRoadSlow() {
		int numberMin = 200, min = 0;
		String nameMin = "";
		for (int i = 0; i < highways.length; i++) {
			if (highways[i] != null) {
				for (int j = 0; j < highways[i].getCars().length; j++) {
					if (highways[i].getCars()[j] != null) {
						min += highways[i].getCars()[j].getSpeed();
					}
				}
				min /= highways[i].getCars().length;
			}
			if (numberMin > min) {
				numberMin = min;
				nameMin = highways[i].getName();
			}

		}
		return nameMin;
	}

}
