package c.oop;

public class Person {
	// attributes - define the object set of data
	private int id;
	private String name;
	private int age;

	// constructors
	public Person() {

	}

	public Person(int id, String name, int age) {
		setId(id);
		setName(name);
		setAge(age);
	}

	public Person(int id) {
		setId(id);
	}

	// methods
	public void setAge(int theNewAge) {
		if (theNewAge >= 0 && theNewAge <= 120) {
			age = theNewAge;
		}
	}

	public int getAge() {
		return age;
	}

	public void setId(int theNewId) {
		if (theNewId > 0) {
			id = theNewId;
		}
	}

	public int getId() {
		return id;
	}

	public void setName(String theNewName) {
		if (theNewName.length() < 25) {
			name = theNewName;
		}
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("Person [id=" + id + ", name=" + name + ", age=" + age + "]");
	}
}
