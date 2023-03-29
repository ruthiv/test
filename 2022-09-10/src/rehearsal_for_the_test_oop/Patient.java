package rehearsal_for_the_test_oop;

public class Patient extends Person {
	private Disease disease;
	private int timeToCure;
	Patient[] patient;

	public Patient() {
		patient = new Patient[5];
		for (int i = 0; i < patient.length; i++) {
			patient[i].disease = new Disease();
			patient[i].timeToCure = (int) (Math.random() * 19 + 3);

		}

	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	public int getTimeToCure() {
		return timeToCure;
	}

	public void setTimeToCure(int timeToCure) {
		this.timeToCure = timeToCure;
	}

	public void timeToCure(int timeToCure) {
		this.timeToCure = timeToCure;
	}

	@Override
	public String toString() {
		return super.toString() + "has" + disease + "and will be cured in approximately in " + timeToCure + " days";
	}

}
