
public class TestFlower {

	public static void main(String[] args) {
		System.out.println(Flower.MAX_HEIGHT);

		Flower rose = new Flower();
		rose.setHeight(10);
		rose.setNumberOfPetals(30);

		System.out.print(rose.color + ", ");
		System.out.print(rose.getHeight() + ", ");
		System.out.println(rose.getNumberOfPetals());

		System.out.println("flower count: " + Flower.getCounter());

	}

}
