package oop_test_preparation_exercise;

public class Food extends Product {
	public enum Foods {
		BASIC, CHEESE, MEAT, AWEETS;
	}

	private Foods foods;

	public Food(String name, double price, Foods foods) {
		super(name, price);
		this.foods = foods;
	}

	@Override
	public String toString() {
		return "Food: " + foods + "\n" + super.toString();
	}

}
