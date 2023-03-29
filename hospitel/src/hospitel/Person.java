package hospitel;

public abstract class Person {
	private int id;
	private static int counter = 0;
	private String name;
	private int age;
	private static int n = 0;

	public Person(String name) {
		this.id = ++counter;
		this.name = name + (++n);
		this.age = (int) (Math.random() * 103 + 18);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\tid: " + id + " \tname=" + name + " \tage=" + age;
	}

}
