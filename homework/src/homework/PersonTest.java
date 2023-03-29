package homework;

public class PersonTest {

	public static void main(String[] args) {
		Person per = new Person();
		per.id = "204224505";
		per.name = "ruthi";
		per.age = 30;
		System.out.println(per.id + ","+ per.name +","+ per.age);
		per.growUpOneYear();
		System.out.println(per.age);
		per.setAgeToTen();
		System.out.println(per.age);
		per.setAgeToThirty();
		System.out.println(per.age);
		per.setAgeToTwenty();
		System.out.println(per.age);

	}

}
