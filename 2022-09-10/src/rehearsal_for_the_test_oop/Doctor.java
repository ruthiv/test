package rehearsal_for_the_test_oop;

public class Doctor extends Person {
	private int roomNumber = 0;
	private int doctorNumber = 0;
	private DiseaseDescription diseaseDescription;

	public Doctor() {
		if (roomNumber < 10) {
			++roomNumber;
		}
		if (doctorNumber < 10) {
			++doctorNumber;
		}
	}

	@Override
	public String toString() {
		return "id" + super.getId() + "name doctor: " + doctorNumber + "age:" + super.getAge() + "specialist to cure "
				+ diseaseDescription + "and belong to room number " + roomNumber;

	}

	public DiseaseDescription getDiseaseDescription() {
		return diseaseDescription;
	}

	public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
