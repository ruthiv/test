package c.oop;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age");
		p.setAge(sc.nextInt());
		sc.nextLine();
		
		System.out.print("Enter name");
		p.setName(sc.nextLine());
		
		
		System.out.print("Enter id");
		p.setId(sc.nextInt());
		sc.close();
		
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getId());
	}

}
