package homework;

public class AirplaneTest {

	public static void main(String[] args) {
		Airplane a = new Airplane();
		a.altitude=0;
		a.direction=0;
		a.goHigher10Yards();
		System.out.println(a.altitude);
		a.goLower10Yards();
		System.out.println(a.altitude);
		a.turnNorth();
		System.out.println(a.direction);
		a.turnEast();
		System.out.println(a.direction);
		a.turnSouth();
		System.out.println(a.direction);
		a.turnWest();
		System.out.println(a.direction);
		
	}

}
