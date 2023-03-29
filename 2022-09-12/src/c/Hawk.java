package c;

import interfaces.Flyer;
import interfaces.Navigator;

public class Hawk extends Insect implements Flyer, Navigator {

	@Override
	public void Speak() {
		System.out.println("speak like an hawk");

	}

	@Override
	public void fly() {
		System.out.println("fly like a hawk");

	}

	@Override
	public void navigator() {
		System.out.println("navigate like a hawk");

	}

}
