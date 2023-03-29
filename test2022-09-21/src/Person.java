
public abstract class Person {
	private String name;
	private int age = (int) (Math.random() * 101 + 20);;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {

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
		if (age >= 20 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Enter age 20-120");
		}

	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

}
