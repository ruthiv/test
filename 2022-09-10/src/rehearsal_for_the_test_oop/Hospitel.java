package rehearsal_for_the_test_oop;

import java.util.Arrays;

public class Hospitel {
	private static int counter = 0;
	private String name;
	public final static int MAX_ROOM = 10;
	private Room[] rooms;

	public Hospitel() {
		this.name = name.valueOf(counter);
		counter++;
		rooms = new Room[MAX_ROOM];
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room();
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room[] getRoom() {
		return rooms;
	}

	public void setRoom(Room[] room) {
		this.rooms = room;
	}

	@Override
	public String toString() {
		return "Hospitel [name=" + name + ", room=" + Arrays.toString(rooms) + "]";
	}

}
