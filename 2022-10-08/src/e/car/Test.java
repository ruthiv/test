package e.car;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		c1.number = 123;
		c1.speed = 30;
		c1.color = "red";
		c2.number = 222;
		System.out.println(c1.number);
		System.out.println(c1.speed);
		System.out.println(c1.color);
		System.out.println(c2.number);
		c1.drive();
		System.out.println(c1.speed);
		c1.stop();
		System.out.println(c1.speed);
	}

}
