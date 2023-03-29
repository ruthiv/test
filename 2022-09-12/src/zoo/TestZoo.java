package zoo;

import c.Ant;
import c.Bat;
import c.Butterfly;
import c.Dog;
import c.Hawk;
import c.Ostrich;

public class TestZoo {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Ant());
		zoo.addAnimal(new Bat());
		zoo.addAnimal(new Bat());
		zoo.addAnimal(new Hawk());
		zoo.addAnimal(new Butterfly());
		zoo.addAnimal(new Ostrich());

		// System.out.println(Arrays.toString(zoo.getMammals()));
		// System.out.println(Arrays.toString(zoo.getBirds()));
		// System.out.println(Arrays.toString(zoo.getInsects()));
		// System.out.println(Arrays.toString(zoo.getFlyers()));

		System.out.println(zoo.toString());

	}

}
