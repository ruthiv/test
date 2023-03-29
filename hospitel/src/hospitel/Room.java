package hospitel;

import java.util.Arrays;

public class Room {
	private int roomNumber;
	private static int Number = 0;
	private Doctor doctor;
	private Nurse nurse;
	private Patient[] patients;

	public Room() {
		this.roomNumber = ++Number;
		this.doctor = new Doctor();
		this.nurse = new Nurse();
		this.patients = new Patient[5];
		for (int i = 0; i < patients.length; i++) {
			patients[i] = new Patient();
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

	public Patient[] getPatients() {
		return patients;
	}

	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

	@Override
	public String toString() {
		return "\n\nRoomNumber=" + roomNumber + " \n doctor=" + doctor + " \n nurse=" + nurse + "\n patients="
				+ Arrays.toString(patients);
	}

}
