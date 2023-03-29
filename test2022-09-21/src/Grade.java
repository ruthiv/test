
public class Grade {
	private Profession profession;
	private int score;

	public Grade() {

	}

	public Grade(Profession profession, int score) {
		this.profession = profession;
		setScore(score);
	}

	public Profession getProfession() {
		return profession;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score >= 40 && score <= 100) {
			this.score = score;
		} else {
			System.out.println(" A score between 40 and 100 must be entered");
		}

	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Grade [profession=" + profession + ", score=" + score + "] \n";
	}

}
