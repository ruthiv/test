package c;

import interfaces.Flyer;

public class Bat extends Mammal implements Flyer {

	@Override
	public void Speak() {
		System.out.println("squeek");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");

	}

}
