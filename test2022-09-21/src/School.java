import java.util.Arrays;

public class School {
	private ClassRoom[] classRoom;
	// private int IClassRoom = 0;

	public School() {
		this.classRoom = new ClassRoom[5];
		for (int i = 0; i < classRoom.length; i++) {
			classRoom[i] = new ClassRoom();
		}
	}

	public School(ClassRoom[] classRoom) {
		super();
		this.classRoom = classRoom;
	}

	public ClassRoom[] getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ClassRoom[] classRoom) {
		this.classRoom = classRoom;
	}

	@Override
	public String toString() {
		return "School [classRoom=" + Arrays.toString(classRoom);
	}

//	public void addClassRoom(String name, Teacher teacher, Student[] students) {
//		this.classRoom = new ClassRoom[5];
//		for (int i = 0; i < this.classRoom.length; i++) {
//			this.classRoom
//		}
//
//	}

}
