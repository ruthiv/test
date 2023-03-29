public class SchoolStatistics {

	public static void main(String[] args) {
//		School school = getSchool();
//		System.out.println(school);
//		System.out.println("school avg " + getSchoolAvg(school));
//		printClassRoomAvg(school);
//		printProfessionAvg(school);
//		printAgeAvg(school);
//		printTeacherCount(school);

		School school = new School();
		System.out.println(school);
	}

	public static void printTeacherCount(School school) {
		int counter = 0;
		for (int i = 0; i < school.getClassRoom().length; i++) {
			if (school.getClassRoom()[i].getTeacher().getProfession() == Profession.MATH
					|| school.getClassRoom()[i].getTeacher().getProfession() == Profession.PHYSICS) {
				counter++;
			}

		}
		System.out.println("Number of teachers teaching in the real subjects " + counter);
	}

	public static void printAgeAvg(School school) {
		int sum = 0, counter = 0;
		for (int i = 0; i < school.getClassRoom().length; i++) {
			Student[] students = school.getClassRoom()[i].getStudents();
			counter += students.length;
			for (int j = 0; j < students.length; j++) {
				sum += students[j].getAge();
			}
		}
		System.out.println("age avg all students " + sum / counter);
	}

	public static void printProfessionAvg(School school) {
		int sum = 0, counter = 0, avgP = 0;
		for (int i = 0; i < Profession.values().length; i++) {
			for (int j = 0; j < school.getClassRoom().length; j++) {
				Student[] students = school.getClassRoom()[j].getStudents();
				counter += students.length;
				for (int k = 0; k < students.length; k++) {
					sum += students[k].getGrades()[i].getScore();
				}

			}
			avgP = sum / counter;
			sum = 0;
			counter = 0;
			System.out.println(Profession.values()[i].toString() + " avg Profession is " + avgP);
		}
	}

	public static void printClassRoomAvg(School school) {
		int sum = 0, counter = 0, avgS = 0, avgC = 0;
		for (int i = 0; i < school.getClassRoom().length; i++) {
			Student[] students = school.getClassRoom()[i].getStudents();
			counter += students.length;
			for (int j = 0; j < students.length; j++) {
				Grade[] grades = students[j].getGrades();
				for (int k = 0; k < grades.length; k++) {
					sum += grades[k].getScore();
				}
				avgS += sum / grades.length;
				sum = 0;
			}
			avgC = avgS / students.length;
			avgS = 0;
			System.out.println(school.getClassRoom()[i].getName() + " avg is " + avgC);
		}
	}

	public static double getSchoolAvg(School school) {
		int sum = 0, counter = 0, avgS = 0, avgC = 0;
		for (int i = 0; i < school.getClassRoom().length; i++) {
			Student[] students = school.getClassRoom()[i].getStudents();
			counter += students.length;
			for (int j = 0; j < students.length; j++) {
				Grade[] grades = students[j].getGrades();
				for (int k = 0; k < grades.length; k++) {
					sum += grades[k].getScore();
				}
				avgS += sum / grades.length;
				sum = 0;
			}
			avgC += avgS / students.length;
			avgS = 0;
		}
		return avgC / school.getClassRoom().length;

	}

	public static Teacher getRandomTeacher() {
		String[] names = { "DAN", "SIR", "GAL", "LEA", "DOR", "BAR" };
		int random = (int) (Math.random() * names.length - 1);
		String name = names[random];
		int age = (int) (Math.random() * 101 + 20);
		int random2 = (int) (Math.random() * Profession.values().length - 1);
		Teacher teacher = new Teacher(name, age, Profession.values()[random2]);
		return teacher;
	}

	public static Student getRandomStudent() {
		String[] names = { "DAN", "SIR", "GAL", "LEA", "DOR", "BAR" };
		int random = (int) (Math.random() * names.length - 1);
		String name = names[random];
		int age = (int) (Math.random() * 101 + 20);
		Student student = new Student(name, age, new Grade[6]);
		student.addGrage(Profession.CHEMISTRY, (int) (Math.random() * 61 + 40));
		student.addGrage(Profession.GEOGRAPHY, (int) (Math.random() * 61 + 40));
		student.addGrage(Profession.LITERATURE, (int) (Math.random() * 61 + 40));
		student.addGrage(Profession.MATH, (int) (Math.random() * 61 + 40));
		student.addGrage(Profession.PHYSICS, (int) (Math.random() * 61 + 40));
		student.addGrage(Profession.SPORTS, (int) (Math.random() * 61 + 40));
		return student;

	}

	public static School getSchool() {
		School school = new School(new ClassRoom[2]);
		for (int i = 0; i < school.getClassRoom().length; i++) {
			ClassRoom classRoom = new ClassRoom("room" + i, getRandomTeacher(), new Student[2]);
			school.getClassRoom()[i] = classRoom;
			for (int j = 0; j < classRoom.getStudents().length; j++) {
				classRoom.getStudents()[j] = getRandomStudent();
			}
		}
		return school;
	}

}
