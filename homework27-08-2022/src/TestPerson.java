import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter id");
			int id = sc.nextInt();
			System.out.print("Enter age");
			int age = sc.nextInt();
			System.out.print("Enter name");
			String name = sc.next();
			Person p1 = new Person(id, name, age);
			System.out.println(p.toString());
		}

		sc.close();

	}

}
