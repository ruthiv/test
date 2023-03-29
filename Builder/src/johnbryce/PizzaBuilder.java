package johnbryce;

public class PizzaBuilder {
	private Pizza pizza = new Pizza();

	public PizzaBuilder setDiameter(int diameter) {
		pizza.setDiameter(diameter);
		return this;
	}

	public PizzaBuilder addTopping(String topping) {
		pizza.getToppings().add(topping);
		return this;
	}

	public PizzaBuilder cutToSlices(int slices) {
		pizza.setSlices(slices);
		;
		return this;
	}

	public Pizza build() {
		pizza.setMinutesInTheOven(pizza.getDiameter() + pizza.getToppings().size());
		pizza.setPrice(pizza.getDiameter() + 5 * pizza.getToppings().size());
		return pizza;
	}
}
