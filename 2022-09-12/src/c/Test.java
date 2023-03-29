package c;

import interfaces.AdvencedFlyer;
import interfaces.Flyer;
import interfaces.Navigator;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Animals[] animals = new Animals[10];
		animals[0] = new Dog();
		animals[1] = new Ant();
		animals[2] = new Hawk();
		animals[3] = new Bat();
		animals[4] = new Ostrich();
		animals[5] = new Butterfly();
		animals[6] = new Dog();
		animals[7] = new Ant();
		animals[8] = new Dog();
		animals[9] = new Ostrich();

		for (int i = 0; i < animals.length; i++) {
			Thread.sleep(200);
			Animals animal = animals[i];
			System.out.print(animal.getClass().getSimpleName() + ": ");
			Thread.sleep(500);
			animal.Speak();
			Thread.sleep(200);
			Thread.sleep(200);

			if (animals[i] instanceof AdvencedFlyer) {
				AdvencedFlyer advencedFlyer = (AdvencedFlyer) animals[i];
				advencedFlyer.fly();
				advencedFlyer.land();
				advencedFlyer.navigator();
				advencedFlyer.takeOff();
			} else {
				if (animal instanceof Flyer) {
					Flyer flyer = (Flyer) animal;
					flyer.fly();
				}
				Thread.sleep(200);
				if (animal instanceof Navigator) {
					Thread.sleep(200);
					Navigator navigator = (Navigator) animal;
					navigator.navigator();
				}
			}
			System.out.println("============");
			Thread.sleep(200);

		}

	}

}
