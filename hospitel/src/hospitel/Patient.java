package hospitel;

public class Patient extends Person {
	private Disease disease;

	public Patient() {
		super("patient");
		this.disease = new Disease();
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "\thas " + disease + "\tand will be cured in approximately in "
				+ disease.getTimeToCure() + "days";
	}

}
