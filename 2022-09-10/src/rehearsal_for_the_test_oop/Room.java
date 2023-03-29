package rehearsal_for_the_test_oop;

public class Room {
	private int roomNumber;
	private Doctor doctor;
	private Nurse nurse;
	public final static int MAX_PATIENTS = 5;
	private Patient[] patient;

	public Room() {
		doctor = new Doctor();
		nurse = new Nurse();
		patient = new Patient[MAX_PATIENTS];
		for (int i = 0; i < patient.length; i++) {
			patient[i] = new Patient();
		}

	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public Patient[] getPatient() {
		return patient;
	}

	public void setPatient(Patient[] patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "roomNumber:" + roomNumber + "doctor details:" + doctor.toString() + "nurse details:" + nurse.toString()
				+ "patients details" + patient.toString();
	}

}
