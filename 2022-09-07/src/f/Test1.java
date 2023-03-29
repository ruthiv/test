package f;

public class Test1 {

	public static void main(String[] args) {
		Superman superman = Superman.getInstance();
		superman.setAltitude(100);
		System.out.println(superman);

		Superman superman2 = Superman.getInstance();
		superman.setAltitude(150);
		System.out.println(superman2);

	}

}
