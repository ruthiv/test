package c;

import interfaces.Navigator;

public class Ant extends Insect implements Navigator {

	@Override
	public void Speak() {
		System.out.println("speak like an ant");

	}

	@Override
	public void navigator() {
		System.out.println("navigate like an ant");

	}

}
