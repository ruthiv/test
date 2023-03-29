package car;

import java.util.Objects;

public class Car {
	private int number;
	private String color;
	private int speed;

	public Car(int number, String color, int speed) {
		super();
		this.number = number;
		this.color = color;
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void speadUp(int val) {
		if ((this.speed + val) > 200) {
			this.speed = 200;
		} else {
			this.speed += val;
		}
	}

	public void slowDown(int val) {
		if ((this.speed - val) < 0) {
			this.speed = 0;
		} else {
			this.speed -= val;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, number, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && number == other.number && speed == other.speed;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", color=" + color + ", speed=" + speed + "]";
	}

}
