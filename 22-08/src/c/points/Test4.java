package c.points;

public class Test4 {

	public static void main(String[] args) {
		Animal animal;
		animal = new Dog();
		makeAnimalSpeak(animal);
		Dog dog = new Dog();
		makeAnimalSpeak(dog);
		Cat cat = new Cat();
		makeAnimalSpeak(cat);

	}

	public static void makeAnimalSpeak(Animal animal) {
		animal.speak();
	}

}
