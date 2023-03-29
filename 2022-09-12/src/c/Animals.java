package c;

public abstract class Animals {
	public abstract void Speak();

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
