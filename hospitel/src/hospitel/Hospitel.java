package hospitel;

import java.util.Arrays;

public class Hospitel {
	private String name;
	private Room[] rooms;

	public Hospitel() {
		this.name = "HaSharon";
		this.rooms = new Room[10];
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

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hospitel " + name + "\n rooms=" + Arrays.toString(rooms);
	}

}
