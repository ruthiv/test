package johnbryce;

import java.util.ArrayList;

public class Pizza {
	private int diameter = 50;
	private int slices = 8;
	private int minutesInTheOven;
	private double price;
	private ArrayList<String> toppings = new ArrayList<>();

	public void display() {
		System.out.println("Diameter: " + diameter);
		System.out.println("Slices: " + slices);
		System.out.println("minutes In The Oven: " + minutesInTheOven);
		System.out.println("price: " + price);
		System.out.println("toppings: ");
		for (String item : toppings) {
			System.out.print(item + " | ");
		}
		System.out.println();
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		this.slices = slices;
	}

	public int getMinutesInTheOven() {
		return minutesInTheOven;
	}

	public void setMinutesInTheOven(int minutesInTheOven) {
		this.minutesInTheOven = minutesInTheOven;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}

}
