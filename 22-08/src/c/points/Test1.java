package c.points;

public class Test1 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		animals[0] = new Animal();
		animals[1] = new Cat();
		animals[2] = new Dog();
		animals[3] = new Cow();
		animals[4] = new Poodel();

		animals[0].age = 8;
		animals[1].age = 2;
		animals[2].age = 11;
		animals[3].age = 3;
		animals[4].age = 7;

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getClass().getSimpleName() + ":age" + animals[i].age);
			animals[i].speak();
			if (animals[i] instanceof Cat) {
				Cat cat = (Cat) animals[i];
				cat.climb();
			}
		}

	}

}
