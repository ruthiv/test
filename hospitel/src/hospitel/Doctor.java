package hospitel;

public class Doctor extends Person {
	private int roomNumber;
	private DiseaseDescription diseaseSpeciatly;

	public Doctor() {
		super("doctor");
		++this.roomNumber;
		this.diseaseSpeciatly = DiseaseDescription.values()[(int) (Math.random() * DiseaseDescription.values().length)];
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public DiseaseDescription getDiseaseSpeciatly() {
		return diseaseSpeciatly;
	}

	public void setDiseaseSpeciatly(DiseaseDescription diseaseSpeciatly) {
		this.diseaseSpeciatly = diseaseSpeciatly;
	}

	@Override
	public String toString() {
		return super.toString() + "\tspecialist to cure " + diseaseSpeciatly + "\tand belong to room number "
				+ roomNumber;

	}

}
