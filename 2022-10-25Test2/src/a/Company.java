package a;

import java.util.Arrays;

public class Company {

	private Department[] departments;

	public Company() {
		this.departments = new Department[5];
		for (int i = 0; i < departments.length; i++) {
			this.departments[i] = new Department();
		}
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "\t\t=======Company Bank Poalim======\n" + Arrays.toString(departments);
	}

}
