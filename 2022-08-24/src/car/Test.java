package car;

public class Test {

	public static void main(String[] args) {
		Car car = new Car(50, "red", 50);
		car.speadUp(200);
		System.out.println(car.getSpeed());
		car.slowDown(250);
		System.out.println(car.getSpeed());
	}

}
