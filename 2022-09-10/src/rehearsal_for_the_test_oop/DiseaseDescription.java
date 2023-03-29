package rehearsal_for_the_test_oop;

public enum DiseaseDescription {
	tuberculosis(0), pneumonia(1), covid19(2), fracture(3), cardio(4);

	private int value = 0;

	private DiseaseDescription(int value) {
		this.value = value;

	}

	public int getValue() {
		return value;
	}

}
