package hospitel;

public class Nurse extends Person {
	private int roomNumber;

	public Nurse() {
		super("nurse");
		++this.roomNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return super.toString() + " belong to room number " + roomNumber;
	}

}
