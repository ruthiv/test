import java.util.Arrays;

public class Student extends Person {

	private Grade[] grades;
	private int IGrade = 0;

	public Student(String name, int age) {
		super(name, age);
		this.grades = new Grade[Profession.values().length];
		for (int i = 0; i < grades.length; i++) {
			grades[i] = new Grade(Profession.values()[i], (int) (Math.random() * 61 + 40));
		}
	}

	public Student(String name, int age, Grade[] grades) {
		super(name, age);
		this.grades = grades;
		for (int i = 0; i < grades.length; i++) {
			grades[i] = new Grade(Profession.values()[i], (int) (Math.random() * 61 + 40));
		}

	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	public void addGrage(Profession profession, int score) {
		this.grades[this.IGrade] = new Grade(profession, score);
		this.IGrade++;
	}

	@Override
	public String toString() {
		return "\n Student " + super.toString() + " grades= \n" + Arrays.toString(grades) + "\n";
	}

}
