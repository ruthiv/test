package cars;

public class Test1Car {

	public static void main(String[] args) {
		Car car = new Car();
		car.setNumber(125487);
		car.setSpeed(120);
		System.out.println(car.getNumber());
		System.out.println(car.getSpeed());
		System.out.println(car);

	}

}
