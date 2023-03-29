package a;

public abstract class Person {
	private String name;
	private int age;

	public Person(String name, int index) {
		this.name = name + index;
		this.age = (int) ((Math.random() * 41) + 20);
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

	@Override
	public String toString() {
		return " name= " + name + " age= " + age;
	}

}
