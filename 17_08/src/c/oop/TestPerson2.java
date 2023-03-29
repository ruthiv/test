package c.oop;

public class TestPerson2 {

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person(101, "aaa", 28);
		Person p2 = new Person(25);

		p.print();
		p1.print();
		p2.print();
	}

}
