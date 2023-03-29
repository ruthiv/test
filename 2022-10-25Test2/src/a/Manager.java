package a;

public class Manager extends Employee {

	public Manager(String name, int index) {
		super(name, index);

	}

	@Override
	public String toString() {
		return "Manager" + super.toString();
	}

}
