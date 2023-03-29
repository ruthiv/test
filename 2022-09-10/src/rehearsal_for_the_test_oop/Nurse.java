package rehearsal_for_the_test_oop;

public class Nurse extends Person {
	private int roomNumber = 0;
	private int nurseNumber = 0;

	public Nurse() {
		if (roomNumber < 10) {
			++roomNumber;
		}
		if (nurseNumber < 10) {
			++nurseNumber;
		}
	}

	@Override
	public String toString() {
		return "id" + super.getId() + "name nurse: " + nurseNumber + "age:" + super.getAge()
				+ ", belong to room number :" + roomNumber;

	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
