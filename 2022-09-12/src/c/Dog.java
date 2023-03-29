package c;

import interfaces.AdvencedFlyer;

public class Dog extends Mammal implements AdvencedFlyer {

	@Override
	public void Speak() {
		System.out.println("woof");

	}

	@Override
	public void fly() {
		System.out.println("fly like a dog");

	}

	@Override
	public void navigator() {
		System.out.println("navigator like a dog");

	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a dog");

	}

	@Override
	public void land() {
		System.out.println("land like a dog");
	}

}
