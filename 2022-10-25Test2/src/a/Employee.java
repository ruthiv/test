package a;

public class Employee extends Person {

	private Salary salary;

	public Employee(String name, int index) {
		super(name, index);
		this.salary = new Salary();
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee\t" + super.toString() + "\tsalary=" + salary + "\n";
	}

}
