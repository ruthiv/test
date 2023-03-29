
public class Test {

	public static void main(String[] args) {
		SetOfPerson set = new SetOfPerson();
		for (int i = 101; i <= 125; i++) {
			Person p = new Person(i, "p" + i, (int) (Math.random() * 25) + 5);
			set.addPerson(p);
		}
		System.out.println(set);

		Person p = new Person();
		p.setId(123);
		System.out.println(set.contains(p));
	}

}
