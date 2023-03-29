package rehearsal_for_the_test_oop;

public class Disease {
	private static int timeToCure = (int) (Math.random() * 19 + 3);
	private DiseaseDescription diseaseDescription;

	public Disease() {
		this.diseaseDescription = diseaseDescription.values()[(int) (Math.random() * 5)
				* diseaseDescription.values().length];

	}

	public int getTimeToCure() {
		return timeToCure;
	}

	public void setTimeToCure(int timeToCure) {
		this.timeToCure = timeToCure;
	}

	public DiseaseDescription getDiseaseDescription() {
		return diseaseDescription;
	}

	public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	@Override
	public String toString() {
		return "Disease Description:" + timeToCure + "Time To Cure:" + diseaseDescription + "days";
	}

}
