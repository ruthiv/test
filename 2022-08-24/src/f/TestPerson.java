package f;

public class TestPerson {

	public static void main(String[] args) {
		Person[] persons = new Person[25];
		String[] names = { "Dan", "Dina", "Bar", "Roz" };
		for (int i = 0, id = 101; i < persons.length; i++, id++) {
			String name = names[(int) (Math.random() * names.length)];
			int age = (int) (Math.random() * 50);
			Person p = new Person(id, name, age);
			persons[i] = p;
			System.out.println(persons[i]);

		}

	}

}
