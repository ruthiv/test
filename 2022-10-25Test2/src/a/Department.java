package a;

import java.util.Arrays;

public class Department {
	private static int index = 0;
	private static int indexManager = 1;
	private static int indexEmployee = 1;
	private Names names;
	private String name;
	private Manager manager;
	private Employee[] employees;

	public Department() {
		this.name = Names.values()[index++].toString();
		this.manager = new Manager("Manager", indexManager++);
		this.manager.getSalary().setAmount(Math.random() * 25000 + 25000);
		this.employees = new Employee[15];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("Employee", indexEmployee++);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department: " + name + "\n\t\t ===manager===\n" + manager + "\n\t\t ===employees===\n"
				+ Arrays.toString(employees);
	}

}
