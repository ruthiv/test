package johnbryce;

public class Program {

	public static void main(String[] args) {
		Pizza pizza = new PizzaBuilder().setDiameter(60).addTopping("Extra Cheese").addTopping("Olives")
				.addTopping("Mushrooms").addTopping("Anchovy").cutToSlices(8).build();

		pizza.display();

	}

}
