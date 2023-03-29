import java.util.Arrays;

public class ClassRoom {
	private String name;
	private int counter = 0;
	private Teacher teacher;
	private Student[] students;
	private int IStudent = 0;

	public ClassRoom() {
		this.name = "ClassRoom" + ++counter;
		String[] names = { "DAN", "SIR", "GAL", "LEA", "DOR", "BAR" };
		int random = (int) (Math.random() * names.length - 1);
		String name = names[random];
		int age = (int) (Math.random() * 101 + 20);
		int random2 = (int) (Math.random() * Profession.values().length - 1);
		this.teacher = new Teacher(name, age, Profession.values()[random2]);
		this.students = new Student[15];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(name, age, new Grade[6]);
		}

	}

	public ClassRoom(String name, Teacher teacher, Student[] students) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}

	// public ClassRoom(String name) {
	// super();
	// this.name = name;
	// this.teacher = new Teacher();
	// students = new Student[15];
	// for (int i = 0; i < students.length; i++) {
	// students[i] = new Student();
	// }
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students[IStudent] = student;
		IStudent++;
	}

	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", teacher=" + teacher + Arrays.toString(students) + "\n";
	}

}
