package rehearsal_for_the_test_oop;

public abstract class Person {
	private static int n = 0;
	private static int c = 0;
	private static int id = ++c;
	private static String name = "Person" + (++n);
	private int age = (int) (Math.random() * 103 + 18);

	public Person() {

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " id:" + id + ", name: " + name + ", age=" + age;
	}

}
