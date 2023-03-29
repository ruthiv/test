package f;

public class Superman {

	private int altitude;
	private static Superman instance = new Superman();

	public static Superman getInstance() {
		return instance;
	}

	private Superman() {

	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return "Superman [altitude=" + altitude + "]";
	}

}
