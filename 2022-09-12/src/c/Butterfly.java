package c;

import interfaces.Flyer;

public class Butterfly extends Insect implements Flyer {

	@Override
	public void Speak() {
		System.out.println("speak like an butterfly");
	}

	@Override
	public void fly() {
		System.out.println("fly like a butterfly");

	}

}
